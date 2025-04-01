package string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesCharactersInString {
	
	public static void findDuplicatesCharacters(String s) {
		
		Map<Character, Integer> charcaterCountMap = new HashMap<>();
		
		for(char ch : s.toCharArray()) {
			charcaterCountMap.put(ch,charcaterCountMap.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry : charcaterCountMap.entrySet()) {
			if((entry.getValue()>1 )&& isAlphbetOrNot(entry.getKey())) {
				System.out.println(entry.getKey()+
							" and it's no. of occurrence : "+ entry.getValue());
			}
		}		
	}
	
	public static boolean isAlphbetOrNot(char ch) {
		if((ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z'))
			return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		String input = "  ";
		findDuplicatesCharacters(input);
	}

}
