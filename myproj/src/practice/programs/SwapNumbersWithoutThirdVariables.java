package practice.programs;

public class SwapNumbersWithoutThirdVariables {
	
	public static void main(String[] args) {
		
		int x = 2;
		int y = 34;
		
		System.out.println("Before swapping : x = " + x +" and y = "+y);
		
		x = x + y; // x = 10 + 20 = 30
		
		y = x - y; // y = 30 - 20 = 10
		
		x = x -y;  // x = 30 - 10 = 20
		
		
		System.out.println("After swapping : x = " + x +" and y = "+y);
		
	}

}
