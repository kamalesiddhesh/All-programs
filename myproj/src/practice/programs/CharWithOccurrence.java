package practice.programs;

import java.util.Arrays;

public class CharWithOccurrence {

	public static void main(String[] args) {
		
		// Problem - Replace Character with its Occurrence
		
		String input = "opentext";
		
		char charToReplace = 't';
		// Expected Output = open1ex2
		
		// TO check if given char present in string
		if(input.indexOf(charToReplace)==-1) {
			System.out.println("Given Character not Available in Input String..");
			System.exit(0);
		}
		
		//Logic to replace char occurrence in string
		// Approach 1
		char[] arr = input.toCharArray(); //opentext
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == charToReplace) {
				arr[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(new String(arr));
		
		// Approach - 2
		int count1 =1;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch == charToReplace) {
				input = input.replaceFirst(String.valueOf(charToReplace),String.valueOf(count1));
				count1++;
			}
		}
		
		
//		System.out.println(Arrays.toString(arr));
		System.out.println(input);
		
		

	}

}
