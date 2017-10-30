package grammar;

import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import engine.command.*;

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
		ParseTree tree = parser.prog(); // parse

		CommandObjectVisitor coVisitor = new CommandObjectVisitor();
		coVisitor.visit(tree);
		
		Stack<CommandObject> commandObjectStack = coVisitor.commandObjectStack;
		
		commandExecutor.executeStack(commandObjectStack);
	}
	
	
}
