package practice.programs;

public class FindGCD {

	public static void main(String[] args) {
		int a = 52;
		int b = 10;
		int gcd =0;
		int lcm = a*b;
		
		while(a>0 && b>0) {
			if(a>b)
				a = a%b;
			else
				b = b%a;
		}
		
		if(a==0) {
			System.out.println(b);
			gcd = b;
		}
		else {
			System.out.println(a);
			gcd = a;
		}
		
		lcm = lcm/gcd;
		System.out.println("LCM is : "+lcm);
		
	}

}
