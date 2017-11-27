package grammar;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import engine.command.*;




public class CommandObjectVisitor extends SequenceAnalyzerBaseVisitor<CommandObject> {
	public boolean debugFlag = true;
	
	@Override public CommandObject visitAssignVariableOfCommand(SequenceAnalyzerParser.AssignVariableOfCommandContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public CommandObject visitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	
	@Override
    public CommandObject visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx){
		String target = ctx.expr(0).getText();
		String replacement = ctx.expr(1).getText();
		
		if(debugFlag == true){
			System.out.println("target = " + target);
			System.out.println("replacement = " + replacement);
		}
		
		SubstitutionCommand subCommand = new SubstitutionCommand(target, replacement);
		
		return visitChildren(ctx);
	}

	@Override
    public CommandObject visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx){
		String str1 = ctx.expr(0).getText();
		String str2 = ctx.expr(1).getText(); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		CompareCommand cmpCommand = new CompareCommand(str1, str2);
		
		return visitChildren(ctx);
	}

	@Override
    public CommandObject visitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx){
		String expr = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		CuttingTimesCommand ctCommand = new CuttingTimesCommand(expr);
		
		return visitChildren(ctx);
	}

	@Override
    public CommandObject  visitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx){
		String expr = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		CuttingTimesCommand ctCommand = new CuttingTimesCommand(expr);
		
		return visitChildren(ctx);
	}
	
	@Override public CommandObject visitCuttingTimesOfCommand(SequenceAnalyzerParser.CuttingTimesOfCommandContext ctx) { 
		String context = ctx.getText();
		String cmd = ctx.command.getText();
		String nestedCmd = ctx.nestedCmd.getText();
		CommandObject cmdObject;
		
		if(debugFlag == true) {
			System.out.println("visiting CuttingTimesOfCommand");
			System.out.println("ctx = " + context);
			System.out.println("nestedCmd = "+nestedCmd);
		}
		
		switch(cmd) {
		case "sm":
			cmdObject = new ShiftMaximalityCommand();
			break;
		case "wc":
			cmdObject = new WordCountCommand();
			break;
		case "ct":
			cmdObject = new CuttingTimesCommand();
			break;
		case "bu":
			cmdObject = new BuildCommand();
			break;
		case "sp":
			cmdObject = new StarProductCommand();
			break;
		default:
			break;
		}
		cmdObject = visitChildren(ctx.nestedCmd);
		
		return cmdObject;
	}
	
	@Override public CommandObject visitCuttingTimesOfCommandInParens(SequenceAnalyzerParser.CuttingTimesOfCommandInParensContext ctx) { 
		String context = ctx.getText();
		String cmd = ctx.command.getText();
		String nestedCmd = ctx.nestedCmd.getText();
		CommandObject cmdObject;
		
		if(debugFlag == true) {
			System.out.println("visiting CuttingTimesOfCommand");
			System.out.println("ctx = " + context);
			System.out.println("nestedCmd = "+nestedCmd);
		}
		
		switch(cmd) {
		case "sm":
			cmdObject = new ShiftMaximalityCommand();
			break;
		case "wc":
			cmdObject = new WordCountCommand();
			break;
		case "ct":
			cmdObject = new CuttingTimesCommand();
			break;
		case "bu":
			cmdObject = new BuildCommand();
			break;
		case "sp":
			cmdObject = new StarProductCommand();
			break;
		default:
			break;
		}
		cmdObject = visitChildren(ctx.nestedCmd);
		
		return cmdObject;
	}

	@Override
    public CommandObject  visitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx){
		System.out.println("Visiting StarProductOfExpressions");
		String str1 = ctx.expr(0).getText();
		String str2 = ctx.expr(1).getText(); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		StarProductCommand spCommand = new StarProductCommand(str1, str2); 
		
		return visitChildren(ctx);
	}
	
	@Override public CommandObject visitStarProductOfCommands(SequenceAnalyzerParser.StarProductOfCommandsContext ctx) { 
		if(debugFlag == true) {
			System.out.println("visiting StarProductOfCommands");
		}
		return visitChildren(ctx); 
	}

	@Override
    public CommandObject  visitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx){
		String str = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + str);
		}
		
		BuildCommand buildCommand = new BuildCommand(str);
		
		return visitChildren(ctx);
	}

	@Override
    public CommandObject  visitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx){
		String str = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + str);
		}
		
		BuildCommand buildCommand = new BuildCommand(str);
		
		return visitChildren(ctx);
	}

	@Override
    public CommandObject  visitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx){
		String operand = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("visiting ShiftMaximalityOfExpression");
			System.out.println("operand = " + operand);
		}
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(operand);
		
		return visitChildren(ctx);
	}

	@Override
    public CommandObject  visitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx){
		String operand = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("ShiftMaximalityInParens");
			System.out.println("operand = " + operand);
		}
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(operand);
		
		return visitChildren(ctx);
	}
	
	@Override public CommandObject visitShiftMaximalityOfCommand(SequenceAnalyzerParser.ShiftMaximalityOfCommandContext ctx) { 
		String context = ctx.getText();
		String cmd = ctx.command.getText();
		String nestedCmd = ctx.nestedCmd.getText();
		CommandObject cmdObject;
		
		if(debugFlag == true) {
			System.out.println("visiting ShiftMaximalityOfCommand");
			System.out.println("ctx = " + context);
			System.out.println("nestedCmd = "+nestedCmd);
		}
		
		switch(cmd) {
		case "sm":
//			ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(nestedCmd);
//			ShiftMaximalityCommand nestedCommand = new ShiftMaximalityCommand(smCommand);
			cmdObject = new ShiftMaximalityCommand();
			break;
		case "wc":
			cmdObject = new WordCountCommand();
			break;
		case "ct":
			cmdObject = new CuttingTimesCommand();
			break;
		case "bu":
			cmdObject = new BuildCommand();
			break;
		case "sp":
			cmdObject = new StarProductCommand();
			break;
		default:
			break;
		}
		cmdObject = visitChildren(ctx.nestedCmd);
		
		return cmdObject;
	}

	@Override public CommandObject visitShiftMaximalityOfCommandInParens(SequenceAnalyzerParser.ShiftMaximalityOfCommandInParensContext ctx) { 
		String context = ctx.getText();
		String cmd = ctx.command.getText();
		String nestedCmd = ctx.nestedCmd.getText();
		CommandObject cmdObject;
		
		if(debugFlag == true) {
			System.out.println("visiting ShiftMaximalityOfCommandInParens");
			System.out.println("ctx = "+context);
			System.out.println("nestedCmd = "+nestedCmd);
		}
		
		switch(cmd) {
		case "sm":
//			ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(nestedCmd);
//			ShiftMaximalityCommand nestedCommand = new ShiftMaximalityCommand(smCommand);
			cmdObject = new ShiftMaximalityCommand();
			break;
		case "wc":
			cmdObject = new WordCountCommand();
			break;
		case "ct":
			cmdObject = new CuttingTimesCommand();
			break;
		case "bu":
			cmdObject = new BuildCommand();
			break;
		case "sp":
			cmdObject = new StarProductCommand();
			break;			
		default:
			break;
		}
		cmdObject = visitChildren(ctx.nestedCmd);
		
		return cmdObject;
	}

	@Override
    public CommandObject  visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx){
		String str = ctx.expr().getText();
		int index = Integer.parseInt(ctx.INT().getText());
		
		if(debugFlag == true){
			System.out.println("str = " + str);
			System.out.println("index = " + index);
		}
		
		WordCountCommand wordcountCommand = new WordCountCommand(str,index);
		
		return visitChildren(ctx);
	}
	
	@Override public CommandObject visitWordCountOfCommand(SequenceAnalyzerParser.WordCountOfCommandContext ctx) { 
		String context = ctx.getText();
		String cmd = ctx.command.getText();
		String nestedCmd = ctx.nestedCmd.getText();
		CommandObject cmdObject;
		
		if(debugFlag == true) {
			System.out.println("visiting WordCountOfCommand");
			System.out.println("ctx = " + context);
			System.out.println("nestedCmd = "+nestedCmd);
		}
		
		switch(cmd) {
		case "sm":
			cmdObject = new ShiftMaximalityCommand();
			break;
		case "wc":
			cmdObject = new WordCountCommand();
			break;
		case "ct":
			cmdObject = new CuttingTimesCommand();
			break;
		case "bu":
			cmdObject = new BuildCommand();
			break;
		case "sp":
			cmdObject = new StarProductCommand();
			break;
		default:
			break;
		}
		cmdObject = visitChildren(ctx.nestedCmd);
		
		return cmdObject;
	}
	
	@Override
    public CommandObject visitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx){
		String baseStr = ctx.expr(0).getText();
		String concatStr = ctx.expr(1).getText();
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
		}
		
		ConcatenationCommand concatCommand = new ConcatenationCommand(baseStr, concatStr);
		
		return visitChildren(ctx);
	}
	
	@Override
    public CommandObject visitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx){
		String baseStr = ctx.expr(0).getText();
		String concatStr = ctx.expr(1).getText();
		int index = Integer.parseInt(ctx.INT().getText());
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
			System.out.println("index = " + index);
		}
		
		ConcatenationCommand concatCommand = new ConcatenationCommand(baseStr, concatStr, index);
		
		return visitChildren(ctx);
	}
	
	@Override public CommandObject visitConcatOn2Commands(SequenceAnalyzerParser.ConcatOn2CommandsContext ctx) { 
		if(debugFlag == true) {
			System.out.println("visiting ConcatOn2Commands");
		}
		return visitChildren(ctx);
	}
	
	@Override public CommandObject visitConcatOn2CommandsAtIndex(SequenceAnalyzerParser.ConcatOn2CommandsAtIndexContext ctx) { 
		if(debugFlag == true) {
			System.out.println("visiting ConcatOn2CommandsAtIndex");
		}
		return visitChildren(ctx);
	}
}

