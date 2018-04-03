package engineTest.predefinedFunctionsTest;

import java.util.Scanner;

import engine.PredefinedFunctions.CuttingTimes;

/**
 * Includes various methods to be used in the ShiftMaximalityTest class 
 * 
 * @author LaFol
 *
 */
public class SmStringGenerator {

	final static String one = "1";
	final static String zero = "0";
	
	/**
	 * Generates an size 2^n - 1 string (n being the numberOfCycles) 
	 * that is always known to be shift maximal. Takes an original string (1)
	 * and adds alternating 0's and 1's (starting 0) between copies of the 
	 * newly concatenated string
	 * 
	 * Note: numOfCycles should ideally be larger than 1 
	 * 
	 * ************************************************
	 *             EXAMPLE TEST CASE 
	 *             (numOfCycles = 4)
	 *      
	 * begin with smString "1"
	 * 
	 * First iteration   - 0: 101
	 * Second iteration  - 1: 1011101
	 * Third iteration   - 0: 101110101011101
	 * Fourth iteration  - 1: 1011101010111011101110101011101
	 *
	 * ************************************************
	 * 
	 * @param numOfCycles - how many iterations of generation to be done
	 * @return - A Shift Maximal String to be tested
	 */
	public static String spGen(int numOfCycles) { 
		
		String smString = "1";
		
		for (int i=0; i<numOfCycles; i++) {
			
			String currString = smString;
			
			if (i%2 == 0) { //even
				smString = smString.concat(zero).concat(currString);
			}
			else { //odd
				smString = smString.concat(one).concat(currString);
			}
		}
		
//		System.out.println(smString);
		
		return smString;
		
	}
	
	/**
	 * Generates string that should always be shift maximal
	 * *the size of the string is exponentially dependent on the number
	 *  of iterations
	 * 
	 * ************************************************
	 *             EXAMPLE TEST CASE 
	 *   (initial string: 100101) - odd number of 0's
	 *             (iterations = 3)
	 * iteration  
	 * 1 - 1001010100101
	 * 2 - 100101010010111001010100101
	 * 3 - 1001010100101110010101001010100101010010111001010100101
	 * 
	 * ************************************************
	 * 
	 * @param smString - the original string *Needs to be SM*
	 * @param iterations - how many times the string should be copied
	 * @return - a shift maximal string
	 */
	public static String spGenV2(String smString, int iterations) { 
		
		int count = 0;
		int middleNum;
		
		//find even or odd number of 1's
	    for (int i=0; i < smString.length(); i++)
	    {
	        if (smString.charAt(i) == '1')
	        {
	             count++;
	        }
	    }
	    
	    //if even, start with 1 and alternate, else start with 0 and alternate
	    if (count%2 == 0) {
	    	middleNum = 1;
	    }
	    else {
	    	middleNum = 0;
	    }
		
	    //create the shift maximal string
	    for (int i=0; i<iterations; i++) {
	    	
	    	String smCopy = smString;
	    	smString = smString.concat(Integer.toString(middleNum));
	    	smString = smString.concat(smCopy);
	    	middleNum ^= 1;
	    	
//	    	System.out.println("Iteration: " + (i+1) + " String: " + smString);
	    }
	    
	    
	    return smString;
	}
	
	/**
	 * The exact same functionality as spGenV2 but instead creates a string that 
	 * should never be shift maximal
	 * 
	 * @param non_smString - the original string *Needs to be SM*
	 * @param iterations - how many times the string should be copied
	 * @return - a non shift maximal string
	 */
	public static String spGenV2Fail(String non_smString, int iterations) { 
		
		int count = 0;
		int middleNum;
		
		//find even or odd number of 1's
	    for (int i=0; i < non_smString.length(); i++)
	    {
	        if (non_smString.charAt(i) == '1')
	        {
	             count++;
	        }
	    }
	    
	    //if even, start with 0 and alternate, else start with 1 and alternate
	    if (count%2 == 0) {
	    	middleNum = 0;
	    }
	    else {
	    	middleNum = 1;
	    }
		
	    //create the shift maximal string
	    for (int i=0; i<iterations; i++) {
	    	
	    	String smCopy = non_smString;
	    	non_smString = non_smString.concat(Integer.toString(middleNum));
	    	non_smString = non_smString.concat(smCopy);
	    	middleNum ^= 1;
	    	
//	    	System.out.println("Iteration: " + (i+1) + " String: " + non_smString);
	    }
	    
	    non_smString = non_smString.concat(Integer.toString(middleNum));
	    return non_smString;
	}
	
	/**
	 * Generates a exponentially growing string whose cutting times resemble a subset 
	 * of the countably infinite Fibonacci sequence. 
	 * 
	 * Note: the binary string generated should always prove to be shift maximal
	 * 
	 * |see https://courses.engr.illinois.edu/cs473/sp2010/notes/99-recurrences.pdf |
	 * |for proof of growth                                                         |
	 * 
	 * @param lengthOfFibonacci
	 * @return - a shift maximal string
	 */
	public static String fibonacciGen(int lengthOfFibonacci) {
		String smString = "10";
		int prevFib = 1;
		int currFib = 2;
		int nextFib = 3;
		int numOfFib = 2;
		
		while (numOfFib + 1 <= lengthOfFibonacci) { // iterate so the string returned has a cutting time/fibonacci sequence of lengthOfFibonacci
			
			for (int i = 0; i < prevFib - 1; i++) { // add prevFib - 1 repeat characters to the string
				smString = smString.concat(Character.toString(smString.charAt(i))); 
			}
			if (smString.charAt(prevFib - 1) == '0') { //flip the next digit added
				smString = smString.concat("1");
			} else {
				smString = smString.concat("0");
			}
			//assign next fibonacci number and increment iterations
			prevFib = currFib;
			currFib = nextFib;
			nextFib = currFib + prevFib;
			numOfFib++;
		
//			System.out.println("Current Fibonacci String: " + smString + " after " + (numOfFib - 2) + " iterations . . ." );
//			System.out.println();
		}
		
		//System.out.println("FINAL STRING: " + smString);
		
		return smString;
		
		} 
	
	
	 /* 
	  * when we create better string building methods we could create infinite 
	  * shift maximal sequences with a finite sm strings and an infinite sm strings
	  */
//	 public static String fin_infinGen() {
//		 
//	 }
	
	//output test for generating functions
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the number of Fibonacci digits to be calculated: ");
//		int i = scan.nextInt();
//		String fibStr = fibonacciGen(i);
//		System.out.print("Generating Fibonacci String . . .");
//		System.out.println();
//		System.out.println("The Shift Maximal string whose cutting times represent the first" + i + "digits of the fibonacci sequence is: " + fibStr);
//		System.out.println();
//		System.out.println("The Cutting Times calculation of this string and resulting fibonacci sequence is: ");
//		int[] fibArray = CuttingTimes.cuttingTimes(fibStr);
//		
//		for (int x=0; x<fibArray.length; x++) {
//			System.out.print(fibArray[x] + ",");
//		}
		
		
//		spGen(4);
//		spGenV2("100101", 4);
//		spGenV2Fail("100101", 4);

//	}
}
