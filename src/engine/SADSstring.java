package engine;

import java.util.*;
import gui.Console;

public class SADSstring 
{
	public String Sub(String starting, LinkedHashMap<String, String> mappings)
	{		
		String finalResult = "";
		
		for(int i = 0; i < mappings.size(); i++)
		{
			if(!starting.contains(mappings.keySet().toArray()[i].toString()))
			{
				 Console.println(mappings.keySet().toArray()[i].toString() + " is not in the string.");
			}
		}

		for (int i = 0; i < starting.length(); i++)
		{
			if(mappings.containsKey(Character.toString(starting.charAt(i))))
			{
				finalResult += mappings.get(Character.toString(starting.charAt(i)));
			}
			else
			{
				finalResult += starting.charAt(i);
			}
		}		
		return finalResult;
	}
	
	public String Sub(String starting, LinkedHashMap<String, String> mappings, int iterations)
	{		
		String finalResult = starting;				
		int UPPER = 100;
		
		if(iterations > UPPER)
		{
			UPPER = iterations;
		}
	
		for(int i = 0; i < iterations; i++) 
		{
			String nextStep = Sub(finalResult, mappings);
			if(nextStep.length() > UPPER - 1)
			{
				break;
			}				
			else
			{
				finalResult = nextStep;
			}									
		}
		return finalResult;
	}
}  
