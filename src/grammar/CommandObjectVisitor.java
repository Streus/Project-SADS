package grammar;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import engine.command.*;

import java.util.Stack;

public class CommandObjectVisitor extends SequenceAnalyzerBaseVisitor<CommandObject> {
	Stack<CommandObject> commandObjectStack = new Stack<CommandObject>();
	public boolean debugFlag = true;
	
//	@Override
//    public CommandObject visitSubstitutionOfFiles(SequenceAnalyzerParser.SubstitutionOfFilesContext ctx){
//		
//	}

	@Override
    public CommandObject visitSubstitutionOfExpression(SequenceAnalyzerParser.SubstitutionOfExpressionContext ctx){
		String target = ctx.expr(0).getText();
		String replacement = ctx.expr(1).getText();
		
		if(debugFlag == true){
			System.out.println("target = " + target);
			System.out.println("replacement = " + replacement);
		}
		
		SubstitutionCommand subCommand = new SubstitutionCommand(target, replacement);
		commandObjectStack.push(subCommand);
		
		return subCommand;
	}

//	@Override
//    public void visitComparisonOfFiles(SequenceAnalyzerParser.ComparisonOfFilesContext ctx){
//		
//	}

	@Override
    public CommandObject visitComparisonOfExpression(SequenceAnalyzerParser.ComparisonOfExpressionContext ctx){
		String str1 = ctx.expr(0).getText();
		String str2 = ctx.expr(1).getText(); 
		
		if(debugFlag == true){
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
		}
		
		CompareCommand cmpCommand = new CompareCommand(str1, str2);
		commandObjectStack.push(cmpCommand);
		
		return cmpCommand;
	}

//	@Override
//    public void  visitCuttingTimesOfFile(SequenceAnalyzerParser.CuttingTimesOfFileContext ctx){
//		
//	}

//	@Override
//    public void  visitCuttingTimesOfFileInParens(SequenceAnalyzerParser.CuttingTimesOfFileInParensContext ctx){
//		
//	}

	@Override
    public CommandObject visitCuttingTimesOfExpression(SequenceAnalyzerParser.CuttingTimesOfExpressionContext ctx){
		String expr = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		CuttingTimesCommand ctCommand = new CuttingTimesCommand(expr);
		commandObjectStack.push(ctCommand);
		
		return ctCommand;
	}

	@Override
    public CommandObject  visitCuttingTimesOfExpressionInParens(SequenceAnalyzerParser.CuttingTimesOfExpressionInParensContext ctx){
		String expr = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + expr);
		}
		
		CuttingTimesCommand ctCommand = new CuttingTimesCommand(expr);
		commandObjectStack.push(ctCommand);
		
		return ctCommand;
	}

//	@Override
//    public void  visitStarProductOfFiles(SequenceAnalyzerParser.StarProductOfFilesContext ctx){
//		
//	}

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
		commandObjectStack.push(spCommand);
		
		return spCommand;
	}

//	@Override
//    public void  visitBuildFile(SequenceAnalyzerParser.BuildFileContext ctx){
//		
//	}
//
//	@Override
//    public void  visitBuildFileInParens(SequenceAnalyzerParser.BuildFileInParensContext ctx){
//		
//	}

	@Override
    public CommandObject  visitBuildExpression(SequenceAnalyzerParser.BuildExpressionContext ctx){
		String str = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + str);
		}
		
		BuildCommand buildCommand = new BuildCommand(str);
		commandObjectStack.push(buildCommand);
		
		return buildCommand;
	}

	@Override
    public CommandObject  visitBuildExpressionInParens(SequenceAnalyzerParser.BuildExpressionInParensContext ctx){
		String str = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("expr = " + str);
		}
		
		BuildCommand buildCommand = new BuildCommand(str);
		commandObjectStack.push(buildCommand);
		
		return buildCommand;
	}

//	@Override
//    public void  visitShiftMaximalityOfFile(SequenceAnalyzerParser.ShiftMaximalityOfFileContext ctx){
//		
//	}
//
//	@Override
//    public void  visitShiftMaximalityOfFileInParens(SequenceAnalyzerParser.ShiftMaximalityOfFileInParensContext ctx){
//		
//	}

	@Override
    public CommandObject  visitShiftMaximalityOfExpression(SequenceAnalyzerParser.ShiftMaximalityOfExpressionContext ctx){
		String operand = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("ShiftMaximalityNoParens");
			System.out.println("operand = " + operand);
		}
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(operand);
		commandObjectStack.push(smCommand);
		
		return smCommand;
	}

	@Override
    public CommandObject  visitShiftMaximalityOfExpressionInParens(SequenceAnalyzerParser.ShiftMaximalityOfExpressionInParensContext ctx){
		String operand = ctx.expr().getText();
		
		if(debugFlag == true){
			System.out.println("ShiftMaximalityInParens");
			System.out.println("operand = " + operand);
		}
		
		ShiftMaximalityCommand smCommand = new ShiftMaximalityCommand(operand);
		commandObjectStack.push(smCommand);
		
		return smCommand;
	}

//	@Override
//    public void  visitWordCountOfFile(SequenceAnalyzerParser.WordCountOfFileContext ctx){
//		
//	}
//

	@Override
    public CommandObject  visitWordCountOfExpression(SequenceAnalyzerParser.WordCountOfExpressionContext ctx){
		String str = ctx.expr().getText();
		int index = Integer.parseInt(ctx.INT().getText());
		
		if(debugFlag == true){
			System.out.println("str = " + str);
			System.out.println("index = " + index);
		}
		
		WordCountCommand wordcountCommand = new WordCountCommand(str,index);
		commandObjectStack.push(wordcountCommand);
		
		return wordcountCommand;
	}


//	@Override
//    public void  visitConcatOn2files(SequenceAnalyzerParser.ConcatOn2filesContext ctx){
//		
//	}
//
//	@Override
//    public void  visitConcatOn2FilesAtIndex(SequenceAnalyzerParser.ConcatOn2FilesAtIndexContext ctx){
//		
//	}
	
	@Override
    public CommandObject visitConcatOn2Expressions(SequenceAnalyzerParser.ConcatOn2ExpressionsContext ctx){
		String baseStr = ctx.expr(0).getText();
		String concatStr = ctx.expr(1).getText();
		
		if(debugFlag == true){
			System.out.println("baseStr = " + baseStr);
			System.out.println("concatStr = " + concatStr);
		}
		
		ConcatenationCommand concatCommand = new ConcatenationCommand(baseStr, concatStr);
		commandObjectStack.push(concatCommand);
		
		return concatCommand;
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
		commandObjectStack.push(concatCommand);
		
		return concatCommand;
	}


}

