package practice.programs;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// Problem : Remove White Spaces..
		// Input : "  s  id dh     e  sh "
		//Expected Output : "siddhesh"
		
		//Approach - 1 
		
		String inputString = "  s  id dh     e  sh ";
		
		String res = inputString.replaceAll("\\s","");
		System.out.println(res);
		
		//Approach - 2
		String op = "";
		
		for(int i=0;i<inputString.length();i++) {
			char c = inputString.charAt(i);
			if(!Character.isWhitespace(c)) {
				op = op + c;
			}
		}
		System.out.println(op);
		
		
		//Approach - 3
		
		String op1 = inputString.replace(" ","");
		System.out.print(op);
	}

}
