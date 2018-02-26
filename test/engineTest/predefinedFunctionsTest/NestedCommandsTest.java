package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import engine.CONSTS;
import engine.PredefinedFunctions.*;

public class NestedCommandsTest 
{
	@Test
	public void test() 
	{
		//Basic nested commands testing
		StarProduct spTest = new StarProduct();
		WordCount wcTest = new WordCount();
		ShiftMaximality smTest = new ShiftMaximality();
		CuttingTimes ctTest = new CuttingTimes();
		
		String spVar1 = spTest.starProduct("101", "010");
		
		//Star Product nested command test with Star Product
		//sp(sp("101", "010"), "01")
		String spNest = spTest.starProduct(spVar1, "01");
		assertEquals(spNest, "10101011101010111010101110101010101010111010101");
		
		//Word Count nested command test with Star Product
		//wc(sp("101", "010"), 3)
		Map<String, Integer> calcWC = wcTest.wordCount(spVar1, 3);
		Map<String, Integer> actualWC = new HashMap<String, Integer>();
		actualWC.put("101", 6);
		actualWC.put("010", 4);
		actualWC.put("011", 1);
		actualWC.put("110", 1);
		actualWC.put("111", 1);		
		assertEquals(calcWC, actualWC);
				
		//Shift Maximality nested command test with Star Product
		//sm(sp("101", "010"))
		assertEquals(smTest.shiftMaximal("101010111010101"), CONSTS.FAILURE);
		assertEquals(smTest.shiftMaximal(spVar1), CONSTS.FAILURE);
		
		//Cutting Times nested command test with Star Product
		//ct(sp("101", "010"))
		int[] calcCutting = ctTest.cuttingTimes(spVar1);
		int[] actualCutting = new int[]{1,2,8};
		assertArrayEquals(calcCutting, actualCutting);
	}
}
