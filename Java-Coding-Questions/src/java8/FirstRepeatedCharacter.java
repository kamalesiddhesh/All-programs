package java8;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
	
	public static void main(String[] args) {
		String str = "hehlllo ";
		
		Optional<Character> first=  findFirstRepeatedCharacter(str);
		if (first.isPresent()) {
			System.out.println(first.get());
		}
		else {
			System.out.println("No repeated characters found");
		}
	}
	
	
	
	public static Optional<Character> findFirstRepeatedCharacter(String input){
		
		Set<Character> characterSet = new HashSet<>();
		
		System.out.println(input.chars()
								.mapToObj(c -> (char)c)
								.filter(c -> !characterSet.add(c))
								.collect(Collectors.toSet())
						  );
		
		return input.chars()
					.mapToObj(c -> (char)c)
					.filter(c -> characterSet.add(c))
					.findFirst();		
	}

}
