package engine;

/**
 * 
 * @author Sam 'Streus' Streed
 *
 */
public class Alphabet
{
	/* Instance Variables */
	
	/**
	 * List of all the characters that are members of this alphabet
	 */
	private String[] characters;
	
	/**
	 * Used by string building to identify alphabet level
	 */
	private int level;
	
	/**
	 * The alphabet this alphabet was built from, if one exists
	 */
	private Alphabet parent;
	
	/* Instance Methods */
	
	public Alphabet(String... chars)
	{
		
	}
	public Alphabet(Alphabet parent, Rule[] r)
	{
		
	}
	
	/**
	 * Checks if the given character is considered valid under this Alphabet
	 * @param character - the character to check for
	 * @return whether the character is a member of this alphabet
	 */
	public boolean contains(String character)
	{
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
	 * 
	 */
	public String toString()
	{
		return "TODO - Alphabet#toString()";
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
			
		}
		
		/**
		 * 
		 * @param chars
		 * @return
		 */
		public String apply(String... chars)
		{
			return "TODO - Rule#apply()";
		}
		
		/**
		 * 
		 */
		public String toString()
		{
			return "TODO - Rule#toString()";
		}
	}
}
