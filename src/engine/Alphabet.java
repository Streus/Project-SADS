package engine;

import gui.Console;

/**
 * Represents an Alphabet structure, which contains a set of characters, which are arrangements of symbols,
 * and a set of rules, which are used to generate higher level Alphabets with more complex characters
 * @author Sam 'Streus' Streed
 *
 */
public class Alphabet implements Comparable<Alphabet>
{
	/* Static Variables */
	
	private static final int INITAL_LEVEL = 1;
	
	/* Static Methods */
	
	/**
	 * Generates an Alphabet at the given level using a given Alphabet as a base.
	 * If given level is invalid, returns null.
	 * @param base - original alphabet
	 * @param level - target level to generate
	 * @return an Alphabet at the given level
	 */
	public static Alphabet generate(Alphabet base, int level)
	{
		//level is invalid
		if(level < INITAL_LEVEL)
			return null;
		
		//you got it, ya weenie
		if(base.level == level)
			return base;
		
		//it was generated a while back, go get it
		if(base.level > level)
		{
			int count = base.level - level;
			Alphabet target = base;
			for(int i = 0; i < count; i++)
				target = target.parent;
			return target;
		}
		
		//hey, we actually need to generate it, waddya know?
		Alphabet result = base;
		for(int i = 0, c = level - base.level; i < c; i++)
		{
			result = new Alphabet(result);
		}
		return result;
	}
	
	/* Instance Variables */
	
	/**
	 * The alphabet this alphabet was built from, if one exists
	 */
	private Alphabet parent;
	
	/**
	 * List of all the characters that are members of this alphabet
	 */
	private String[] characters;
	
	/**
	 * The rules used to generate higher levels of this Alphabet
	 */
	private Rule[] rules;
	
	/**
	 * Used by string building to identify alphabet level
	 */
	private int level;
	
	/* Instance Methods */
	
	public Alphabet(String[] chars)
	{
		parent = null;
		
		if(chars == null)
			throw new IllegalArgumentException("Character Set must be non-null");
		
		characters = chars;
		rules = null;
		level = INITAL_LEVEL;
		
	}
	public Alphabet(String[] chars, Rule[] r)
	{
		parent = null;
		
		//set checks
		if(chars == null || r == null)
			throw new IllegalArgumentException("Character and Rule sets must be non-null.");
		if(r.length != chars.length)
			throw new IllegalArgumentException("Rule count does not match Character count.");
		
		characters = chars;
		rules = r;
		level = INITAL_LEVEL;
	}
	public Alphabet(Alphabet parent) throws NullPointerException
	{
		this.parent = parent;
		
		if(parent.rules == null)
			throw new NullPointerException("Cannot generate a child Alphabet from a parent without a rule set. Give the parent Alphabet a rule set first.");
		
		characters = new String[parent.characters.length];
		
		//generate characters from parent characters using parent rule set
		for(int i = 0; i < characters.length; i++)
		{
			characters[i] = parent.rules[i].apply(parent.characters);
		}
		
		rules = parent.rules;
		
		level = parent.level + 1;
	}
	
	/**
	 * Checks if the given character is considered valid under this Alphabet
	 * @param character - the character to check for
	 * @return whether the character is a member of this alphabet
	 */
	public boolean contains(String character)
	{
		for(int i = 0; i < characters.length; i++)
		{
			if(characters[i].equals(character))
				return true;
		}
		return false;
	}
	
	/**
	 * @return the number of member characters in this Alphabet
	 */
	public int size()
	{
		return characters.length;
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 * @throws IndexOutOfBoundsException
	 */
	public String getChar(int index) throws IndexOutOfBoundsException
	{
		return characters[index];
	}
	
	/**
	 * Checks if this Alphabet was generated using the given Alphabet
	 * @param a - the possible parent alphabet
	 * @return true if a is a parent, false otherwise
	 */
	public boolean isChildOf(Alphabet a)
	{
		if(a == this)
			return false;
		
		Alphabet parent = this.parent;
		while(parent != null)
		{
			if(parent.equals(a))
				return true;
			
			parent = parent.parent;
		}
		return false;
	}
	
	/**
	 * Sets the rules for a rule-less Alphabet
	 * @param r
	 */
	private void setRules(Rule[] r)
	{
		if(rules == null)
			rules = r;
	}
	
	@Override
	public boolean equals(Object other)
	{
		Alphabet a = (Alphabet)other;
		if(a.level != this.level)
			return false;
		if(!a.characters.equals(this.characters))
			return false;
		if(!a.rules.equals(this.rules))
			return false;
		
		return true;
	}
	
	@Override
	public int compareTo(Alphabet o)
	{
		if(o == null)
			return 0;
		else if(o.level < level)
			return 1;
		else if(o.level > level)
			return -1;
		return 0;
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		String str = "{";
		str += "\"" + characters[0] + "\"";
		for(int i = 1; i < characters.length; i++)
		{
			str += ", \"" + characters[i]  + "\"";
		}
		str += "}";
		return str;
	}
	
	/* Inner Types */
	
	/**
	 * 
	 * @author Sam 'Streus' Streed
	 *
	 */
	public static class Rule
	{
		/* Instance Vars */
		
		/**
		 * Character indexes from an alphabet that will be used to make a new, higher-level character
		 */
		private int[] chars;
		
		/* Instance Methods */
		
		public Rule(int... chars)
		{
			this.chars = chars;
		}
		
		/**
		 * Create a new character from a given set of characters using this Rule
		 * @param chars - the character set to operate from
		 * @return A new character generated using the given set
		 */
		public String apply(String... chars)
		{
			String c = "";
			try
			{
				for(int i = 0; i < this.chars.length; i++)
				{
					c += chars[this.chars[i]];
				}
			}
			catch(IndexOutOfBoundsException ioobe)
			{
				System.err.println(ioobe.getMessage());
				Console.println("Tried to apply invalid rule!", Console.getErr());
				return "<ERROR>";
			}
			return c;
		}
		
		/**
		 * 
		 */
		public String toString()
		{
			String str = "{ ";
			if(chars.length > 0)
			{
				str += chars[0];
				for(int i = 1; i < chars.length; i++)
				{
					str += ", " + chars[i];
				}
			}
			str += " }";
			return str;
		}
	}
}
