package grammar;
import java.util.List;
//Command Objects to be passed to the Engine

//COMMAND HIERARCHY LEVEL 0
public abstract class CommandObject{										
	public String commandType;
	
	public CommandObject(){//default constructor
		commandType = "";
	}
	
}

//COMMAND HIERARCHY LEVEL 1

class VarDefCommand extends CommandObject{					
	public VarDefCommand (){//default constructor
		commandType = "";
	}
}

class StringCommand extends CommandObject{					
	public StringCommand (){//default constructor
		commandType = "";
	}
	
}

class PredefinedFunctionCommand extends CommandObject{		
	public PredefinedFunctionCommand (){//default constructor
		commandType = "";
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

class CuttingTimesCommand extends PredefinedFunctionCommand{	
	String expr;
	
	public CuttingTimesCommand (){//default constructor
		commandType = "";
	}
	
	public CuttingTimesCommand (String expr){
		commandType = "CuttingTimesCommand";
		this.expr = expr;
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
}

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

class ShiftMaximalityCommand extends PredefinedFunctionCommand{	
	String operand;
	
	public ShiftMaximalityCommand (){//default constructor
		commandType = "";
	}
	
	public ShiftMaximalityCommand (String operand){
		commandType = "ShiftMaximalityCommand";
		this.operand = operand;
	}
}

class WordCountCommand extends PredefinedFunctionCommand{	
	String str;
	
	public WordCountCommand (){//default constructor
		commandType = "";
	}
	
	public WordCountCommand (String str){
		commandType = "WordCountCommand";
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
