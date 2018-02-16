package gui;

import java.io.File;

import javax.swing.JTextPane;

public class Editor
{
	/* Static Vars */
	
	
	/* Static Methods */
	
	
	/* Instance Vars */
	
	// The GUI element this Editor acts upon
	private JTextPane area;
	
	// The file currently open is this Editor
	private File currentFile;
	
	/* Instance Methods */
	
	public Editor(JTextPane area)
	{
		this.area = area;
	}
}
