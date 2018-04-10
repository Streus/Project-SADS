package grammar;
// Generated from SequenceAnalyzer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SequenceAnalyzerParser}.
 */
public interface SequenceAnalyzerListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code program}
	 * labeled alternative in {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SequenceAnalyzerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code program}
	 * labeled alternative in {@link SequenceAnalyzerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SequenceAnalyzerParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by the {@code SubstitutionOfExpressionWithIterations}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutionOfExpressionWithIterations(SequenceAnalyzerParser.SubstitutionOfExpressionWithIterationsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubstitutionOfExpressionWithIterations}
	 * labeled alternative in {@link SequenceAnalyzerParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutionOfExpressionWithIterations(SequenceAnalyzerParser.SubstitutionOfExpressionWithIterationsContext ctx);
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
	 * Enter a parse tree produced by the {@code RetrieveVariable}
	 * labeled alternative in {@link SequenceAnalyzerParser#retreival}.
	 * @param ctx the parse tree
	 */
	void enterRetrieveVariable(SequenceAnalyzerParser.RetrieveVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RetrieveVariable}
	 * labeled alternative in {@link SequenceAnalyzerParser#retreival}.
	 * @param ctx the parse tree
	 */
	void exitRetrieveVariable(SequenceAnalyzerParser.RetrieveVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignUserAlphabetOfStrings}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterAssignUserAlphabetOfStrings(SequenceAnalyzerParser.AssignUserAlphabetOfStringsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignUserAlphabetOfStrings}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitAssignUserAlphabetOfStrings(SequenceAnalyzerParser.AssignUserAlphabetOfStringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignUserAlphabetOfStringsInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterAssignUserAlphabetOfStringsInParens(SequenceAnalyzerParser.AssignUserAlphabetOfStringsInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignUserAlphabetOfStringsInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitAssignUserAlphabetOfStringsInParens(SequenceAnalyzerParser.AssignUserAlphabetOfStringsInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignUserAlphabetOfStringsWithRules}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterAssignUserAlphabetOfStringsWithRules(SequenceAnalyzerParser.AssignUserAlphabetOfStringsWithRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignUserAlphabetOfStringsWithRules}
	 * labeled alternative in {@link SequenceAnalyzerParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitAssignUserAlphabetOfStringsWithRules(SequenceAnalyzerParser.AssignUserAlphabetOfStringsWithRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(SequenceAnalyzerParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(SequenceAnalyzerParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeriveAlphabet}
	 * labeled alternative in {@link SequenceAnalyzerParser#derive}.
	 * @param ctx the parse tree
	 */
	void enterDeriveAlphabet(SequenceAnalyzerParser.DeriveAlphabetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeriveAlphabet}
	 * labeled alternative in {@link SequenceAnalyzerParser#derive}.
	 * @param ctx the parse tree
	 */
	void exitDeriveAlphabet(SequenceAnalyzerParser.DeriveAlphabetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeriveAlphabetWithVariable}
	 * labeled alternative in {@link SequenceAnalyzerParser#derive}.
	 * @param ctx the parse tree
	 */
	void enterDeriveAlphabetWithVariable(SequenceAnalyzerParser.DeriveAlphabetWithVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeriveAlphabetWithVariable}
	 * labeled alternative in {@link SequenceAnalyzerParser#derive}.
	 * @param ctx the parse tree
	 */
	void exitDeriveAlphabetWithVariable(SequenceAnalyzerParser.DeriveAlphabetWithVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintArray}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintArray(SequenceAnalyzerParser.PrintArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintArray}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintArray(SequenceAnalyzerParser.PrintArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintArrayInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintArrayInParens(SequenceAnalyzerParser.PrintArrayInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintArrayInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintArrayInParens(SequenceAnalyzerParser.PrintArrayInParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommand(SequenceAnalyzerParser.PrintCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCommand}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommand(SequenceAnalyzerParser.PrintCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCommandInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommandInParens(SequenceAnalyzerParser.PrintCommandInParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCommandInParens}
	 * labeled alternative in {@link SequenceAnalyzerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommandInParens(SequenceAnalyzerParser.PrintCommandInParensContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SequenceAnalyzerParser#alpha_mapping}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_mapping(SequenceAnalyzerParser.Alpha_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SequenceAnalyzerParser#alpha_mapping}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_mapping(SequenceAnalyzerParser.Alpha_mappingContext ctx);
}