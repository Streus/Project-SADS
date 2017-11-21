package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.CONSTS;
import engine.PredefinedFunctions.ShiftMaximality;

public class ShiftMaximalityTest {

	@Test
	public void ShiftMaximalTester() {
		
		String nullStr = null;
		
		ShiftMaximality tester = new ShiftMaximality();
		
		//shift maximal = true
		assertEquals(tester.shiftMaximal("101110101011101"), CONSTS.SUCCESS);
		
		//shift maximal = false
		assertEquals(tester.shiftMaximal("101001*"), CONSTS.FAILURE);
		
		//empty string 
		assertEquals(tester.shiftMaximal(""), -2);
		
		//null string
		assertEquals(tester.shiftMaximal(nullStr), -2);
		
	}

}
