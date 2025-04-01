package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class FindDuplicateWordInString {
	
	public static void main(String[] args) {
		String input = "This is a test. This test is easy";
		duplicateWords(input);
	}
	
	public static void duplicateWords(String s) {
		
		Map<String,Integer> characterCountMap = new HashMap<String, Integer>();
		
		String[] str = s.toLowerCase().split("\\W+");
//		Stream.of(str).forEach(System.out::println);
		
		for(String ch : str) {
			characterCountMap.put(ch, characterCountMap.getOrDefault(ch,0)+1);
		}
		
		boolean hasDuplicates = false;
		for(Map.Entry<String,Integer> entry : characterCountMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " ");
				hasDuplicates = true;
			}
		}
		
		if(hasDuplicates == false) {
			System.out.print("No duplicates found.");
		}
	}

}
