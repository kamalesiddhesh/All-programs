package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		charFrequency();
	}
	
	public static void charFrequency() {
		String input = "hello world";
		
		Map<Character, Long> characterFrequency = input.chars()
									.filter(c ->c !=' ')
									.mapToObj(c -> (char)c)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		characterFrequency.forEach(
				(ch, freq) -> System.out.println("'" + ch + "' -> " + freq));
	}
}
