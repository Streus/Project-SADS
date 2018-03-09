package engine;

import java.util.*;

public class Compare
{
	public String compareStrings(String string1, String string2)
	{
		List<String> diff = new ArrayList<String>();
		String listString = "";
		String str1temp = string1;
		String str2temp = string2;
		
		if(string1.length() > string2.length())
		{
			for(int i = 0; i < str1temp.length(); i++)
			{
				string2 += "-";
			}
			System.out.println(string2);
			for(int i = 0; i < string1.length(); i++)
			{
				if(string1.charAt(i) != string2.charAt(i))				
				{						
					diff.add(Integer.toString(i + 1));					
				}
			}
		}
		else if(string1.length() < string2.length())
		{
			for(int i = 0; i < str2temp.length(); i++)
			{
				string1 += "-";
			}
			for(int i = 0; i < string2.length(); i++)
			{
				if(string2.charAt(i) != string1.charAt(i))				
				{						
					diff.add(Integer.toString(i + 1));
				}
			}
		}
		else
		{
			for(int i = 0; i < string1.length(); i++)
			{
				if(string2.charAt(i) != string1.charAt(i))				
				{						
					diff.add(Integer.toString(i + 1));					
				}
			}
		}
				
		for(String s : diff)
		{
			listString += s + " ";
		}
		
		if(listString.length() == 0)
		{
			listString = "The strings are the same";
		}
		return listString;
	}
}
