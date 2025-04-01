package practice.programs;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String input = "java code";
		System.out.println("Original String :: "+ input);
		
		String[] words = input.split(" ");
		
		String output="";
		
		for(String word : words) {
			
			//reverse
			String reverseWord = "";
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			
			output = output + reverseWord+" ";
		}
		System.out.println(output);
 
	}

}
