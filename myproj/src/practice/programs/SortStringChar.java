package practice.programs;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		String str = "java";
		
		//Approach - 1 - Explain this approach
		
		char[] arr = str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(new String(arr));
		
		//Approach - 2
		String str2 = "rock";
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		System.out.println(new String(arr2));
		

	}

}
