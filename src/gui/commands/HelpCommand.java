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
		return "Displays general help for the console. For help with engine commands, go to the Help tab.";
	}
	
	@Override
	public String getUsage()
	{
		String base = super.getUsage();
		return base + " [command name]";
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
					Console.print("[" + commands[i].getName() + "]", Console.getHdr());
					Console.println(" - " + commands[i].getUsage());
					Console.println(commands[i].getHelp());
					return 0;
				}
			}
			Console.println("Command: " + args[1] + " does not exist.", Console.getErr());
			return 1;
		}
		//print out general help
		else
		{
			Console.println("Usage Key: <> = required arg, [] = optional arg");
			
			for(int i = 0; i < commands.length; i++)
			{
				Console.print("\n[" + commands[i].getName() + "]", Console.getHdr());
				Console.println(" - " + commands[i].getUsage());
				Console.println("  " + commands[i].getHelp());
			}
			return 0;
		}
	}

}
