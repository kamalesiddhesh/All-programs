package practice.programs;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrences {

	public static void main(String[] args) {
		// 
		String input = "hello";
		Map<Character,Integer> map =  new HashMap<>();
		
		char[] charArray = input.toCharArray();
		
		for(char ch : charArray) {
			
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}
			else {
				int cnt = map.get(ch);
				map.put(ch,cnt+1);
			}
		}
		
		System.out.println(map);

	}

}
