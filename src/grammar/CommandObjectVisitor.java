package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
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
				executeResult = visitResult.execute();
				System.out.println("Result = "+executeResult);
				Console.println(executeResult.toString());
			}
			else {
				System.out.println("Result = null");
				//Console.println("result is null",Console.getErr());
			}
		}
		return visitChildren(ctx);
	}
	
	//TODO this is kinda a work around to deal with variables of different types (e.g. Integer, String, etc.)
	@Override public CommandObject<Object> visitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx)
	{
		String name = ctx.varName.getText();
		Object value = ctx.expr().getText();
		
		if(debugFlag == true) {
			System.out.println("Visiting AssignVariableOfExpression");
		}
		
		//TODO debug stuff
		
		return new VariableAssignmentCommand(name, visit(ctx.expr()));
	}
	
	@Override public CommandObject<Object> visitAssignUserAlphabet(SequenceAnalyzerParser.AssignUserAlphabetContext ctx) { 
		if(debugFlag == true) {
			System.out.println("Visiting AssignUserAlphabet");
		}
		
		System.out.println(ctx.getText());
		
		for(int i=0; ctx.STRING_LITERAL(i)!=null; i++) {
			System.out.println("STRING_LITERAL "+(i+1)+" = "+ctx.STRING_LITERAL(i));
		}
		
		return visitChildren(ctx); 
		}
	
	@Override
    public CommandObject<String> visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx)
	{
		String target = ctx.arg1.getText();
		String replacement = ctx.arg2.getText();
		
		if(debugFlag == true){
			System.out.println("target = " + target);
			System.out.println("replacement = " + replacement);
		}
		
		return new SubstitutionCommand(visit(ctx.arg1), visit(ctx.arg2));
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
    public CommandObject<String> visitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx)
	{
		String str = ctx.arg1.getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + str);
		}
		
		return new BuildCommand(visit(ctx.arg1));
	}

	@Override
    public CommandObject<String> visitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx)
	{
		String str = ctx.arg1.getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + str);
		}
		
		return new BuildCommand(visit(ctx.arg1));
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
	
	@Override
    public CommandObject<String> visitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx)
	{
		String baseStr = ctx.arg1.getText();
		String concatStr = ctx.arg2.getText();
		int index = Integer.parseInt(ctx.INT().getText());
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
			System.out.println("index = " + index);
		}
		
		return new ConcatenationCommand(visit(ctx.arg1), visit(ctx.arg2), visit(ctx.INT()));
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
}

