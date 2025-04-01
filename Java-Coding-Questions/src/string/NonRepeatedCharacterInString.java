package string;

import java.util.Arrays;

public class NonRepeatedCharacterInString {
	
	// As the input string can only have lowercase  
    // characters, the maximum characters will be 26
	static final int MAX_CHAR = 26;
	
	public static void main(String[] args) {
	    String s = "aba";
        System.out.println(nonRepeatingChar(s.toLowerCase()));
	}
	
	
	static char nonRepeatingChar(String s) {
	    
	    int visArray[] = new int[MAX_CHAR];
	    Arrays.fill(visArray,-1);
	    
	 // Iterate through the string
	    for(int i=0;i<s.length();i++){
	        
	    	 // If the character is seen for the first time,
            // store its index
	        if(visArray[s.charAt(i)-'a']== -1){
	            visArray[s.charAt(i)-'a'] = i;
	        }
	        
	     // If the character is seen again, mark it as -2
	        else{
	            visArray[s.charAt(i)-'a'] = -2;
	        }
	    }
	    int index = Integer.MAX_VALUE;
	    
	    
	    // Find the smallest index among all non-repeating 
        // characters
	    for(int i=0;i<MAX_CHAR;i++){
	        if(visArray[i] >= 0)
	            index = Math.min(index,visArray[i]);
	    }
	    
	    return (index==Integer.MAX_VALUE? '$':s.charAt(index));
  
    }

}
