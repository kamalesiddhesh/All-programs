package streams.coding;

import java.util.LinkedHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class FirstNonRepeated {
	public static void main(String[] args) {
		String input = "Siddhesh";
		
//		input.chars().forEach(System.out :: println);
		
		Consumer<Character> c = (ch)->{System.out.println(ch + "");};
		
		IntFunction<Character> convertToChar = s -> Character.toLowerCase(Character.valueOf((char)s));
		Function<Character,Character> lowerCase = l -> Character.toLowerCase(l);
		Character result =	input.chars()
								 .mapToObj(convertToChar) // First convert to Character object and then to lowercase         
//								 .map(lowerCase)
								 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new,Collectors.counting()))//Store the chars in map with count 
								 .entrySet()
								 .stream()
								 .filter(entry -> entry.getValue() == 1L)
						         .map(entry -> entry.getKey())
						         .findFirst()
						         .get();
		System.out.println(result);
		
		
		 Character ch1=(input.chars().mapToObj(ch -> (char) ch)
				 					 
							         .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
							         .findFirst())
							         .orElse(null);    
		 
		 System.out.println(ch1);
								 
								 
								 
	}

}
