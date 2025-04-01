package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find2ndLargestNumberInList {
	
	public static void main(String[] args) {
		Integer nums[] = {10,55,55,30,40,50,60};
		Optional<Integer> res= secondLargestNum(nums);
		if (res.isPresent()) {
            System.out.println("The second largest number is: " + res.get());
        } else {
            System.out.println("The list does not have enough unique numbers.");
        }
	}
	
	public static Optional<Integer> secondLargestNum(Integer arr[]) {
		List<Integer> list = Arrays.asList(arr);
		
		Optional<Integer> secondLargest = list.stream()
			.distinct()
			.sorted(Collections.reverseOrder())			
			.skip(1)
			.findFirst();
		
		
		return secondLargest;
	}

}
