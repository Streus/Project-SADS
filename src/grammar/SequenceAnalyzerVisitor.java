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
	 * Visit a parse tree produced by the {@code SubstitutionOfExpressionWithIterations}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutionOfExpressionWithIterations(SequenceAnalyzerParser.SubstitutionOfExpressionWithIterationsContext ctx);
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
	/**
	 * Visit a parse tree produced by the {@code RetrieveVariable}
	 * labeled alternative in {@link SequenceAnalyzerParser#retreival}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetrieveVariable(SequenceAnalyzerParser.RetrieveVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignUserAlphabetOfStrings}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignUserAlphabetOfStrings(SequenceAnalyzerParser.AssignUserAlphabetOfStringsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignUserAlphabetOfStringsInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignUserAlphabetOfStringsInParens(SequenceAnalyzerParser.AssignUserAlphabetOfStringsInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignUserAlphabetOfStringsWithRules}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignUserAlphabetOfStringsWithRules(SequenceAnalyzerParser.AssignUserAlphabetOfStringsWithRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(SequenceAnalyzerParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeriveAlphabet}
	 * labeled alternative in {@link SequenceAnalyzerParser#derive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriveAlphabet(SequenceAnalyzerParser.DeriveAlphabetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeriveAlphabetWithVariable}
	 * labeled alternative in {@link SequenceAnalyzerParser#derive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriveAlphabetWithVariable(SequenceAnalyzerParser.DeriveAlphabetWithVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintArray}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArray(SequenceAnalyzerParser.PrintArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintArrayInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArrayInParens(SequenceAnalyzerParser.PrintArrayInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommand(SequenceAnalyzerParser.PrintCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCommandInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommandInParens(SequenceAnalyzerParser.PrintCommandInParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link SequenceAnalyzerParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SequenceAnalyzerParser.StringLiteralContext ctx);
	/**
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
	/**
	 * Visit a parse tree produced by {@link SequenceAnalyzerParser#alpha_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_mapping(SequenceAnalyzerParser.Alpha_mappingContext ctx);
}