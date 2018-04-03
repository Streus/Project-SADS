package gui.commands;

public abstract class Command
{
	private String name;
	
	public Command(String name)
	{
		this.name = name;
	}
	
	public final String getName()
	{
		return name;
	}
	
	/**
	 * @return A custom-made help string for this Command
	 */
	public abstract String getHelp();
	
	/**
	 * @return A nicely formatted string outlining argument structure for this Command
	 */
	public String getUsage()
	{
		return "/" + name;
	}
	
	/**
	 * Perform this command
	 * @param args - The arguments following the Command
	 * @return Whatever output the Command produced
	 */
	public abstract int execute(String[] args);
}
