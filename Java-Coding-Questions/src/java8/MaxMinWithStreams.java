package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxMinWithStreams {
	
	public static void maxMinNum(int[] input) {
		List<Integer> numbers = Arrays.stream(input)
									  .boxed()
									  .collect(Collectors.toList());
		
		OptionalInt maxNum =  numbers.stream()
							   		 .mapToInt(i -> (int)i)
							   		 .max();
		
		OptionalInt minNum =  numbers.stream()
				   					 .mapToInt(i -> (int)i)
				   					 .min();
		
		maxNum.ifPresent(max -> System.out.println(maxNum));
		minNum.ifPresent(min -> System.out.println(minNum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		maxMinNum(nums);
	}

}
