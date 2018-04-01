package gui;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import gui.commands.*;

public final class Console
{
	/* Constants */
	
	private static final String COMMAND_FLAG = "/";
	
	// Identify unique styles used in the Console output
	private static final int OUT = 0; //output
	private static final int ERR = 1; //error
	private static final int WRN = 2; //warning
	private static final int HDR = 3; //header
	private static final int DBG = 4; //debug
	
	/* Static Vars */
	
	// The singleton Console instance
	private static Console inst;
	
	// The list of all invokable commands
	private static HashMap<String, Command> commandList;
	static
	{
		//build the command list
		commandList = new HashMap<String, Command>();
		
		commandList.put("clear", new ClearCommand("clear"));
		commandList.put("debug", new DebugCommand("debug"));
		commandList.put("exec", new ExecCommand("exec"));
		commandList.put("exit", new ExitCommand("exit"));
		commandList.put("help", new HelpCommand("help"));
	}
	
	// All available styles in the CLI
	private static SimpleAttributeSet[] styles;
	static
	{
		//output
		styles = new SimpleAttributeSet[5];
		styles[OUT] = new SimpleAttributeSet();
		StyleConstants.setForeground(styles[OUT], Color.white);
		
		//error
		styles[ERR] = new SimpleAttributeSet();
		StyleConstants.setForeground(styles[ERR], Color.red);
		StyleConstants.setBold(styles[ERR], true);
		
		//warning
		styles[WRN] = new SimpleAttributeSet();
		StyleConstants.setForeground(styles[WRN], Color.yellow);
		StyleConstants.setBold(styles[WRN], true);
		
		//header
		styles[HDR] = new SimpleAttributeSet();
		StyleConstants.setForeground(styles[HDR], Color.white);
		StyleConstants.setBold(styles[HDR], true);
		
		//debug
		styles[DBG] = new SimpleAttributeSet();
		StyleConstants.setForeground(styles[DBG], Color.gray);
		StyleConstants.setBold(styles[DBG], true);
	}
	
	/* Instance Vars */
	
	// The history of commands entered in this session
	private ArrayList<String> history;
	private int historyIndex;
	
	// The GUI the Console operates upon
	private JTextPane front;
	
	private PrintStream debugStream;
	
	/* Static Methods */
	
	/**
	 * Gets the ref to the singleton instance ifex, else creates a new instance
	 * @return A reference to the singleton instance
	 */
	public static Console instance()
	{
		if(inst == null)
			inst = new Console();
		return inst;
	}
	
	/**
	 * Get a list of all the commands that can be run by the Console
	 * @return a list of Command objects being managed by this Console
	 */
	public static Command[] getCommands()
	{
		Collection<Command> set = commandList.values();
		Command[] commands = new Command[set.size()];
		commands = set.toArray(commands);
		return commands;
	}
	
	/**
	 * Print to the current Console instance UI output
	 * @param s - the text to print
	 */
	public static void print(String s)
	{
		print(s, OUT);
	}
	public static void print(String s, int type)
	{
		try
		{
			sendToFront(s, styles[type]);
		}
		catch(IndexOutOfBoundsException ioobe)
		{
			System.err.println("Invalid text style " + ioobe.getMessage() + ".");
		}
		catch(NullPointerException npe)
		{
			if(type == getErr())
				System.err.print(s);
			else
				System.out.print(s);
		}
	}
	
	/**
	 * Print to the current Console instance UI, appending a newline
	 * @param s - the text to print
	 */
	public static void println(String s)
	{
		println(s, OUT);
	}
	public static void println(String s, int type)
	{
		print(s + "\n", type);
	}
	
	/**
	 * Remove all text from the current Console's output
	 */
	public static void clear()
	{
		Document d = instance().front.getDocument();
		try { d.remove(0, d.getLength()); }
		catch (BadLocationException e)
		{
			System.err.println("Encountered an error clearing the console. " + e.getMessage());
		}
	}
	
