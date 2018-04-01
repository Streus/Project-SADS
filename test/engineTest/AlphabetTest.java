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

	@Test
	public void advancedDefine()
	{
		String[] chars = new String[] {"0", "1"};
		Rule[] rules = new Rule[] {new Rule(1, 2), new Rule(2, 1)};
		
		Alphabet a = new Alphabet(chars, rules);
		
		assertTrue("Alphabet should be size " + chars.length + ", Is " + a.size(), a.size() == chars.length);
		for(int i = 0; i < chars.length; i++)
		{
			assertTrue("Alphabet should contain \"" + chars[i] + "\", but it doesn't", a.contains(chars[i]));
		}
	}
	
	@Test
	public void basicGenerate()
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
}
