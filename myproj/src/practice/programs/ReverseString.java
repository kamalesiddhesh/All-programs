package practice.programs;

public class ReverseString {

	public static void main(String[] args) {
		
		// Problem :  Reverse String 
		// Input : "siddhesh"
		// Expected Output : "hsehddis"
		
		
		String str = "siddhesh";
		
		
				
		// Approach - 1 
		char chr[]  = str.toCharArray();
		for(int i=chr.length-1;i>=0;i--) {
			System.out.print(chr[i]);
			
		}
		System.out.println("");
		// Approach - 2
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		//Approach - 3
		System.out.println("");
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//Approach - 4
		
		
		StringBuilder sbl = new StringBuilder(str);
		System.out.println(sbl.reverse());
	}

}
