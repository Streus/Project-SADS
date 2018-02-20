package grammar;// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(SequenceAnalyzerParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code program}
	 * labeled alternative in {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SequenceAnalyzerParser.ProgramContext ctx);
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
	 * Visit a parse tree produced by the {@code SubstitutionOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code WordCountOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#wordct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code AssignVariableOfExpression}
	 * labeled alternative in {@link SequenceAnalyzerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariableOfExpression(SequenceAnalyzerParser.AssignVariableOfExpressionContext ctx);
<<<<<<< HEAD
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SequenceAnalyzerParser.StringLiteralContext ctx);
	/**
=======
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SequenceAnalyzerParser.StringLiteralContext ctx);
	/**
>>>>>>> 107abbffe75194f5144dbb64f599dd62ef6625a5
	 * Visit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SequenceAnalyzerParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOfCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOfCommand(SequenceAnalyzerParser.ExpressionOfCommandContext ctx);
}