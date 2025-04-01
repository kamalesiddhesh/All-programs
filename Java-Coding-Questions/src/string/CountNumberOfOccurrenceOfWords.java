package string;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurrenceOfWords {
	
	public static void main(String[] args) {
		String input = "Java is great. and Java is powerful";
		countOccurrence(input);
		
	}
	
	public static void countOccurrence(String s) {
		
		Map<String, Integer> wordCountMap = new HashMap();
		
		String words[] = s.toLowerCase().split("\\W+");
		
		for(String str:words) {
			wordCountMap.put(str, wordCountMap.getOrDefault(str,0)+1);
		}
		
		for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()) {
			System.out.println("word - "+ entry.getKey() + " and its occurrence : "+entry.getValue());
		}
 	}

}
