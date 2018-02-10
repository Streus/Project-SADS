package grammar;
// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SequenceAnalyzerParser}.
 */
public interface SequenceAnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SequenceAnalyzerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SequenceAnalyzerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SequenceAnalyzerParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SequenceAnalyzerParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(SequenceAnalyzerParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(SequenceAnalyzerParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#strcmd}.
	 * @param ctx the parse tree
	 */
	void enterStrcmd(SequenceAnalyzerParser.StrcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#strcmd}.
	 * @param ctx the parse tree
	 */
	void exitStrcmd(SequenceAnalyzerParser.StrcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#predef}.
	 * @param ctx the parse tree
	 */
	void enterPredef(SequenceAnalyzerParser.PredefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#predef}.
	 * @param ctx the parse tree
	 */
	void exitPredef(SequenceAnalyzerParser.PredefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CuttingTimesOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CuttingTimesOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CuttingTimesOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void enterCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CuttingTimesOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 */
	void exitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarProductOfExpressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarProductOfExpressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuildExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuildExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuildExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuildExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftMaximalityOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftMaximalityOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftMaximalityOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void enterShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftMaximalityOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 */
	void exitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void enterWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 */
	void exitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatOn2Expressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatOn2Expressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatOn2ExpressionsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatOn2ExpressionsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVariableOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVariableOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SequenceAnalyzerParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SequenceAnalyzerParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SequenceAnalyzerParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SequenceAnalyzerParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOfCommand(SequenceAnalyzerParser.ExpressionOfCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOfCommand(SequenceAnalyzerParser.ExpressionOfCommandContext ctx);
}