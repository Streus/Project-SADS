package engine.command;

import java.util.Stack;
import grammar.CommandObject;
import gui.Console;

public class commandExecutor {
	
	//defualt
	public commandExecutor() {
		
	}

	public static void executeStack(Stack<CommandObject> cmdObj) {
		
		Console.instance();
		
		CommandObject obj = cmdObj.pop();
		
		CommandResponse resp = obj.execute();
		
		Console.print("Response from commandExecutor: " + resp.returnVal);
	}

}
