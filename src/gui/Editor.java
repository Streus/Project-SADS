package gui;

import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Editor
{
	/* Static Vars */
	
	
	/* Static Methods */
	
	
	/* Instance Vars */
	
	// The GUI element this Editor acts upon
	private JTextPane area;
	
	// The file currently open is this Editor
	private File currentFile;
	
	// Whether changes have been made to the subject file since the last save 
	private boolean unsavedChanges;
	
	//A listener that raises the unsavedChanges flag
	private DocumentListener changesListener;
	
	/* Instance Methods */
	
	public Editor(JTextPane area)
	{
		this(area, null);
	}
	public Editor(JTextPane area, File currentFile)
	{
		this.area = area;
		this.currentFile = currentFile;
		unsavedChanges = false;
		changesListener = new DocumentListener() {
			/**
			 * Track changes made to the currently open document
			 */
			@Override
			public void changedUpdate(DocumentEvent arg0)
			{
				unsavedChanges = true;
				System.out.println("There are now unsaved changes."); //DEBUG
			}
			@Override
			public void insertUpdate(DocumentEvent arg0)
			{
				unsavedChanges = true;
				System.out.println("There are now unsaved insertions."); //DEBUG
			}
			@Override
			public void removeUpdate(DocumentEvent arg0)
			{
				unsavedChanges = true;
				System.out.println("There are now unsaved deletions."); //DEBUG
			}
		};
		
		area.getDocument().addDocumentListener(changesListener);
	}
	
	/**
	 * Saves the currently open file under the specified name
	 * @param name - the name given to the new file
	 * @return the success of the operation
	 */
	public boolean saveAs(String name)
	{
		unsavedChanges = false;
		return false;
	}
	
	/**
	 * Saves the currently open file under its existing name
	 * @return the success of the operation
	 */
	public boolean save()
	{
		unsavedChanges = false;
		return false;
	}
	
	/**
	 * Opens the specified file in this editor
	 * @param f - the file to open
	 * @return the success of the operation
	 */
	public boolean open(File f)
	{
		if(resolveUnsavedChanges())
		{
			
		}
		return false;
	}
	
	/**
	 * Closes this editor, prompting the user to save unsaved changes ifex
	 * @return the success of the operation
	 */
	public boolean close()
	{
		return false;
	}
	
	private boolean resolveUnsavedChanges()
	{
		//check if any changes have not been saved
		if(unsavedChanges)
		{
			int option = JOptionPane.showConfirmDialog(area.getRootPane(), "There are unsaved changes. Would you like to save?", "Save?", JOptionPane.YES_NO_CANCEL_OPTION);
			switch(option)
			{
			case JOptionPane.YES_OPTION:
				//save the contents of editorArea
				save();
				unsavedChanges = false;
				break;
				
			case JOptionPane.NO_OPTION:
				//just continue with the opening procedure
				
				break;
				
			case JOptionPane.CANCEL_OPTION:
				//back out of opening a file
				return false;
			}
		}
		return true;
	}
}
