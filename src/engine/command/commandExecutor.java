package engine.command;

import java.util.EmptyStackException;
import java.util.Stack;
import grammar.CommandObject;
import gui.Console;

public class commandExecutor {
	
	//default YEE
	public commandExecutor() {
		
	}
	/**
	 * Handles a stack of command objects from AntlrBridge.java and returns input to the GUI
	 * 
	 * @param cmdObj - the stack containing all of the command objects to be processed 
	 * @throws EmptyStackException
	 */
	public static void executeStack(Stack<CommandObject> cmdObj) throws EmptyStackException {
		
		try {
			CommandObject obj = cmdObj.pop();
			CommandResponse resp = (CommandResponse) obj.execute();
			Console.println("Response from commandExecutor: " + resp.returnVal.toString());
		}
		catch (NullPointerException e) {
			Console.println(e.getMessage());
			throw e;
		}
	}
}
