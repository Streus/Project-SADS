package gui;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultCaret;
import javax.swing.text.JTextComponent;
import javax.swing.event.CaretEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import grammar.AntlrBridge;

public class MainWindow
{
	public static final String UNSAVED_INDICATOR = "*";
	
	public static boolean DEBUG;
	
	private int currentEditor;
	private ArrayList<Editor> editors;
	
	//The file to which output dumps will be saved
	private File currentOutputDump;
	
	private DocumentListener changesIndicatorListener;
	
	private JFrame frmStringSequenceAnalyzer;
	private JTextField inputLine;
	private JButton btnEnter;
	private JLabel lblCursorposdisplay;
	private JMenuItem mntmSaveBatchAs;
	private JMenuItem mntmSaveBatch;
	private JMenuItem mntmSaveResultsAs;
	private JTabbedPane tabbedPane;
	private JLabel lblFilename;
	private JTextPane outputArea;
	private JTextPane editorArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		if(args.length > 0)
			DEBUG = args[0].equalsIgnoreCase("debug");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmStringSequenceAnalyzer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		
		editors = new ArrayList<Editor>();
		editors.add(new Editor(editorArea));
		currentEditor = 0;
		
		currentOutputDump = null;
		
		//Create a Console singleton if one has not already been instantiated
		Console.instance().setFront(outputArea);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStringSequenceAnalyzer = new JFrame();
		frmStringSequenceAnalyzer.setTitle("String Sequence Analyzer - v0.1.0");
		frmStringSequenceAnalyzer.setBounds(100, 100, 800, 600);
		frmStringSequenceAnalyzer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Courier New", Font.PLAIN, 15));
		frmStringSequenceAnalyzer.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(UIManager.getFont("InternalFrame.titleFont"));
		mnFile.setMnemonic('f');
		menuBar.add(mnFile);
		
		JMenuItem mntmNewBatch = new JMenuItem("New Batch...");
		mntmNewBatch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNewBatch.addActionListener(new ActionListener() {
			/**
			 * User creates a new batch file
			 */
			public void actionPerformed(ActionEvent arg0)
			{
				//select the editor tab
				tabbedPane.setSelectedIndex(1);
				
				//TODO open new editor
				editors.set(0, new Editor(editorArea));
				editorArea.getDocument().addDocumentListener(changesIndicatorListener);
			}
		});
		mnFile.add(mntmNewBatch);
		
		JMenuItem mntmOpenBatch = new JMenuItem("Open Batch...");
		mntmOpenBatch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmOpenBatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				tabbedPane.setSelectedIndex(1);
				
