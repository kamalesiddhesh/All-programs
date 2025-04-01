package streams.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> list = Arrays.asList(1,1,2,3,2,2,4,5,3);
		Set<Integer> set = new HashSet();
		
		
		Predicate<Integer> p = i -> !set.add(i);  
		System.out.println("Using set : ");
		myList.stream().filter(p).forEach(i -> System.out.print(i + " ") );
		System.out.println();
		
		System.out.println("Using distinct : ");
		list.stream().distinct().forEach(noDuplicates -> System.out.print(noDuplicates + " "));
		
		int[] arr = {1,1,2,3,2,2,4,5,3};
		
		List<Integer> list1 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		list1.forEach(n -> System.out.print(n + " "));
	}	

}
