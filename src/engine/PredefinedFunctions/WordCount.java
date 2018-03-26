package engine.PredefinedFunctions;

import java.util.*;

/*  Word Count Example (How many times a sub word appears with some length)
*
*   Word = 101101
*   sub word length = 3
*   Output = {011=1, 110=1, 101=2}
*/

public class WordCount
{
	public static <String, Integer extends Comparable<Integer>> Map<String, Integer> sort(final Map<String, Integer> map) 
	{
	    Comparator<String> comparator =  new Comparator<String>() 
	    {
	        public int compare(String value1, String value2) 
	        {
	            int compare = map.get(value2).compareTo(map.get(value1));
	           	if(compare == 0)
	       		{
	       			return 1;
        		}
	           	else
	           	{
	           		return compare;
	           	}
	       	}
	 	};
	    Map<String, Integer> sorted = new TreeMap<String, Integer>(comparator);
	   	sorted.putAll(map);
	   	return new LinkedHashMap<String, Integer>(sorted);
	}
	public Map<String, Integer> wordCount(String word, int subWordLength) 
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		String subWord = "";
		int newStartingIndex = 0;
		int newEndingIndex = subWordLength;
		
        	//Goes through the word and finds each subword starting at the beginning index 
        	//and ending at the subWordLength, then realigns the indices for the next subwords
		for (int i = 0; i < word.length(); i++)
		{
			subWord = word.substring(newStartingIndex, newEndingIndex);
			newStartingIndex++;
			newEndingIndex = newStartingIndex + subWordLength;
			
                        //if the map doesn't contain this subword then add it to the map,
                        //if it does, replace the previous one that was added and increment each time it gets added
			if (!map.containsKey(subWord))
			{
				map.put(subWord, 1);
			}
			else
			{
				map.replace(subWord, map.get(subWord) + 1);
			}
			
                        //if the ending index gets higher than the word length, all of the subwords have been found
			if (newEndingIndex > word.length())
			{
				break;
			}
		}
		return sort(map);
	}
}  
