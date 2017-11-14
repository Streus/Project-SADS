package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.PredefinedFunctions.CuttingTimes;

public class CuttingTimesTest {

	@Test
	public void test() {
		
		CuttingTimes tester = new CuttingTimes();
		
		int[] calcCutting1 = tester.cuttingTimes("1011011");
		int[] actualCutting1 = new int[]{1,2,4,5,7};

		assertArrayEquals(calcCutting1, actualCutting1);
		
		CuttingTimes tester2 = new CuttingTimes();
		
		int[] calcCutting2 = tester2.cuttingTimes("1011101010111011");
		int[] actualCutting2 = new int[]{1,2,4,8,16};

		assertArrayEquals(calcCutting2, actualCutting2);
	
	}

}
