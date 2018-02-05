package engineTest.predefinedFunctionsTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import engine.PredefinedFunctions.CuttingTimes;
import gui.Console;

/**
 * 
 * @author loganlafollette
 *
 */
public class CuttingTimesTest {
	
	public static final int FIB_ITER = 5;

	@Test
	public void test() {
		
		String nullStr = null;
		
		//cutting times test
		int[] calcCuttingX = CuttingTimes.cuttingTimes("1011011");
		int[] actualCuttingX = new int[]{1,2,4,5,7};
		assertArrayEquals(calcCuttingX, actualCuttingX);
		
		//another test
//		int[] calcCuttingX2 = CuttingTimes.cuttingTimes("1011101010111011");
//		int[] actualCuttingX2 = new int[]{1,2,4,8,16};
//		assertArrayEquals(calcCuttingX2, actualCuttingX2);
		
		//empty string
		int[] invalidInput = new int[1];
		invalidInput[0] = -1;
		int[] calcEmptyString = CuttingTimes.cuttingTimes("");
		assertArrayEquals(calcEmptyString, invalidInput);
		
		//null string
		int[] calcNullString = CuttingTimes.cuttingTimes(nullStr);
		assertArrayEquals(calcNullString, invalidInput);
		
		//fibonacciCurttingTimes
		String fibString = SmStringGenerator.fibonacciGen(FIB_ITER);
		int[] calcFibSequence = CuttingTimes.cuttingTimes(fibString);
		ArrayList<Integer> fibList = fibonacciLoop(FIB_ITER);
		int[] actualFibSequence = new int[FIB_ITER];
		
		for (int i=0; i<FIB_ITER; i++) {
			actualFibSequence[i] = fibList.get(i);
		}
		
		assertArrayEquals(calcFibSequence, actualFibSequence);
	}
	/**
	 * 
	 * @param number
	 * @return
	 */
	public static ArrayList<Integer> fibonacciLoop(int number) {
		//using a fixed size here so this array needs 
		//to update with the tester, using int array
		//because of cutting times return type
		ArrayList<Integer> fibList= new ArrayList<Integer>();
		fibList.add(1);
		
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 0; i < number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
			fibList.add(fibonacci);
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibList; // Fibonacci number
	}
	
	public static String printList(int[] arg) {
		String arrayString = "";
		for (int i=0; i<arg.length; i++) {
			arrayString+=String.valueOf(arg[i]);
			arrayString+=",";
		}
		return arrayString;
	}
	
//	public static void main(String[] args) {
//		
//		//fibonacciCurttingTimes
//		String fibString = SmStringGenerator.fibonacciGen(FIB_ITER);
//		int[] calcFibSequence = CuttingTimes.cuttingTimes(fibString);
//		ArrayList<Integer> fibList = fibonacciLoop(FIB_ITER);
//		int[] actualFibArray = new int[FIB_ITER];
//		
//		for (int i=0; i<FIB_ITER; i++) {
//			actualFibArray[i] = fibList.get(i);
//		}
//		String s1 = printList(actualFibArray);
//		String s2 = printList(calcFibSequence);
//		
//		System.out.println(s1);
//		System.out.println();
//		System.out.println(s2);
//	}


}
