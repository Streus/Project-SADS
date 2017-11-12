package gui.commands;

import gui.Console;

public class ClearCommand extends Command
{
	public ClearCommand(String name)
	{
		super(name);
	}

	@Override
	public String getHelp()
	{
		return "Clears the output of the CLI.";
	}

	@Override
	public int execute(String[] args)
	{
		try
		{
			Console.clear();
		}
		catch(NullPointerException npe)
		{
			return 1;
		}
		return 0;
	}

}
