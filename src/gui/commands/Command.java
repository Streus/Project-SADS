package gui.commands;

public abstract class Command
{
	private String name;
	
	public Command(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * @return A custom-made help string for this Command
	 */
	public abstract String getHelp();
	
	/**
	 * Perform this command
	 * @param args - The arguments following the command
	 * @return Whatever output the Command produced
	 */
	public abstract int execute(String[] args);
}
