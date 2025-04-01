package string;

public class SubstringCountUsingSplit {
	
	public static void main(String[] args) {
		String input = "Java is great. Java is fun. Java is powerful.";
		String subString = "Java";
		countSubString(input,subString);
	}
	
	public static void countSubString(String input,String subString) {
		String words[] = input.split(subString,-1);
		
		int count = words.length-1;
		System.out.println("Number of occurrences using split(): " + count);
	}

}
