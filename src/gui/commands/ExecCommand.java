package gui.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import grammar.AntlrBridge;
import gui.Console;

public class ExecCommand extends Command
{
	public ExecCommand(String name)
	{
		super(name);
	}

	@Override
	public String getHelp()
	{
		return "Attempts to execute a command file.";
	}
	
	@Override
	public String getUsage()
	{
		String base = super.getUsage();
		return base + " <file path>";
	}

	@Override
	public int execute(String[] args)
	{
		if(args.length < 2)
		{
			Console.println("Missing file argument!", Console.getErr());
			return 1;
		}
		
		File execFile = new File(args[1]);
		if(execFile.exists())
		{
			String fileText = "";
			try
			{
				BufferedReader reader = new BufferedReader(new FileReader(execFile));
				String line;
				while((line = reader.readLine()) != null)
				{
					fileText += line;
				}
				
				reader.close();
				
			}
			catch (IOException e)
			{
				Console.println("Provided file: " + args[1] + " does not exist!", Console.getErr());
				return 1;
			}
			
			new AntlrBridge(fileText);
		}
		else
		{
			Console.println("Provided file: " + args[1] + " does not exist!", Console.getErr());
			return 1;
		}
		
		return 0;
	}
}
