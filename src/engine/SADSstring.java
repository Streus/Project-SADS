package engine;

/* Generates a string of 1s and 0s based on two rules, a starting string, and some length
*  Example: rule 1 = 1 -> 10 and 0 -> 01, start 1, 3 times
*  Result: 1101001
*/

public class SADSstring implements Comparable<SADSstring>
{
	private String SADSstring;

	public SADSstring(String stringConstructor) //maybe Generate1 should be a constructor?? 
	{
		this.SADSstring = stringConstructor;
	}
	
	public static String Generate1(String rule1, String rule2, String startingString, int length)
	{
		String strFinal = startingString;
	
		for (int i = 0; i < length; i++) 
		{	
			if(strFinal.charAt(i) == '1')
			{				
				strFinal += rule1;
			}
			else 
			{
				strFinal += rule2;
			}
		}
		return strFinal;
	}
	
	@Override 
	public int compareTo(SADSstring _s1) {
		return this.SADSstring.compareTo(_s1.SADSstring);
	}
}  
