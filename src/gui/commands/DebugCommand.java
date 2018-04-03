package gui.commands;

import java.io.PrintStream;

import gui.Console;
import gui.MainWindow;

public class DebugCommand extends Command
{
	private PrintStream defaultOut, defaultErr;
	
	public DebugCommand(String name)
	{
		super(name);
	}

	@Override
	public String getHelp()
	{
		return "Toggles the developer debug mode on/off";
	}

	@Override
	public int execute(String[] args)
	{
		MainWindow.DEBUG = !MainWindow.DEBUG;
		Console.println("Debug Mode is now " + (MainWindow.DEBUG ? "on" : "off") + ".", Console.getWrn());
		
		//redirect out and err, or set them back to the defaults
		if(defaultOut == null && defaultErr == null)
		{
			//save defaults
			defaultOut = System.out;
			defaultErr = System.err;
			
			//redirect to console's debug print stream
			System.setOut(Console.instance().getDebugStream());
			System.setErr(Console.instance().getDebugStream());
		}
		else
		{
			//reset back to defaults
			System.setOut(defaultOut);
			System.setErr(defaultErr);
			
			//throw out default references
			defaultOut = defaultErr = null;
		}
		
		return 0;
	}
}
