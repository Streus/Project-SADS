package grammar;
import java.util.*;
//Command Objects to processed in the Engine

import engine.UniqueSymbolGenerator;
import engine.PredefinedFunctions.CuttingTimes;
import engine.PredefinedFunctions.ShiftMaximality;
import engine.PredefinedFunctions.StarProduct;
import engine.PredefinedFunctions.WordCount;
import engine.command.CommandResponse;
import engine.SymbolTable;
import engine.Concatenation;
import engine.SADSstring;
import engine.Compare;

//COMMAND HIERARCHY LEVEL 0
public abstract class CommandObject<T>
{
	protected static UniqueSymbolGenerator symbolGen;
	protected static SymbolTable<String, Object> st;
	
	static
	{
		symbolGen = new UniqueSymbolGenerator();
		st = new SymbolTable<String, Object>();
	}
	
	public abstract T execute();
}

//COMMAND HIERARCHY LEVEL 1
abstract class VarDefCommand<S> extends CommandObject<S> { }

abstract class StringCommand extends CommandObject<String> { }

abstract class PredefinedFunctionCommand extends CommandObject<String> { }

//COMMAND HIERARCHY LEVEL 2

class VariableAssignmentCommand extends VarDefCommand<Object>
{	
	private CommandObject<Object> value;
	private String varName;

	public VariableAssignmentCommand (String varName, CommandObject<Object> value)
	{
		this.varName = varName;
		this.value = value;
	}

	@Override
	public Object execute()
	{
		st.addSymbol(varName, value.execute());	
		return value; //return the value?
	}
}

class AlphabetDefinitionCommand extends VarDefCommand<String> 
{	
	private CommandObject<String> alphabetName;
	private CommandObject<List<String>> charList;
	
	public AlphabetDefinitionCommand (CommandObject<String> alphabetName, CommandObject<List<String>> charList)
	{
		this.alphabetName = alphabetName;
		this.charList = charList;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public String execute()
	{
		return null; //return message to console?
	}
	
}

class SubstitutionCommand extends StringCommand
{
	private CommandObject<String> startString;
	private LinkedHashMap<String, String> map;

	public SubstitutionCommand (CommandObject<String> startString, LinkedHashMap<String, String> map)
	{
		this.startString = startString;
		this.map = map;
	}

	@Override
	public String execute()
	{
		SADSstring sad = new SADSstring();
		
		CommandResponse resp = new CommandResponse(sad.Sub(startString.execute(), map));
		return resp.returnVal;
	}
}

class CompareCommand extends StringCommand
{	
	private CommandObject<String> str1, str2;

	public CompareCommand (CommandObject<String> str1, CommandObject<String> str2)
	{
		this.str1 = str1;
		this.str2 = str2;
	}

	@Override
	public String execute()
	{
		Compare cmp = new Compare();
		
		CommandResponse resp = new CommandResponse(cmp.compareStrings(str1.execute(), str2.execute()));
		return resp.returnVal;
	}
}

//////////////////PREDEFINED FUNCTIONS//////////////////
class CuttingTimesCommand extends PredefinedFunctionCommand
{	
	private CommandObject<String> expr;

	public CuttingTimesCommand (CommandObject<String> expr)
	{
		this.expr = expr;
	}
	
	@Override
	public String execute()
	{
		CuttingTimes ct = new CuttingTimes();		
		CommandResponse resp = new CommandResponse(ct.cuttingTimes(expr.execute()));
		
		return resp.returnVal;
	}
}

class StarProductCommand extends PredefinedFunctionCommand
{	
	private CommandObject<String> str1, str2;

	public StarProductCommand (CommandObject<String> str1, CommandObject<String> str2)
	{
		this.str1 = str1;
		this.str2 = str2;
	}
	
	@Override
	public String execute()
	{
		StarProduct sp = new StarProduct();
		CommandResponse resp = new CommandResponse(sp.starProduct(str1.execute(), str2.execute()));
		return resp.returnVal;
	}
}

class ShiftMaximalityCommand extends PredefinedFunctionCommand
{	
	private CommandObject<String> operand;

	//constructor for string
	public ShiftMaximalityCommand (CommandObject<String> operand)
	{
		this.operand = operand;
	}
	
	@Override
	public String execute()
	{
		ShiftMaximality sm = new ShiftMaximality();
		CommandResponse resp = new CommandResponse(sm.shiftMaximal((String)operand.execute()));
		
		return resp.returnVal;	
	}
}

class WordCountCommand extends PredefinedFunctionCommand
{	
	private CommandObject<String> str;
	private CommandObject<Integer> index;
	
	public WordCountCommand (CommandObject<String> str, CommandObject<Integer> index)
	{
		this.str = str;
		this.index = index;
	}
	
	@Override 
	public String execute()
	{
		
		WordCount wc = new WordCount();
		CommandResponse resp = new CommandResponse(wc.wordCount(str.execute(), index.execute().intValue()));
		
		return resp.returnVal;	
	}
}

//////////////////END PREDEFINED FUNCTIONS//////////////////

class BuildCommand extends PredefinedFunctionCommand
{	
	private CommandObject<String> str;

	public BuildCommand (CommandObject<String> str)
	{
		this.str = str;
	}

	@Override
	public String execute()
	{
		//TODO
		return null;
	}
}

class ConcatenationCommand extends PredefinedFunctionCommand
{	
	private CommandObject<String> baseStr, concatStr;
	private CommandObject<Integer> index;

	public ConcatenationCommand (CommandObject<String> baseStr, CommandObject<String> concatStr)
	{
		this.baseStr = baseStr;
		this.concatStr = concatStr;
	}
	
	public ConcatenationCommand (CommandObject<String> baseStr, CommandObject<String> concatStr, CommandObject<Integer> index)
	{
		this.baseStr = baseStr;
		this.concatStr = concatStr;
		this.index = index;
	}

	@Override
	public String execute()
	{
		Concatenation concat = new Concatenation();
		
		if (index == null)
		{	
			CommandResponse resp = new CommandResponse(concat.concat(baseStr.execute(), concatStr.execute()));
			return resp.returnVal;			
		}
		else
		{
			CommandResponse resp = new CommandResponse(concat.Insert(baseStr.execute(), concatStr.execute(), index.execute().intValue()));
			return resp.returnVal;
		}
	}
}

class LiteralCommand<S> extends CommandObject<S>
{
	private S value;
	
	public LiteralCommand(S value)
	{
		this.value = value;
	}
	
	@Override
	public S execute()
	{
		return value;
	}
}

class ResolveVariable extends CommandObject<Object>
{
	private String name;
	
	public ResolveVariable(String name)
	{
		this.name = name;
	}
	
	@Override
	public Object execute()
	{
		System.out.println((String)st.get(name));
		return st.get(name);
	}
}
