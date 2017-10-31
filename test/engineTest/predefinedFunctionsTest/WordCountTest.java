package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import engine.PredefinedFunctions.WordCount;

public class WordCountTest
{
	@Test
	public void WordCountTester()
	{
		WordCount tester = new WordCount();
		
		Map<String, Integer> calcWC = tester.wordCount("101101", 3);
		Map<String, Integer> actualWC = new HashMap<String, Integer>();
		actualWC.put("011", 1);
		actualWC.put("110", 1);
		actualWC.put("101", 2);
		
		assertEquals(calcWC, actualWC);
	}
}

