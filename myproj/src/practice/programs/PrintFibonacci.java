package practice.programs;

public class PrintFibonacci {

	public static void main(String[] args) {
		
		int n =10, firstNum = 0, secondNum = 1;
		int nextNum;
		
		for(int i=1;i<=n;i++) {
			
			// firstNum = 3
			// secondNum = 5
			//nextNum = 2+3 = 5
			
			System.out.print(firstNum +", ");//0,1,1,2,3....
			nextNum = firstNum + secondNum; 
			firstNum = secondNum;
			secondNum = nextNum;
			
		}

	}

}
