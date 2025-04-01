package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargestNumber {
	
	public static int secondLargest(int[] input) {
		
		List<Integer> numList = Arrays.stream(input)
									  .boxed()
									  .collect(Collectors.toList());
		Comparator<Integer> c = (i1,i2) -> (i1<i2)? 1 : (i1>i2 ? -1 : 0);
		
		Optional<Integer> secondLargest = numList.stream()
								   .distinct()
//								   .sorted((i1,i2) -> (i1<i2)? 1 : (i1>i2 ? -1 : 0))
								   .sorted(Comparator.comparingInt(Integer :: intValue))
								   .skip(1)
								   .findFirst();
		
		if(secondLargest.isPresent()) {
			return secondLargest.get();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 18, 7, 8, 9, 10};
		
		System.out.println(secondLargest(nums));
		
		
	}

}
