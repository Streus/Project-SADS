package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class CommandObjectVisitor extends SequenceAnalyzerBaseVisitor<CommandObject>
{
	public boolean debugFlag = true;
	
	//TODO this is kinda a work around to deal with variables of different types (e.g. Integer, String, etc.)
	@Override public CommandObject<Object> visitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx)
	{
		String name = ctx.varName.getText();
		Object value = ctx.expr().getText();
		
		//TODO debug stuff
		
		return new VariableAssignmentCommand(name, visit(ctx.expr()));
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
		String value = ctx.value.getText();
		
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

