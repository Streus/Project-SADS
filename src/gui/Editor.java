package gui;

public class Editor
{
	/* Static Vars */
	
	private static Editor inst;
	
	/* Static Methods */
	
	public static Editor instance()
	{
		if(inst == null)
			inst = new Editor();
		return inst;
	}
	
	/* Instance Vars */
	
	
	/* Instance Methods */
	
	private Editor()
	{
		
	}
}
