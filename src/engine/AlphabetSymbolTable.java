package engine;

import java.util.ArrayList;
import engine.SymbolTable;

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

	private String currAlphabet = "currAlphabet";
	SymbolTable<String, ArrayList<Character>> AlphaSymbolTable = new SymbolTable<String, ArrayList<Character>>();
	
	//default
	public AlphabetSymbolTable() {
		
		ArrayList<Character> defaultAlphabet = new ArrayList<>();
		defaultAlphabet.add('1');
		defaultAlphabet.add('0');
		
		AlphaSymbolTable.addSymbol(currAlphabet, defaultAlphabet);
	}
	
	//user defined alphabet
	public AlphabetSymbolTable(ArrayList<Character> constructorAlpha) {
		
		AlphaSymbolTable.addSymbol(currAlphabet, constructorAlpha);
	}
	
	public ArrayList<Character> getCurrentAlphabet() {
		ArrayList<Character> currAlpha = AlphaSymbolTable.get(currAlphabet);
		return currAlpha;
	}
	
	public void setCurrentAlphabet(ArrayList<Character> newAlphabet) {   //change to boolean? how to check success/failure?
		AlphaSymbolTable.addSymbol(currAlphabet, newAlphabet);
	}
	
	/**
	 * Method to determine if a specific character 
	 * exists in the current alphabet 
	 * 
	 * @param c - the char to be checked
	 * @return true if char exists in alphabet, false otherwise
	 */
	public boolean isInAlphabet(char c) {
		
		 ArrayList<Character> checkArray = AlphaSymbolTable.get("currAlphabet");
		 int x = checkArray.indexOf(c);  
				 
		 if (x == -1) {
			 return false;
		 }
		 else return true;
	 }
}

 