package string;

public class VowelConsonantCounter {
	
	public static void main(String[] args) {
		
		String input = "Java is best";
		
		int vowel = 0;
		int consonant=0;
		
		
		for(char c : input.toLowerCase().toCharArray()) {
			if(c>='a' && c<='z') {
				if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u') {
					vowel++;
				}
				else {
					consonant++;
				}
			}
		}
		
		System.out.println("Here is total count of vowels : "+vowel);
		System.out.println("Here is total count of consonant : "+consonant);
	}

}
