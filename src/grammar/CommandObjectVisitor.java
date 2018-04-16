package grammar;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import engine.Alphabet;
import engine.AlphabetSymbolTable;
import grammar.SequenceAnalyzerParser.RulesContext;
import gui.Console;

public class CommandObjectVisitor extends SequenceAnalyzerBaseVisitor<CommandObject>
{
	public boolean debugFlag = true;
	
	@Override public CommandObject<Object> visitProgram(SequenceAnalyzerParser.ProgramContext ctx) { 
		CommandObject<Object> visitResult;
		Object executeResult;
		if(debugFlag == true) {
			System.out.println("Visiting Prog");
		}
		for(int i=0; ctx.cmd(i)!=null; i++) {
			
			if(debugFlag == true) {
				System.out.println("Looping ctx.cmd("+i+")");
			}
			
			if(ctx.cmd(1)!=null) {
				Console.println("Command "+(i+1)+": "+ctx.cmd(i).getText(),Console.getHdr());
			}
			
			visitResult = visit(ctx.cmd(i));
			
			if(visitResult!=null) {
				//Blacklist to avoid automatic printing of result
				if(visitResult instanceof PrintCommand || visitResult instanceof VariableAssignmentCommand || visitResult instanceof LiteralCommand) {
					if(debugFlag == true) {
						System.out.println("visitResult class: "+visitResult.getClass());
						System.out.println("Auto Print...");
						System.out.println("ctx = "+ctx.cmd(i).getText());
					}
					visitResult.execute();
				}
				//automatically prints normal commands
				else {
//					executeResult = visitResult.execute();
					if(debugFlag == true) {
						System.out.println("visitResult class: "+visitResult.getClass());
						System.out.println("Auto Print...");
						System.out.println("ctx = "+ctx.cmd(i).getText());
					}
					//Console.println(executeResult.toString());
					new PrintCommand(visitResult).execute();
				}
				
			}
			else {
				System.out.println("Result = null");
				//Console.println("result is null",Console.getErr());
			}
		}
		return null;
	}
	
