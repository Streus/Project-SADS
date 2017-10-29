package grammar;
import java.util.List;
//Command Objects to processed in the Engine

import engine.PredefinedFunctions.CuttingTimes;
import engine.PredefinedFunctions.ShiftMaximality;
import engine.PredefinedFunctions.StarProduct;
import engine.PredefinedFunctions.WordCount;
import engine.command.CommandResponse;

//COMMAND HIERARCHY LEVEL 0
public abstract class CommandObject{										
	public String commandType;
	
	public CommandObject(){//default constructor
		commandType = "";
	}

	public CommandResponse execute() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

//COMMAND HIERARCHY LEVEL 1

abstract class VarDefCommand extends CommandObject{					
	public VarDefCommand (){//default constructor
		commandType = "";
	}
	
	public CommandResponse execute() {
		// TODO Auto-generated method stub
		return null;
	}
}

abstract class StringCommand extends CommandObject{					
	public StringCommand (){//default constructor
		commandType = "";
	}
	
	public CommandResponse execute() {
		// TODO Auto-generated method stub
		return null;
	}	
}

class PredefinedFunctionCommand extends CommandObject{		
	public PredefinedFunctionCommand (){//default constructor
		commandType = "";
	}
	
	public CommandResponse execute() {
		// TODO Auto-generated method stub
		return null;
	}
}

//COMMAND HIERARCHY LEVEL 2

class VariableAssignmentCommand extends VarDefCommand{	
	String value, varName;
	
	public VariableAssignmentCommand (){//default constructor
		commandType = "";
	}
	
	public VariableAssignmentCommand (String varName, String value){
		commandType = "VariableAssignmentCommand";
		this.varName = varName;
		this.value = value;
	}
}

class AlphabetDefinitionCommand extends VarDefCommand{	
	String alphabetName;
	List<String> charList;
	
	public AlphabetDefinitionCommand (){//default constructor
		commandType = "";
	}
	
	public AlphabetDefinitionCommand (String alphabetName, List<String> charList){
		commandType = "AlphabetDefinitionCommand";
		this.alphabetName = alphabetName;
		this.charList = charList;
	}
	
}

class SubstitutionCommand extends StringCommand{
	String target, replacement;
	
	public SubstitutionCommand (){//default constructor
		commandType = "";
	}
	
	public SubstitutionCommand (String target, String replacement){//replacing a target string
		commandType = "SubstitutionCommand";
		this.target = target;
		this.replacement = replacement;
	}
}

class CompareCommand extends StringCommand{	
	String str1, str2;
	
	public CompareCommand (){//default constructor
		commandType = "";
	}
	
	public CompareCommand (String str1, String str2){//comparing 2 strings
		commandType = "CompareCommand";
		this.str1 = str1;
		this.str2 = str2;
	}
}

//////////////////PREDEFINED FUNCTIONS//////////////////
class CuttingTimesCommand extends PredefinedFunctionCommand{	
	String expr;
	
	public CuttingTimesCommand (){//default constructor
		commandType = "";
	}
	
	public CuttingTimesCommand (String expr){
		commandType = "CuttingTimesCommand";
		this.expr = expr;
	}
	
	@Override
	public CommandResponse execute() {
		
		CuttingTimes ct = new CuttingTimes();		
		CommandResponse resp = new CommandResponse(ct.cuttingTimes(expr));
		
		return resp;
	}
}

class StarProductCommand extends PredefinedFunctionCommand{	
	String str1, str2;
	
	public StarProductCommand (){//default constructor
		commandType = "";
	}
	
	public StarProductCommand (String str1, String str2){
		commandType = "StarProductCommand";
		this.str1 = str1;
		this.str2 = str2;
	}
	
	@Override
	public CommandResponse execute() {
		
		StarProduct sp = new StarProduct();
		CommandResponse resp = new CommandResponse(sp.starProduct(str1,str2));
		return resp;
	}
}

class ShiftMaximalityCommand extends PredefinedFunctionCommand{	
	String operand;
	
	public ShiftMaximalityCommand (){//default constructor
		commandType = "";
	}
	
	public ShiftMaximalityCommand (String operand){
		commandType = "ShiftMaximalityCommand";
		this.operand = operand;
	}
	
	@Override
	public CommandResponse execute() {
		
		ShiftMaximality sm = new ShiftMaximality();
		CommandResponse resp = new CommandResponse(sm.shiftMaximal(operand));
		
		return resp;	
	}
}

class WordCountCommand extends PredefinedFunctionCommand{	
	String str;
	//int subL;
	
	public WordCountCommand (){//default constructor
		commandType = "";
	}
	
	public WordCountCommand (String str){
		commandType = "WordCountCommand";
		this.str = str;
		//this.subL = i;
	}
	
	@Override 
	public CommandResponse execute() {
		
		WordCount wc = new WordCount();
		CommandResponse resp = new CommandResponse(wc.wordCount(str, 0)); //need an int parameter
		
		return resp;	
	}
}

//////////////////END PREDEFINED FUNCTIONS//////////////////

class BuildCommand extends PredefinedFunctionCommand{	
	String str;
		
	public BuildCommand (){//default constructor
		commandType = "";
	}
	
	public BuildCommand (String str){
		commandType = "BuildCommand";
		this.str = str;
	}
}

class ConcatenationCommand extends PredefinedFunctionCommand{	
	String baseStr, concatStr;
	int index;
	
	public ConcatenationCommand (){	//default constructor
		commandType = "";
	}
	
	public ConcatenationCommand (String baseStr, String concatStr){//concatenate concatStr to end baseStr
		commandType = "ConcatenationCommand";
		this.baseStr = baseStr;
		this.concatStr = concatStr;
	}
	
	public ConcatenationCommand (String baseStr, String concatStr, int index){//concatenate concatStr to baseStr at index
		commandType = "ConcatenationCommand";
		this.baseStr = baseStr;
		this.concatStr = concatStr;
		this.index = index;
	}
}
