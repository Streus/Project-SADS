package engine;

import java.lang.StringBuilder;

public class Concatenation
{
	public String concat(String baseStr, String concatStr)
	{
		return baseStr + concatStr;
	}
	
	public String Insert(String baseStr, String concatStr, int index)
	{		
		StringBuilder sb = new StringBuilder();
		sb.append(baseStr);
		sb.insert(index, concatStr);
		String strFinal = sb.toString();
		
		return strFinal;
	}
}