	/**
	 * @return - the default output type
	 */
	public static int getOut()
	{
		return OUT;
	}
	
	/**
	 * @return - the error output type
	 */
	public static int getErr()
	{
		return ERR;
	}
	
	/**
	 * @return - the output type for warnings
	 */
	public static int getWrn()
	{
		return WRN;
	}
	
	/**
	 * @return - the output type for headers
	 */
	public static int getHdr()
	{
		return HDR;
	}
	
	/**
	 * @return - the output type for redirected debug output
	 */
	public static int getDbg()
	{
		return DBG;
	}
	
	private static void sendToFront(String text, SimpleAttributeSet set)
	{
		try
		{
			StyledDocument frontDoc = instance().front.getStyledDocument();
			frontDoc.insertString(frontDoc.getLength(), text, set);
		}
		catch(BadLocationException ble) { }
	}
	
	/* Instance Methods */
	private Console()
	{
		history = new ArrayList<String>();
		historyIndex = 0;
		
		//add an empty entry to the history so that a clear line can be selected
		history.add("");
		
		front = null;
		
		debugStream = null;
	}
	
	/**
	 * A PrintStream used to redirect System.out and System.err to the console.
	 */
	public PrintStream getDebugStream()
	{
		return debugStream;
	}
	
	/**
	 * Take the user input and check it for valid CLI commands
	 * @param input - the input string
	 * @return A boolean indicating whether a command was run
	 */
	public int processInput(String input)
	{
		if(!input.startsWith(COMMAND_FLAG))
			return -1;
		
		String[] args = input.substring(1).split(" ");
		
		int success = 1;
		
		if(commandList.containsKey(args[0]))
		{
			try
			{
				success =  commandList.get(args[0]).execute(args);
			}
			catch(Exception e)
			{
				println("Command \"" + args[0] + "\" encountered a problem.\n" + e.toString(), ERR);
				e.printStackTrace();
			}
		}
		else
			println("Command \"" + args[0] + "\" could not be found.", ERR);
		
		return success;
	}
	
	/**
	 * Add an entry to the history
	 * @param entry - The String to be added
	 */
	public void addToHistory(String entry)
	{
		history.add(history.size() - 1, entry);
		historyIndex = history.size() - 1;
	}
	
	/**
	 * 
	 * @param n - The direction (positive or negative) to navigate in the history
	 * @return The selected entry in the history after navigation
	 */
	public String navigateHistory(int n)
	{
		historyIndex += Integer.signum(n);
		if(historyIndex < 0)
			historyIndex = 0;
		else if(historyIndex > history.size() - 1)
			historyIndex = history.size() - 1;
		
		return history.get(historyIndex);
	}
	
	/**
	 * Tie the singleton instance to a GUI instance
	 * @param front - a reference to the GUI instance
	 */
	public void setFront(JTextPane front)
	{
		front.removeStyle("out");
		front.removeStyle("err");
		front.removeStyle("wrn");
		front.removeStyle("hdr");
		front.removeStyle("dbg");
		this.front = front;
		front.addStyle("out", null).addAttribute("outStyle", styles[OUT]);
		front.addStyle("err", null).addAttribute("errStyle", styles[ERR]);
		front.addStyle("wrn", null).addAttribute("wrnStyle", styles[WRN]);
		front.addStyle("hdr", null).addAttribute("hdrStyle", styles[HDR]);
		front.addStyle("dbg", null).addAttribute("dbgStyle", styles[DBG]);
		
		if(front != null)
		{
			debugStream = new PrintStream(new DebugOutputStream(front, getDbg()));
		}
	}
	
	private static class DebugOutputStream extends OutputStream
	{
		private int textType;
		private JTextPane area;
		
		public DebugOutputStream(JTextPane area, int textType)
		{
			this.area = area;
			this.textType = textType;
		}
		
		@Override
		public void write(int b) throws IOException
		{
			Console.print(String.valueOf((char)b), textType);
		}
	}
}
