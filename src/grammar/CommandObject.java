package grammar;
import java.util.*;
//Command Objects to processed in the Engine

import engine.UniqueSymbolGenerator;
import engine.PredefinedFunctions.CuttingTimes;
import engine.PredefinedFunctions.ShiftMaximality;
import engine.PredefinedFunctions.StarProduct;
import engine.PredefinedFunctions.WordCount;
import engine.command.CommandResponse;
import gui.Console;
import engine.SymbolTable;
import engine.Concatenation;
import engine.SADSstring;
import engine.Alphabet;
import engine.Alphabet.Rule;
import engine.AlphabetSymbolTable;
import engine.Compare;
import engine.CONSTS;

//COMMAND HIERARCHY LEVEL 0
public abstract class CommandObject<T>
{
	protected static UniqueSymbolGenerator symbolGen;
	protected static SymbolTable<String, Object> st;
	
	static
	{
		symbolGen = new UniqueSymbolGenerator();
		st = new SymbolTable<String, Object>();
		st.addSymbol(CONSTS.LASTEXEC, null);
	}
	
	public abstract T execute();
}

//COMMAND HIERARCHY LEVEL 1
abstract class VarDefCommand<S> extends CommandObject<S> { }

abstract class StringCommand extends CommandObject<String> { }

abstract class PredefinedFunctionCommand extends CommandObject<String> { }

abstract class AlphabetCommand extends CommandObject<Alphabet> { }

class PrintCommand extends CommandObject<Object>
{
	private CommandObject<Object> printString;
	
	public PrintCommand (CommandObject<Object> printString) {
		this.printString = printString;
	}
	
	public String execute() 
	{
		Object executedPrintString = printString.execute();
		if(executedPrintString == null) {
			Console.print("Null printString");
			//st.addSymbol(CONSTS.LASTEXEC, "Null printString");
		}
		else {
			Console.println(executedPrintString.toString());
			//st.addSymbol(CONSTS.LASTEXEC, executedPrintString.toString());
		}
		
		return null;
	}
}

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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + value);
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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass());
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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		CommandResponse resp = new CommandResponse(CuttingTimes.cuttingTimes(expr.execute()));
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		CommandResponse resp = new CommandResponse(ShiftMaximality.shiftMaximal((String)operand.execute()));
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass());
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
			st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
			return resp.returnVal;			
		}
		else
		{
			CommandResponse resp = new CommandResponse(concat.Insert(baseStr.execute(), concatStr.execute(), index.execute().intValue()));
			st.addSymbol(CONSTS.LASTEXEC,CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + resp.returnVal);
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
		//st.addSymbol(CONSTS.LASTEXEC, value); - gets called after some other commands, messes up the last exec functionality - (last exec wont work for literal commands for now)
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
		return st.get(name);
	}
}

class DefineRule extends CommandObject<Alphabet.Rule>
{
	private int[] chars;
	
	public DefineRule(int[] chars)
	{
		this.chars = chars;
	}
	
	@Override
	public Rule execute()
	{
		Alphabet.Rule r = new Alphabet.Rule(chars);
		st.addSymbol(CONSTS.LASTEXEC,CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + r);
		return r;
	}
}

class DefineAlphabet extends AlphabetCommand
{
	private String[] chars;
	
	private DefineRule[] rules;
	
	public DefineAlphabet(String[] chars)
	{
		this.chars = chars;
		rules = null;
	}
	
	public DefineAlphabet(String[] chars, DefineRule[] rules)
	{
		this.chars = chars;
		this.rules = rules;
	}
	
	@Override
	public Alphabet execute()
	{
		Alphabet a;
		if(rules == null)
			a = new Alphabet(chars);
		else
		{
			Alphabet.Rule[] rules = new Alphabet.Rule[chars.length];
			for(int i = 0; i < rules.length; i++)
				rules[i] = this.rules[i].execute();
			a = new Alphabet(chars, rules);
		}
		
		//TODO symbol table storage
		st.addSymbol(CONSTS.LASTEXEC,CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + a);
		return a;
	}
}

class DeriveAlphabet extends AlphabetCommand
{
	private AlphabetCommand base;
	private CommandObject<Integer> targetLevel;
	private String variableName;
	
	public DeriveAlphabet(AlphabetCommand a, CommandObject<Integer> level)
	{
		base = a;
		targetLevel = level;
		variableName = "";
	}
	
	public DeriveAlphabet(String variableName, CommandObject<Integer> level)
	{
		base = new AlphabetLiteral((Alphabet)st.get(variableName));
		this.variableName = variableName;
		targetLevel = level;
	}
	
	@Override
	public Alphabet execute()
	{
		Alphabet start = base.execute();
		Alphabet generated = Alphabet.generate(start, targetLevel.execute());
		if(!variableName.equals("") && start.compareTo(generated) == -1)
			st.addSymbol(variableName, generated);
		
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + generated);
		return generated;
	}
}

class AlphabetLiteral extends AlphabetCommand
{
	private Alphabet alpha;
	
	public AlphabetLiteral(Alphabet a)
	{
		alpha = a;
	}
	
	@Override
	public Alphabet execute()
	{
		st.addSymbol(CONSTS.LASTEXEC, CONSTS.LASTEXECPREFIX + this.getClass() + CONSTS.LASTEXECPREFIX1 + alpha);
		return alpha;
	}
}
