package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "racecar";
	    char result = findFirstNonRepeatedCharacter(input);

	    if (result != '\0') {
	        System.out.println("The first non-repeated character is: " + result);
	    } else {
	        System.out.println("No non-repeated character found.");
	    }
}
    
	static  char findFirstNonRepeatedCharacter(String s) {
		Map<Character,Integer> characterCountMap = new LinkedHashMap<Character,Integer>();
		
		//Populate the map with character counts
		for(char ch :s.toCharArray()) {
			characterCountMap.put(ch,characterCountMap.getOrDefault(ch,0)+1);
		}
		// Find the first non-repeated character
		for(Map.Entry<Character,Integer> entry : characterCountMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		// If no non-repeated character is found, return a null character
		return '\0';
	}

}
