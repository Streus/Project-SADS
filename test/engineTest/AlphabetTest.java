package engineTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Alphabet;
import engine.Alphabet.Rule;

public class AlphabetTest {

	@Before
	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	/**
	 * Tests the most basic use cases of an Alphabet (no generation/rules)
	 */
	@Test
	public void basicDefine()
	{
		String charA = "0", charB = "1";
		Alphabet a = new Alphabet(new String[]{charA, charB});
		
		assertTrue("Alphabet should be size 2. Is " + a.size(), a.size() == 2);
		assertTrue("Alphabet doesn't contain \"" + charA + "\" character", a.contains(charA));
		assertTrue("Alphabet doesn't contain \"" + charB + "\" character", a.contains(charB));
		
		for(int i = 0; i < a.size(); i++)
		{
			try {
				a.getChar(i);
			} catch (IndexOutOfBoundsException e) {
				fail("Alphabet threw " + e.getMessage() + " at index " + i);
			}
		}
	}

	/**
	 * Tests the character + rule set defining constructor for Alphabet
	 */
	@Test
	public void advancedDefine()
	{
		String[] chars = new String[] {"0", "1"};
		Rule[] rules = new Rule[] {new Rule(0, 1), new Rule(1, 0)};
		Alphabet a = new Alphabet(chars, rules);
		
		assertTrue("Alphabet should be size " + chars.length + ", Is " + a.size(), a.size() == chars.length);
		for(int i = 0; i < chars.length; i++)
		{
			assertTrue("Alphabet should contain \"" + chars[i] + "\", but it doesn't", a.contains(chars[i]));
		}
	}
	
	/**
	 * Tests the capability of the sub-Alphabet constructor
	 */
	@Test
	public void constructorDefine()
	{
		String[] chars = new String[] {"0", "1"};
		Rule[] rules = new Rule[] {new Rule(0, 1), new Rule(1, 0)};
		Alphabet a = new Alphabet(chars, rules);
		Alphabet b = new Alphabet(chars);
		
		Alphabet c, d;
		try
		{
			c = new Alphabet(a);
			assertTrue("C is not a child of A", c.isChildOf(a));
		}
		catch(NullPointerException npe)
		{
			fail("Failed to derive C from A");
		}
		
		try
		{
			d = new Alphabet(b);
		}
		catch(NullPointerException npe)
		{
			return;
		}
		
		fail("Derivation of D from B did not fail");
	}
	
	/**
	 * Tests the capability of the generate method to generate higher level alphabets from a base alphabet
	 */
	@Test
	public void basicForwardGenerate()
	{
		String[] chars = new String[] {"0", "1"};
		Rule[] rules = new Rule[] {new Rule(0, 1), new Rule(1, 0)};
		int targetLevel = 2;
		Alphabet a = new Alphabet(chars, rules);
		
		Alphabet b = Alphabet.generate(a, targetLevel);
		
		assertTrue("Generated alphabet should be size " + chars.length + ", but is " + b.size(), b.size() == chars.length);
		
		for(int i = 0; i < chars.length; i++)
			assertFalse("Alphabet should not contain \"" + chars[i] + "\", but it does", b.contains(chars[i]));
		
		assertTrue("Generated alphabet should contain \"01\", but it doesn't", b.contains("01"));
		assertTrue("Generated alphabet should contain \"10\", but it doesn't", b.contains("10"));
	}
	
	/**
	 * Tests the capability of the generate method to retrieve previously generated alphabet levels from an alphabet hierarchy
	 */
	@Test
	public void backtrackGenerate()
	{
		String[] chars = new String[] {"0", "1"};
		Rule[] rules = new Rule[] {new Rule(0, 1), new Rule(1, 0)};
		int highestLevel = 10, targetLevel = 2;
		Alphabet a = new Alphabet(chars, rules);
		a = Alphabet.generate(a, highestLevel);
		
		Alphabet b = Alphabet.generate(a, targetLevel);
		
		assertTrue("Generated alphabet should be size " + chars.length + ", but is " + b.size(), b.size() == chars.length);
		
		for(int i = 0; i < chars.length; i++)
			assertFalse("Alphabet should not contain \"" + chars[i] + "\", but it does", b.contains(chars[i]));
		
		assertTrue("Generated alphabet should contain \"01\", but it doesn't", b.contains("01"));
		assertTrue("Generated alphabet should contain \"10\", but it doesn't", b.contains("10"));
	}
	
	/**
	 * Tests the generate method's ability to bounce back an alphabet reference if the target level is the base's level
	 */
	@Test
	public void reboundGenerate()
	{
		String[] chars = new String[] {"0", "1"};
		Rule[] rules = new Rule[] {new Rule(0, 1), new Rule(1, 0)};
		int targetLevel = 2;
		Alphabet a = Alphabet.generate(new Alphabet(chars, rules), targetLevel);
		Alphabet b = Alphabet.generate(a, targetLevel);
		
		assertTrue("A and B should be pointing to the same Alphabet object, but they are not", a == b);
	}
}
