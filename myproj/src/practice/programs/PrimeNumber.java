package practice.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num= 14;
		int count=0;
		
		for(int i=1;i*i<=num;i++) {
			if(num%i==0) {
				count++;
				if((num/i) != i) {
					count++;
				}
			}
		}
		
		if(count == 2) {
			System.out.println(num +" is prime number!!");
		}
		else {
			System.out.println(num +" is not prime number!!");
		}
		

	}

}
