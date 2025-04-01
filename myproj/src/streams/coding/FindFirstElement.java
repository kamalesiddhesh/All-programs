package streams.coding;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(15,8,49,25,98,98,32,15);
		myList.stream().findFirst().ifPresent(System.out :: println);
		int arr[] = {15,8,49,25,98,98,32,15};
		
		/* or can also try below single line code */
		Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::print);
		
	}

}
