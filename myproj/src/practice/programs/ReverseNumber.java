package practice.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 10400;
		int res = 0;
		while(num>0) {
			
			int last = num%10;
			res = res * 10+ last;
			num/=10;
		}
		System.out.println(res);

	}

}
