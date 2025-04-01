package java8;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
	public static void main(String[] args) {
		String value = "Siddhesh Kamale";
		
		System.out.println("Reverse String : " + reverseString(value));
	}
	
	public static String reverseString(String input) {
		
//		String input = "Siddhesh kamale";
		if(input == null || input.isEmpty()) {
//			return input;
		}
		char[] charArray = input.toCharArray();
		
		// Supplier 
		Supplier<StringBuilder> stringBuilderSupplier = () -> new StringBuilder(); 
		
		// Accumulator
		BiConsumer<StringBuilder,Character> stringBuilderAccumulator = (sb,c) -> sb.append(c);
		
		//Combiner
		BiConsumer<StringBuilder,StringBuilder> stringBuilderCombiner = (sb1,sb2) -> sb1.append(sb2);
		
		String reverse =  IntStream.range(0,input.length())
				 .mapToObj(i -> charArray[input.length()-i-1])
				 .collect(
						 stringBuilderSupplier,
						 stringBuilderAccumulator,
						 stringBuilderCombiner						 
				  )
				 .toString();
		return reverse;	
		
	}

}
