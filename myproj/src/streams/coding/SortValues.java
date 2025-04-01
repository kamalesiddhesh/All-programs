package streams.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		list.stream().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println("------------------------------");
		
		int nums[] = {3,2,5,1,10};
		List<Integer> l=  Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
		l.stream().forEach(i -> System.out.print(i + " "));
	}

}
