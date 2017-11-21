package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.PredefinedFunctions.CuttingTimes;

public class CuttingTimesTest {

	@Test
	public void test() {
		
		CuttingTimes tester = new CuttingTimes();
		
		//cutting times test
		int[] calcCuttingX = tester.cuttingTimes("1011011");
		int[] actualCuttingX = new int[]{1,2,4,5,7};
		assertArrayEquals(calcCuttingX, actualCuttingX);
		
		//empty string
		int[] invalidInput = new int[1];
		invalidInput[0] = -1;
		int[] calcEmptyString = tester.cuttingTimes("");
		assertArrayEquals(calcEmptyString, invalidInput);
		
		//null string
		int[] calcNullString = tester.cuttingTimes(null);
		assertArrayEquals(calcNullString, invalidInput);
	
	}

}
