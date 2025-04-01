package practice.programs;

public class CountDigit {

	public static void main(String[] args) {
		int num = 23141;
		
		int count = 0;
		
		while(num>0) {
			count = count + 1;
			num = num/10;
		}
		System.out.println(count);
		
		int count1 = (int)(Math.log10(num)+1);
		System.out.println(count1);
				
	}

}
