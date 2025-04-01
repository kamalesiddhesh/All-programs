package numbers;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int numofTerms = 5;
		fibonacciSeries(5);
	}
	
	/*
	 * 
	 * 0,1,1,2,3
	 */
	
	public static void fibonacciSeries(int n) {
		int firstTerm = 0;
		
		int secondTerm = 1;
		
		for(int i=0;i<n;i++) {// i=0,1,2,3,4,5
			System.out.println(firstTerm); // 0-1-1-2-3
			int nextTerm = firstTerm+secondTerm; // 3+5=8
			firstTerm = secondTerm;// firstTerm = 5
			secondTerm = nextTerm; // secondTerm = 8
			
			
		}
	}

}
