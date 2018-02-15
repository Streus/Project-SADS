package gui.commands;

import gui.Console;
import gui.MainWindow;

public class DebugCommand extends Command
{
	@Override
	public String getHelp()
	{
		return "Toggles the developer debug mode on/off";
	}

	@Override
	public int execute(String[] args)
	{
		MainWindow.DEBUG = !MainWindow.DEBUG;
		Console.println("Debug Mode is now " + (MainWindow.DEBUG ? "on" : "off") + ".");
		Console.println("[WARNING] Debug Mode is not fully implemented. Use at your own risk.", Console.WRN);
		return 0;
	}

}
