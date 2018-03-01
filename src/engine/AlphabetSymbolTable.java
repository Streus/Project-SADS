package engine;

import java.util.ArrayList;
import java.util.stream.Collectors;

import engine.SymbolTable;
import gui.Console;

/**
 * AlphabetSymbolTable 
 * 
 * Contains the programs current alphabet and its corresponding characters 
 * for the engine side of the project
 * 
 * @author LaFol
 *
 */
public class AlphabetSymbolTable {

	private static String currAlphabet = "currAlphabet";
	static SymbolTable<String, ArrayList<Object>> AlphaSymbolTable = new SymbolTable<String, ArrayList<Object>>();
	
	//default
	public AlphabetSymbolTable() {
		
		ArrayList<Object> defaultAlphabet = new ArrayList<>();
		defaultAlphabet.add("1");
		defaultAlphabet.add("0");
		
		AlphaSymbolTable.addSymbol(currAlphabet, defaultAlphabet);
	}
	
	//user defined alphabet
	public AlphabetSymbolTable(ArrayList<Object> constructorAlpha) {
		
		AlphaSymbolTable.addSymbol(currAlphabet, constructorAlpha);
	}
	
	public static ArrayList<Object> getCurrentAlphabet() {
		ArrayList<Object> currAlpha = AlphaSymbolTable.get(currAlphabet);
		return currAlpha;
	}
	
	public static void setCurrentAlphabet(ArrayList<Object> newAlphabet) {   //change to boolean? how to check success/failure?
		AlphaSymbolTable.addSymbol(currAlphabet, newAlphabet);
	}
	
	/**
	 * Method to determine if a specific character 
	 * exists in the current alphabet 
	 * 
	 * @param s - the String to be checked
	 * @return true if char exists in alphabet, false otherwise
	 */
	public boolean isInAlphabet(Object s) {
		
		 ArrayList<Object> checkArray = AlphaSymbolTable.get("currAlphabet");
		 int x = checkArray.indexOf(s);  
				 
		 if (x == -1) {
			 return false;
		 }
		 else return true;
	 }
	
	public static void printAlphabet() {
		ArrayList<Object> printAlpha = getCurrentAlphabet();
		String alphabetString = printAlpha.stream().map(Object::toString).collect(Collectors.joining(", "));
		System.out.print("Current Alphabet: " + alphabetString);
		
	}
	
//	public static void main(String[] args) {
//		ArrayList<Object> stringAlpha = new ArrayList<Object>();
//		stringAlpha.add("1");
//		stringAlpha.add("0");
//		setCurrentAlphabet(stringAlpha);
//		printAlphabet();
//		
//		ArrayList<Object> intAlpha = new ArrayList<Object>();
//		int one = 1;
//		int zero = 0;
//		intAlpha.add(one);
//		intAlpha.add(zero);
//		setCurrentAlphabet(intAlpha);
//		printAlphabet();
//		
//		Object first = intAlpha.get(1);
//		boolean check = first instanceof Integer;
//		System.out.print(check);
//		
//		System.out.print(stringAlpha.get(1) instanceof String);
//	}
}



 