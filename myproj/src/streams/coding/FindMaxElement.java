package streams.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxElement {
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Comparator<Integer> c = (i1,i2) -> i1.compareTo(i2);
//		int max = myList.stream().max(c).get();
		int max = myList.stream().max(Integer :: compare).get();
//		System.out.println(max);
		
		
		
	}

}
