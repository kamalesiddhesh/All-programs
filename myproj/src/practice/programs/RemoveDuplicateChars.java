package practice.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "Programming";
		
		// Approach - 1 
		StringBuilder sbr =  new StringBuilder();
		str.chars().distinct().forEach(c -> sbr.append((char)c));
		System.out.println(sbr);
		
		// Approach - 2
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int idx = str.indexOf(c,i+1);
			if(idx == -1) {
				sb2.append(c);
			}
			
		}
		System.out.println(sb2);
		
		//Approach - 3 
		char[] arr = str.toCharArray();
		
		StringBuilder sb3 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			boolean repeat = false;
			
			for(int j=i+1;j<str.length();j++) {
				
				if(arr[i] == arr[j]) {
					repeat = true;
					break;
				}			
			}
			if(repeat == false) {
				sb3.append(arr[i]);
			}
			
		}
		System.out.println(sb3);
		
		// Approach - 4
		
		StringBuilder sb4 =  new StringBuilder();
		
		Set<Character> set = new LinkedHashSet();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		for(Character c:set) {
			sb4.append(c);
		}
		System.out.println(sb4);
		
	}

}
