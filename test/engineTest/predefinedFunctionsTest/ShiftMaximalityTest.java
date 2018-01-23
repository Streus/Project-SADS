package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.CONSTS;
import engine.PredefinedFunctions.ShiftMaximality;
import engineTest.predefinedFunctionsTest.SmStringGenerator;


public class ShiftMaximalityTest {
	
	public static final int FIBONACCI_ITERATIONS = 5;
	public static final int SPGEN_ITERATIONS = 5;
	public static final int SPGENV2_ITERATIONS = 5;
	public static final int SPGENV2FAIL_ITERATIONS = 5;
	
	public static final String SPGEN_STR = "100101";
	//public static final String SPGEN_FAIL_STR = "101001";

	@Test
	public void ShiftMaximalTester() {
		
		String nullStr = null;
		
		//shift maximal = true
		assertEquals(ShiftMaximality.shiftMaximal("101110101011101"), CONSTS.SUCCESS);
		
		assertEquals(ShiftMaximality.shiftMaximal("10101010101010"), CONSTS.SUCCESS);
		
		//shift maximal = false
		assertEquals(ShiftMaximality.shiftMaximal("101001*"), CONSTS.FAILURE);
		
		assertEquals(ShiftMaximality.shiftMaximal("10100011011100011010101110"), CONSTS.FAILURE);
		
		//empty string 
		assertEquals(ShiftMaximality.shiftMaximal(""), -2);
		
		//null string
		assertEquals(ShiftMaximality.shiftMaximal(nullStr), -2);
		
		
		
	}
	
	@Test
	public void stringGenTester() {
		
		for (int i = 1; i <= FIBONACCI_ITERATIONS; i++) {
			String smFib = SmStringGenerator.fibonacciGen(i);
			assertEquals(ShiftMaximality.shiftMaximal(smFib), CONSTS.SUCCESS);
		}
		
		for (int i = 1; i <= SPGEN_ITERATIONS; i++) {
			String smStr = SmStringGenerator.spGen(i);
			assertEquals(ShiftMaximality.shiftMaximal(smStr), CONSTS.SUCCESS);
		}
		
		for (int i = 1; i <= SPGENV2_ITERATIONS; i++) {
			String smStr = SmStringGenerator.spGenV2(SPGEN_STR, i);
			assertEquals(ShiftMaximality.shiftMaximal(smStr), CONSTS.SUCCESS);
		}
		
		for (int i = 1; i <= SPGENV2FAIL_ITERATIONS; i++) {
			String smStr = SmStringGenerator.spGenV2Fail(SPGEN_STR, i);
			assertEquals(ShiftMaximality.shiftMaximal(smStr), CONSTS.FAILURE);
		}
		
	}

}
