package engine;

import java.util.*;
import gui.Console;

public class SADSstring 
{
	public String Sub(String starting, LinkedHashMap<String, String> mappings)
	{		
		String finalResult = "";
		
		for (int i = 0; i < mappings.size(); i++)
		{
			if(!starting.contains(mappings.keySet().toArray()[i].toString()))
			{
				if(!finalResult.contains(mappings.keySet().toArray()[i].toString()))
				{
					Console.println("Warning: " + mappings.keySet().toArray()[i].toString() + " is not in the starting string.");
				}			
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
		int UPPER = 30;
		int counter = 0;
		
		if(iterations > 30)
		{
			UPPER = iterations;
		}
		
		for (int i = 0; i < iterations; i++)
		{
			String nextStep = Sub(finalResult, mappings);
			int nextLength = nextStep.length();
			
			if(nextStep.length() > UPPER)
			{
				Console.println("The next iteration has a length of " + nextLength + ", which exceeds the upper bound of " + UPPER);
				Console.println("Substituted " + counter + " time(s) of out of " + iterations + " times");
				break;
			}
			else
			{
				finalResult = nextStep;
				counter++;
			}
		}
		return finalResult;
	}
} 
