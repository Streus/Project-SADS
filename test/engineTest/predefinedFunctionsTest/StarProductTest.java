package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.PredefinedFunctions.StarProduct;

public class StarProductTest
{
	@Test
	public void StarProductTester()
	{
		StarProduct tester = new StarProduct();
		
		String calcSPo = tester.starProduct("10101", "1001");
		String actualSPo = "101010101011101011101010";
		String calcSPe = tester.starProduct("101101", "00010");
		String actualSPe = "10110101011010101101010110111011010";
		
		//Odd example
		assertEquals(calcSPo, actualSPo);
		
		//Even Example
		assertEquals(calcSPe, actualSPe);
	}
}