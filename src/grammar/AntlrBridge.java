package grammar;

import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import engine.command.*;
import gui.Console;

public class AntlrBridge {

	public AntlrBridge(String input){
//		String inputFile = null;
//		if ( input.length()>0 ) inputFile = input;
//		InputStream is = input;
//		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream antlrInput = new ANTLRInputStream(input);
		SequenceAnalyzerLexer lexer = new SequenceAnalyzerLexer(antlrInput);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SequenceAnalyzerParser parser = new SequenceAnalyzerParser(tokens);

		ParseTree cst = parser.init(); // parse
		
		Object result;
		try
		{
			CommandObjectVisitor ast = new CommandObjectVisitor();
			result = ast.visit(cst);
			//Console.println(result.toString());
		}
		catch(ClassCastException cce)
		{
			Console.println(cce.getMessage(), Console.getErr());
			cce.printStackTrace();
		}
	}

	private void visit(ParseTree cst) {
		// TODO Auto-generated method stub
		
	}
}
