package numbers;

public class FindGCDofTwoNumbers {
	
	public static int findGcd(int num1, int num2) {
		
		if(num1 == 0)
			return num2;
		
		if(num2==0)
			return num1;
		
		if(num1==num2)
			return num1;
		
		if(num1>num2) 
			return findGcd(num1-num2,num2);
		return findGcd(num1,num2-num1);
		
	}
	
	public static void main(String[] args) {
		int a = 24;
		int b = 56;
		
		System.out.println("GCD :" + findGcd(24,56));
		System.out.println("LCM :" + findLcm(24,56));
	}
	
	public static int findLcm(int num1, int num2) {
		return (num1 * num2)/ findGcd(num1,num2);
	}

}
