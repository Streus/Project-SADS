package engine.PredefinedFunctions;

import java.util.ArrayList;
import java.util.List;

public class CuttingTimes {
	
	List<Integer> cuttingList = new ArrayList<Integer>();	
	static boolean disagreement = true;
	static int curDisagreement = 2;
	
	/**
	 * This method iterates through a string to find a list of all cutting times 
	 * (where digits in the same position are different) This method will only be
	 * invoked on strings that are shift maximal. Here the first number of a string
	 * is position 1 - not position 0.
	 * 
	 * @param s - the shift maximal string whose cutting times are to be calculated
	 * @return List<Integer> cuttingX - the list containing all cutting times
	 */
	static public int[] cuttingTimes(String s) {
		
		if (s != null && !s.isEmpty()) {
		
			List<Integer> cuttingList = new ArrayList<Integer>();	
			
			//1,2 are always considered cutting times
			//Note: 1,2 correspond to s.charAt(0) and s.charAt(1)
			cuttingList.add(1);
			cuttingList.add(2);
			
			
			while (disagreement) {
				disagreement = false;
				String cutString = s.substring(curDisagreement);
				int j = curDisagreement;
				
				for (int i=0; i<cutString.length(); i++) {
					if (s.charAt(i) != cutString.charAt(i)) {
						disagreement = true;
						cuttingList.add(curDisagreement+=(i+1));
						break;
					}
				}
			}
			
			int[] cuttingTimes = cuttingList.stream().mapToInt(i->i).toArray();
			
			return cuttingTimes;
			
		} else { //maybe throw custom exception here?
			int[] invalidInput = new int[1];
			invalidInput[0] = -1;
			return invalidInput;
		}

		
		
		
	}

}
