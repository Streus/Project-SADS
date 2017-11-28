package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.PredefinedFunctions.CuttingTimes;

public class CuttingTimesTest {

	@Test
	public void test() {
		
		CuttingTimes tester = new CuttingTimes();
		String nullStr = null;
		
		//cutting times test
		int[] calcCuttingX = tester.cuttingTimes("1011011");
		int[] actualCuttingX = new int[]{1,2,4,5,7};
		assertArrayEquals(calcCuttingX, actualCuttingX);
		
		CuttingTimes tester2 = new CuttingTimes();
		//another test
		int[] calcCuttingX2 = tester2.cuttingTimes("1011101010111011");
		int[] actualCuttingX2 = new int[]{1,2,4,8,16};
		assertArrayEquals(calcCuttingX2, actualCuttingX2);
		
		CuttingTimes tester3 = new CuttingTimes();
		//empty string
		int[] invalidInput = new int[1];
		invalidInput[0] = -1;
		int[] calcEmptyString = tester3.cuttingTimes("");
		assertArrayEquals(calcEmptyString, invalidInput);
		
		CuttingTimes tester4 = new CuttingTimes();
		//null string
		int[] calcNullString = tester4.cuttingTimes(nullStr);
		assertArrayEquals(calcNullString, invalidInput);
		
	}

}
