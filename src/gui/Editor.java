package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Editor
{
	private static final String UNSAVED_NAME = "unnamed";
	
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
		
		this.area.getDocument().addDocumentListener(changesListener);
	}
	
	/**
	 * Helper for save() and saveAs()
	 * @param f - the file to which text will be written
	 * @return the success of the operation
	 */
	private boolean writeFile(File f)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
			writer.write(area.getText());
			writer.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * Saves the currently open file under the specified name
	 * @param name - the name given to the new file
	 * @return the success of the operation
	 */
	public boolean saveAs()
	{
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogType(JFileChooser.SAVE_DIALOG);
		
		int val = chooser.showSaveDialog(area.getRootPane());
		File f = null;
		
		if(val == JFileChooser.APPROVE_OPTION)
			f = chooser.getSelectedFile();
		else
			return false;
		
		unsavedChanges = !writeFile(f);
		return !unsavedChanges;
	}
	
	/**
	 * Saves the currently open file under its existing name
	 * @return the success of the operation
	 */
	public boolean save()
	{
		if(currentFile == null)
			return saveAs();
		
		unsavedChanges = !writeFile(currentFile);
		return !unsavedChanges;
	}
	
	/**
	 * Opens the specified file in this editor
	 * @return the success of the operation
	 */
	public boolean open()
	{
		if(resolveUnsavedChanges())
		{
			area.setText("");
			
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogType(JFileChooser.OPEN_DIALOG);
			int val = chooser.showOpenDialog(area.getRootPane());
			File f = null;
			if(val == JFileChooser.APPROVE_OPTION)
				f = chooser.getSelectedFile();
			else
				return false;
			
			return setFile(f);
		}
		return false;
	}
	
	/**
	 * Set the currently open file in this editor
	 * @param f - the file to open in this editor
	 * @return the success of the operation
	 */
	public boolean setFile(File f)
	{
		currentFile = f;
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(currentFile));
			area.read(reader, reader);
			reader.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			return false;
		}
		
		area.getDocument().addDocumentListener(changesListener);
		unsavedChanges = false;
		
		return true;
	}
	
	/**
	 * Get the file currently open in this editor
	 * @return what the fuck do you think?
	 */
	public File getFile()
	{
		return currentFile;
	}
	
	/**
	 * Get the name of the file currently open in this editor
	 * @return the name of the file, or 'unnamed' if the file is null
	 */
	public String getFileName()
	{
		if(currentFile != null)
			return currentFile.getName();
		return UNSAVED_NAME;
	}
	
	/**
	 * Closes this editor, prompting the user to save unsaved changes ifex
	 * @return the success of the operation
	 */
	public boolean close()
	{
		return resolveUnsavedChanges();
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
	
	public boolean isUnsaved()
	{
		return unsavedChanges;
	}
}
