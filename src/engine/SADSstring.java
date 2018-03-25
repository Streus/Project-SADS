package engine;

import java.util.*;

public class SADSstring 
{
	public String Sub(String starting, LinkedHashMap<String, String> mappings)
	{		
		String finalResult = "";				
		
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
}  