	//TODO this is kinda a work around to deal with variables of different types (e.g. Integer, String, etc.)
	@Override public CommandObject<Object> visitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx)
	{
		String name = ctx.varName.getText();
		Object value = ctx.expr().getText();
		
		if(debugFlag == true) {
			System.out.println("Visiting AssignVariableOfExpression");
			System.out.println("name = " + name);
		}
		
		//TODO debug stuff
		
		return new VariableAssignmentCommand(name, visit(ctx.expr()));
	}
	
	@Override
    public CommandObject<String> visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx)
	{
		String startString = ctx.arg1.getText();
		String mapping = ctx.alpha_mapping().getText();
		
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		
		String [] commaSplitString = mapping.split(",");
		String [] arrowSplitString;
		
		for (int i = 0; i<commaSplitString.length; i++) {
			arrowSplitString = commaSplitString[i].split("->"); 
			for(int j = 0; j<arrowSplitString.length; j++) {
				arrowSplitString[j] = arrowSplitString[j].replaceAll("\"", "");
			}
			map.put(arrowSplitString[0], arrowSplitString[1]);
			if(debugFlag == true) {
				System.out.println("arrowSplitString[0] = "+arrowSplitString[0]);
				System.out.println("arrowSplitString[1] = "+arrowSplitString[1]);
			}
		}
		
		if(debugFlag == true){
			System.out.println("startString = " + startString);
			System.out.println("mapping = " + mapping);
		}
		
		return new SubstitutionCommand(visit(ctx.arg1), map);
	}
	
	@Override 
	public CommandObject<String> visitSubstitutionOfExpressionWithIterations(SequenceAnalyzerParser.SubstitutionOfExpressionWithIterationsContext ctx) 
	{ 
		String startString = ctx.arg1.getText();
		String mapping = ctx.alpha_mapping().getText();
		int iterations = Integer.parseInt(ctx.INT().getText());
		
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		
		String [] commaSplitString = mapping.split(",");
		String [] arrowSplitString;
		
		for (int i = 0; i<commaSplitString.length; i++) {
			arrowSplitString = commaSplitString[i].split("->"); 
			for(int j = 0; j<arrowSplitString.length; j++) {
				arrowSplitString[j] = arrowSplitString[j].replaceAll("\"", "");
			}
			map.put(arrowSplitString[0], arrowSplitString[1]);
			if(debugFlag == true) {
				System.out.println("arrowSplitString[0] = "+arrowSplitString[0]);
				System.out.println("arrowSplitString[1] = "+arrowSplitString[1]);
			}
		}
		
		if(debugFlag == true){
			System.out.println("startString = " + startString);
			System.out.println("mapping = " + mapping);
			System.out.println("iterations = " + iterations);
		}
				
		return new SubstitutionCommand(visit(ctx.arg1), map, iterations);
	}

	@Override
    public CommandObject<String> visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx)
	{
		String str1 = ctx.arg1.getText();
		String str2 = ctx.arg2.getText(); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		return new CompareCommand(visit(ctx.arg1), visit(ctx.arg2));
	}

	@Override
    public CommandObject<String> visitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx)
	{
		String expr = ctx.arg1.getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		return new CuttingTimesCommand(visit(ctx.arg1));
	}

	@Override
    public CommandObject<String> visitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx)
	{
		String expr = ctx.arg1.getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		return new CuttingTimesCommand(visit(ctx.arg1));
	}

	@Override
    public CommandObject<String> visitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx)
	{
		System.out.println("Visiting StarProductOfExpressions");
		String str1 = ctx.arg1.getText();
		String str2 = ctx.arg2.getText(); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		return new StarProductCommand(visit(ctx.arg1), visit(ctx.arg2));
	}

	@Override
    public CommandObject<String> visitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx)
	{
		String operand = ctx.arg1.getText();
		
		if(debugFlag == true){
			System.out.println("visiting ShiftMaximalityOfExpression");
			System.out.println("operand = " + operand);
		}
		
		
		
		return new ShiftMaximalityCommand(visit(ctx.arg1));
	}

	@Override
    public CommandObject  visitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx)
	{
		String operand = ctx.arg1.getText();
		
		if(debugFlag == true){
			System.out.println("ShiftMaximalityInParens");
			System.out.println("operand = " + operand);
		}
		
		return new ShiftMaximalityCommand(visit(ctx.arg1));
	}

	@Override
    public CommandObject  visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx)
	{
		String str = ctx.arg1.getText();
		int index = Integer.parseInt(ctx.arg2.getText());
		
		if(debugFlag == true){
			System.out.println("str = " + str);
			System.out.println("index = " + index);
		}
		
		return new WordCountCommand(visit(ctx.arg1), visit(ctx.arg2));
	}
	
	@Override
    public CommandObject<String> visitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx)
	{
		String baseStr = ctx.arg1.getText();
		String concatStr = ctx.arg2.getText();
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
		}
		
		return new ConcatenationCommand(visit(ctx.arg1), visit(ctx.arg2));
	}
	
	//Concat at index in invoked by the 'insert' command in concat branch of grammar
	@Override
    public CommandObject<String> visitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx)
	{
		String baseStr = ctx.arg1.getText();
		String concatStr = ctx.arg2.getText();
		int index = Integer.parseInt(ctx.literal().getText());
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
			System.out.println("index = " + index);
		}
		
		return new ConcatenationCommand(visit(ctx.arg1), visit(ctx.arg2), visit(ctx.literal()));
	}
	
	@Override
	public CommandObject<String> visitStringLiteral(SequenceAnalyzerParser.StringLiteralContext ctx)
	{
		String value = ctx.value.getText().substring(1, ctx.value.getText().length() - 1);
		
		if(debugFlag == true)
		{
			System.out.println("Visiting String Literal");
			System.out.println("string value = " + value);
		}
		
		return new LiteralCommand<String>(value);
	}
	
	@Override
    public CommandObject<Integer> visitIntegerLiteral(SequenceAnalyzerParser.IntegerLiteralContext ctx)
	{		
		Integer value = new Integer(ctx.value.getText());
		
		if(debugFlag == true)
		{
			System.out.println("Visiting Integer Literal");
			System.out.println("int value = " + value);
		}
		
		return new LiteralCommand<Integer>(value);
	}
	
	@Override public PrintCommand visitPrintCommand(SequenceAnalyzerParser.PrintCommandContext ctx) { 
		if(debugFlag == true)
		{
			System.out.println("Visiting Print Command");
		}
		
		String command = ctx.cmd().getText();
		
		if(debugFlag == true)
		{
			System.out.println("Command = "+command);
			System.out.println("Force Print...");
		}
		
		return new PrintCommand(visit(ctx.cmd())); 
	}
	
	@Override public PrintCommand visitPrintCommandInParens(SequenceAnalyzerParser.PrintCommandInParensContext ctx) { 
		if(debugFlag == true)
		{
			System.out.println("Visiting Print CommandInParens");
		}
		
		String command = ctx.cmd().getText();
		
		if(debugFlag == true)
		{
			System.out.println("Command = "+command);
			System.out.println("Force Print...");
		}
		
		return new PrintCommand(visit(ctx.cmd())); 
	}
	
	@Override
	public CommandObject<Object> visitRetrieveVariable(SequenceAnalyzerParser.RetrieveVariableContext ctx)
	{ 
		String name = ctx.variable.getText();
		
		if(debugFlag == true)
		{
			System.out.println("Visiting Retrieve Variable");
			System.out.println("var name = " + name);
		}
		
		return new ResolveVariable(name);
	}
	
	/* Alphabet Definition and Derivation */
	@Override
	public CommandObject<Alphabet> visitAssignUserAlphabetOfStrings(SequenceAnalyzerParser.AssignUserAlphabetOfStringsContext ctx)
	{
		String alpha = ctx.getText();
		if(debugFlag)
		{
			System.out.println("Visting Assign User Alphabet");
			System.out.println(alpha);
		}
		
		//get characters
		List<TerminalNode> literals = ctx.STRING_LITERAL();
		String[] chars = new String[literals.size()];
		for(int i = 0; i < literals.size(); i++)
			chars[i] = literals.get(i).getText().replaceAll("\"", "");
		
		//make define CO
		return new DefineAlphabet(chars);
	}
	
	@Override
	public CommandObject<Alphabet> visitAssignUserAlphabetOfStringsInParens(SequenceAnalyzerParser.AssignUserAlphabetOfStringsInParensContext ctx)
	{
		String alpha = ctx.getText();
		if(debugFlag)
		{
			System.out.println("Visting Assign User Alphabet In Parens");
			System.out.println(alpha);
		}
		
		//get characters
		List<TerminalNode> literals = ctx.STRING_LITERAL();
		String[] chars = new String[literals.size()];
		for(int i = 0; i < literals.size(); i++)
			chars[i] = literals.get(i).getText().replaceAll("\"", "");
		
		//make define CO
		return new DefineAlphabet(chars);
	}
	
	@Override
	public CommandObject<Alphabet> visitAssignUserAlphabetOfStringsWithRules(SequenceAnalyzerParser.AssignUserAlphabetOfStringsWithRulesContext ctx)
	{
		String alpha = ctx.getText();
		if(debugFlag)
		{
			System.out.println("Visting Assign User Alphabet With Rules");
			System.out.println(alpha);
		}
		
		//get characters
		List<TerminalNode> literals = ctx.STRING_LITERAL();
		String[] chars = new String[literals.size()];
		for(int i = 0; i < literals.size(); i++)
			chars[i] = literals.get(i).getText().replaceAll("\"", "");
		
		//get rules
		List<RulesContext> rules = ctx.rules();
		DefineRule[] ruleCommands = new DefineRule[rules.size()];
		for(int i = 0; i < rules.size(); i++)
			ruleCommands[i] = (DefineRule) visit(rules.get(i));
		
		//make define CO
		return new DefineAlphabet(chars, ruleCommands);
	}
	
	@Override
	public CommandObject<Alphabet.Rule> visitRules(SequenceAnalyzerParser.RulesContext ctx)
	{
		String rule = ctx.getText();
		if(debugFlag)
		{
			System.out.println("Visiting Rule");
			System.out.println(rule);
		}
		
		//get rule values
		List<TerminalNode> ints = ctx.INT();
		int[] chars = new int[ints.size()];
		for(int i = 0; i < ints.size(); i++)
			chars[i] = Integer.parseInt(ints.get(i).getText());
		
		//make define CO
		return new DefineRule(chars);
	}
	
	@Override
	public CommandObject<Alphabet> visitDeriveAlphabet(SequenceAnalyzerParser.DeriveAlphabetContext ctx)
	{
		String context = ctx.getText();
		if(debugFlag)
		{
			System.out.println("Visiting Derive Alphabet");
			System.out.println(context);
		}
		
		AlphabetCommand alpha = (AlphabetCommand) visit(ctx.array_def());
		return new DeriveAlphabet(alpha, new LiteralCommand<Integer>(Integer.parseInt(ctx.INT().getText())));
	}
	
	@Override
	public CommandObject<Alphabet> visitDeriveAlphabetWithVariable(SequenceAnalyzerParser.DeriveAlphabetWithVariableContext ctx)
	{
		String context = ctx.getText();
		if(debugFlag)
		{
			System.out.println("Visiting Derive Alphabet");
			System.out.println(context);
			System.out.println("var name = " + ctx.alphabetName.getText());
		}
		
		return new DeriveAlphabet(ctx.alphabetName.getText(), new LiteralCommand<Integer>(Integer.parseInt(ctx.INT().getText())));
	}
}

