package engine.command;

import java.util.Map;

/**
 * 
 * @author Logan LaFollette
 *
 */
public class CommandResponse {
	
	public String responseType;
	
	//default constructor
	public CommandResponse() {
		responseType = "default";
	}
	
	//predefined function constructors
	public CommandResponse(Map<String, Integer> input) {
		responseType = "WordCount";
	}
	
	public CommandResponse(int[] input) {
		responseType = "CuttingTimes";
	}
	
	public CommandResponse(int input) {
		responseType = "ShiftMaximality";
	}
	
	public CommandResponse(String input) {
		responseType = "StarProduct";
	}	 
	
}
