package ust_global;

import java.util.Scanner;

public class SumOfOddDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int sumOfOddDigits = calculateSumOfOddDigits(number);
		
		System.out.println("Sum of odd digits: " + sumOfOddDigits);

        sc.close();
		
	}
	
	
	public static int calculateSumOfOddDigits(int number) {
		
		int sum = 0;
		
		number = Math.abs(number); // Handle negative number
		
		if(number == 0) {
			return 0;
		}
		
		while(number>0) {
			int digit = number % 10;
			
			if(digit%2 != 0) {
				
			}
			number/=10;			
		}
		
		return sum;
	}

}
