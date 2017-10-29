package engine.command;

import java.util.Map;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class CommandResponse {
	
	public String responseType;
	public String returnVal;
	
	//default constructor
	public CommandResponse() {
		responseType = "default";
		returnVal = "";
	}
	
	//predefined function constructors
	public CommandResponse(Map<String, Integer> input) {
		responseType = "WordCount";
		this.returnVal = input.toString();
	}
	
	public CommandResponse(int[] input) {
		responseType = "CuttingTimes";
		this.returnVal = input.toString();
	}
	
	public CommandResponse(int input) {
		responseType = "ShiftMaximality";
		this.returnVal = Integer.toString(input);
	
	}
		
	public CommandResponse(String input) {
		responseType = "StarProduct";
		this.returnVal = input;
	}	 
	
}
