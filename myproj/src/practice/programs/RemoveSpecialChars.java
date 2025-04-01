package practice.programs;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		// Problem : Remove Special Characters
		// Input : sid$$@^%dh*!*#e%@*s()*^%#$@h
		// Output : siddhesh
		
		String str = "sid$$@^%dh*!*#e%@*s()*^%#$[@h";
		
		//Approach - 1
		String res = str.replaceAll("[^a-zA-Z0-9]","");
		
//		String res = str.replaceAll("\\W","");
		System.out.println(res);
		
		//Approach - 2
		
		String resultStr="";  
		for (int i=0;i<str.length();i++){  
			//comparing alphabets with their corresponding ASCII value  
			if ((str.charAt(i)>64 && str.charAt(i)<=90) || (str.charAt(i)>96 && str.charAt(i)<=122)){  //returns true if both conditions returns true
				//adding characters into empty string   
				resultStr=resultStr+str.charAt(i);  
			}  
		}  
		System.out.println("String after removing special characters: "+resultStr);  
		  
		
		
		
		
		
	}

}
