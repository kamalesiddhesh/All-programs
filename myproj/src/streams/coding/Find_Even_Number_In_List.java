package streams.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Find_Even_Number_In_List {
	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(10,15,8,49,25,98,32);
		
		Predicate<Integer> p = (i) -> (i%2)==0;		
		list.stream().filter(p).forEach(System.out :: println);
	}

}
