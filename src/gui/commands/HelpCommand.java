package gui.commands;

import gui.Console;

public class HelpCommand extends Command
{
	public HelpCommand(String name)
	{
		super(name);
	}

	@Override
	public String getHelp()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int execute(String[] args)
	{
		Command[] commands = Console.getCommands();
		
		//print out help for a specific command
		if(args.length > 1)
		{
			for(int i = 0; i < commands.length; i++)
			{
				if(commands[i].getName().equalsIgnoreCase(args[1]))
				{
					Console.println(commands[i].getName());
					Console.println(commands[i].getHelp());
					return 0;
				}
			}
			Console.println("Command: " + args[1] + " does not exist.", Console.getErr());
			return 1;
		}
		//print out help for all commands
		else
		{
			for(int i = 0; i < commands.length; i++)
			{
				Console.println("[" + commands[i].getName() + "]", Console.getHdr());
				Console.println("  " + commands[i].getHelp());
			}
			return 0;
		}
	}

}