				editors.get(0).open();
				lblFilename.setText(editors.get(0).getFileName());
				editorArea.getDocument().addDocumentListener(changesIndicatorListener);
			}
		});
		mnFile.add(mntmOpenBatch);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		mntmSaveBatch = new JMenuItem("Save Batch");
		mntmSaveBatch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSaveBatch.addActionListener(new ActionListener() {
			/**
			 * Basic save operation for the Editor
			 */
			public void actionPerformed(ActionEvent e)
			{
				editors.get(0).save();
				lblFilename.setText(editors.get(0).getFileName());
			}
		});
		mnFile.add(mntmSaveBatch);
		
		mntmSaveBatchAs = new JMenuItem("Save Batch As...");
		mntmSaveBatchAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mntmSaveBatchAs.addActionListener(new ActionListener() {
			/**
			 * Save and specify file for Editor
			 */
			public void actionPerformed(ActionEvent e)
			{
				editors.get(0).saveAs();
				lblFilename.setText(editors.get(0).getFileName());
			}
		});
		mnFile.add(mntmSaveBatchAs);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmSaveResults = new JMenuItem("Save Results");
		mntmSaveResults.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmSaveResults.addActionListener(new ActionListener() {
			/**
			 * Basic save for CLI output
			 */
			public void actionPerformed(ActionEvent e)
			{
				//TODO saving results
				//save(currentOutputDump, outputArea.getText());
			}
		});
		mnFile.add(mntmSaveResults);
		
		mntmSaveResultsAs = new JMenuItem("Save Results As...");
		mntmSaveResultsAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.ALT_MASK | InputEvent.SHIFT_MASK));
		mntmSaveResultsAs.addActionListener(new ActionListener() {
			/**
			 * Save an specify file for CLI output
			 */
			public void actionPerformed(ActionEvent e)
			{
				//TODO saving results
				//currentOutputDump = saveAs(outputArea.getText());
			}
		});
		mnFile.add(mntmSaveResultsAs);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mntmExit.addActionListener(new ActionListener() {
			/**
			 * User manually exits the application
			 */
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setMnemonic('e');
		menuBar.add(mnEdit);
		
		JMenuItem mntmInsertFilePath = new JMenuItem("Insert File Path...");
		mntmInsertFilePath.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		mntmInsertFilePath.addActionListener(new ActionListener() {
			/**
			 * Browse for a file for which to add a path to in the input line
			 */
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser chooser = new JFileChooser();
				chooser.setDialogType(JFileChooser.OPEN_DIALOG);
				int retVal = chooser.showOpenDialog(frmStringSequenceAnalyzer);
				File f = null;
				if(retVal == JFileChooser.APPROVE_OPTION)
					f = chooser.getSelectedFile();
				else
					return;
				
				if(!inputLine.getText().endsWith(" "))
					inputLine.setText(inputLine.getText() + " ");
				
				inputLine.setText(inputLine.getText() + f.getAbsolutePath());
			}
		});
		mnEdit.add(mntmInsertFilePath);
		
		JMenu mnView = new JMenu("View");
		mnView.setMnemonic('v');
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmDocumentation = new JMenuItem("Documentation");
		mntmDocumentation.addActionListener(new ActionListener() {
			/**
			 * Open Documentation
			 */
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					URI doc = getClass().getResource("/res/doc.html").toURI();
					
					if(DEBUG)
						System.out.println("Doc Resource is at " + doc.toString());
					
					if(Desktop.isDesktopSupported())
					{
						Desktop.getDesktop().browse(doc);
					}
				}
				catch (IOException | URISyntaxException e)
				{
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
			}
		});
		mnHelp.add(mntmDocumentation);
		frmStringSequenceAnalyzer.getContentPane().setLayout(new BoxLayout(frmStringSequenceAnalyzer.getContentPane(), BoxLayout.X_AXIS));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(UIManager.getFont("InternalFrame.titleFont"));
		frmStringSequenceAnalyzer.getContentPane().add(tabbedPane);
		
		JPanel cli_view = new JPanel();
		cli_view.setBorder(null);
		tabbedPane.addTab("Command Line", null, cli_view, null);
		tabbedPane.setEnabledAt(0, true);
		tabbedPane.setDisplayedMnemonicIndexAt(0, 1);
		tabbedPane.setMnemonicAt(0, 1);
		cli_view.setLayout(new MigLayout("", "[2px][grow][]", "[][2px][grow][]"));
		
		JToolBar cliToolBar = new JToolBar();
		cliToolBar.setFloatable(false);
		cli_view.add(cliToolBar, "flowx,cell 0 0 3 1");
		
		JPanel panel = new JPanel();
		cliToolBar.add(panel);
		
		JLabel lblcliFontSize = new JLabel("Font Size");
		panel.add(lblcliFontSize);
		
		JSpinner cliFontSize = new JSpinner();
		cliFontSize.addChangeListener(new ChangeListener() {
			/**
			 * Set the font size of the CLI
			 */
			public void stateChanged(ChangeEvent e)
			{
				int size = (int)cliFontSize.getModel().getValue();
				setFontSize(outputArea, size);
				setFontSize(inputLine, size > 24 ? 24 : size);
			}
		});
		cliFontSize.setModel(new SpinnerNumberModel(13, 8, 72, 1));
		panel.add(cliFontSize);
		
		JCheckBox chckbxCliwordwrap = new JCheckBox("Word Wrap");
		cliToolBar.add(chckbxCliwordwrap);
		
		scrollPane = new JScrollPane();
		cli_view.add(scrollPane, "cell 0 1 3 2,grow");
		
		outputArea = new JTextPane();
		outputArea.setForeground(Color.WHITE);
		outputArea.setBackground(Color.BLACK);
		outputArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		outputArea.setEditable(false);
		scrollPane.setViewportView(outputArea);
		
		//auto-scroll
		((DefaultCaret)outputArea.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		inputLine = new JTextField();
		inputLine.setFont(new Font("Courier New", Font.PLAIN, 13));
		inputLine.addKeyListener(new KeyAdapter() {
			/**
			 * Input line pushing input text somewhere
			 */
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					sendInToOut();
				
				if(e.getKeyCode() == KeyEvent.VK_UP)
					inputLine.setText(Console.instance().navigateHistory(-1));
				
				if(e.getKeyCode() == KeyEvent.VK_DOWN)
					inputLine.setText(Console.instance().navigateHistory(1));
			}
		});
		cli_view.add(inputLine, "cell 0 3 2 1,grow");
		inputLine.setColumns(10);
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(UIManager.getFont("InternalFrame.titleFont"));
		btnEnter.setToolTipText("Run what's currently in the input line.");
		btnEnter.addMouseListener(new MouseAdapter() {
			/**
			 * Tell the input line to push input somewhere
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sendInToOut();
			}
		});
		cli_view.add(btnEnter, "cell 2 3");
		
		JPanel editor_view = new JPanel();
		editor_view.setBorder(null);
		tabbedPane.addTab("Editor", null, editor_view, null);
		tabbedPane.setEnabledAt(1, true);
		tabbedPane.setDisplayedMnemonicIndexAt(1, 2);
		tabbedPane.setMnemonicAt(1, 2);
		editor_view.setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		
		JToolBar editorToolBar = new JToolBar();
		editorToolBar.setFloatable(false);
		editor_view.add(editorToolBar, "cell 0 0");
		
		JPanel panel_1 = new JPanel();
		editorToolBar.add(panel_1);
		
		JLabel lbleditorFontSize = new JLabel("Font Size");
		panel_1.add(lbleditorFontSize);
		
		JSpinner editorFontSize = new JSpinner();
		editorFontSize.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0)
			{
				int size = (int)editorFontSize.getModel().getValue();
				setFontSize(editorArea, size);
				lblFilename.setFont(lblFilename.getFont().deriveFont((float)size));
			}
		});
		editorFontSize.setModel(new SpinnerNumberModel(13, 8, 72, 1));
		panel_1.add(editorFontSize);
		
		JCheckBox editorWordWrap = new JCheckBox("Word Wrap");
		editorWordWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//TODO editor word wrap
			}
		});
		editorToolBar.add(editorWordWrap);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		editor_view.add(scrollPane_1, "cell 0 1,grow");
		
		lblFilename = new JLabel("???");
		lblFilename.setFont(UIManager.getFont("InternalFrame.titleFont"));
		scrollPane_1.setColumnHeaderView(lblFilename);
		
		editorArea = new JTextPane();
		editorArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		changesIndicatorListener = new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e)
			{
				if(!lblFilename.getText().endsWith(UNSAVED_INDICATOR))
					lblFilename.setText(lblFilename.getText() + UNSAVED_INDICATOR);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e)
			{
				if(!lblFilename.getText().endsWith(UNSAVED_INDICATOR))
					lblFilename.setText(lblFilename.getText() + UNSAVED_INDICATOR);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e)
			{
				if(!lblFilename.getText().endsWith(UNSAVED_INDICATOR))
					lblFilename.setText(lblFilename.getText() + UNSAVED_INDICATOR);
			}
		};
		editorArea.getDocument().addDocumentListener(changesIndicatorListener);
		editorArea.addCaretListener(new CaretListener() {
			/**
			 * Update caret status bar in the editor tab
			 */
			@Override
			public void caretUpdate(CaretEvent arg0) {
				JEditorPane area = (JEditorPane)arg0.getSource();
				
				int line = 1, col = 1;
				String label = "ERROR - CURRENTLY UNIMPLEMENTED";
				
				//TODO return to caret position display eventually
				/*
				int cpos = area.getCaretPosition();
				Element e = area.getDocument().getDefaultRootElement();
				line = e.getElementIndex(cpos) + 1;
				col = e.getElement(line - 1).getStartOffset();
				label = "Line " + line + " | Col " + col;
				*/
				
				lblCursorposdisplay.setText(label);
			}
			
		});
		scrollPane_1.setViewportView(editorArea);
		
		lblCursorposdisplay = new JLabel("Line 1 | Col 0");
		lblCursorposdisplay.setFont(UIManager.getFont("InternalFrame.titleFont"));
		lblCursorposdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		editor_view.add(lblCursorposdisplay, "cell 0 2");
	}
	
	/**
	 * Set word wrapping for the indicated JTextComponent
	 */
	private void setWordWrap(JTextComponent area, boolean state)
	{
		//TODO ???
	}
	
	/**
	 * Change the font size of a text area
	 */
	private void setFontSize(JTextComponent area, int size)
	{
		area.setFont(area.getFont().deriveFont((float)size));
	}
	
	private void sendInToOut()
	{
		if(Console.instance().processInput(inputLine.getText()) == -1)
		{
			Console.println("~ " + inputLine.getText());
			
			try
			{
				AntlrBridge a = new AntlrBridge(inputLine.getText() + "\n");
			}
			catch(Exception e)
			{
				Console.println("ANTLR interpretation engine encountered an error.", Console.getErr());
				Console.println(e.getMessage(), Console.getErr());
				e.printStackTrace();
			}
		}
		
		Console.instance().addToHistory(inputLine.getText());
		inputLine.setText("");
	}
	
	public JTextPane getOutput()
	{
		return outputArea;
	}
	
	/**
	 * Get the text in the output window
	 * @return A reference to the String that represents the output window
	 */
	public void clearOut()
	{
		outputArea.setText("");
	}
}
