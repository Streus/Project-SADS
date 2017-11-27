package grammar;
// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SequenceAnalyzerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SequenceAnalyzerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SequenceAnalyzerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SequenceAnalyzerParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(SequenceAnalyzerParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#strcmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrcmd(SequenceAnalyzerParser.StrcmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#predef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredef(SequenceAnalyzerParser.PredefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubstitutionOfCommands}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfCommands(SequenceAnalyzerParser.SubstitutionOfCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubstitutionOfCmdAndExpr}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfCmdAndExpr(SequenceAnalyzerParser.SubstitutionOfCmdAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOfCommands}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOfCommands(SequenceAnalyzerParser.ComparisonOfCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOfCmdAndExpr}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOfCmdAndExpr(SequenceAnalyzerParser.ComparisonOfCmdAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfCommand(SequenceAnalyzerParser.CuttingTimesOfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfCommandInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfCommandInParens(SequenceAnalyzerParser.CuttingTimesOfCommandInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CuttingTimesOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#ct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarProductOfCommands}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarProductOfCommands(SequenceAnalyzerParser.StarProductOfCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarProductOfExpressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarProductOfExpressions(SequenceAnalyzerParser.StarProductOfExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuildExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuildExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfCommand(SequenceAnalyzerParser.ShiftMaximalityOfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfCommandInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfCommandInParens(SequenceAnalyzerParser.ShiftMaximalityOfCommandInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftMaximalityOfExpressionInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#sm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordCountOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfCommand(SequenceAnalyzerParser.WordCountOfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2Commands}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2Commands(SequenceAnalyzerParser.ConcatOn2CommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2CommandsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2CommandsAtIndex(SequenceAnalyzerParser.ConcatOn2CommandsAtIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOfCmdOnExpr}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOfCmdOnExpr(SequenceAnalyzerParser.ConcatOfCmdOnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOfCmdOnExprAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOfCmdOnExprAtIndex(SequenceAnalyzerParser.ConcatOfCmdOnExprAtIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOfExprOnCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOfExprOnCommand(SequenceAnalyzerParser.ConcatOfExprOnCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOfExprOnCommandAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOfExprOnCommandAtIndex(SequenceAnalyzerParser.ConcatOfExprOnCommandAtIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2Expressions}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatOn2ExpressionsAtIndex}
	 * labeled alternative in {@link SequenceAnalyzerParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatOn2ExpressionsAtIndex(SequenceAnalyzerParser.ConcatOn2ExpressionsAtIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVariableOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariableOfCommand(SequenceAnalyzerParser.AssignVariableOfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVariableOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SequenceAnalyzerParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(SequenceAnalyzerParser.IntContext ctx);
}