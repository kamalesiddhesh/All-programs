package java8;

import java.util.stream.IntStream;

public class PrimeNumberCheck {
	
	
	public static boolean isPrime(int number) {
		
		if(number <=1) {
			return false;
		}
		
		return IntStream.rangeClosed(2,(int)Math.sqrt(number))
						.noneMatch(div -> number % div == 0);
	}
	public static void main(String[] args) {
		 int number = 4;
		
		 boolean isPrime = isPrime(number);

	       
		 if (isPrime) {
			 System.out.println(number + " is a prime number.");
         }else {
        	 System.out.println(number + " is not a prime number.");
         }

	}

}
