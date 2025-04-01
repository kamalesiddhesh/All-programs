package streams.coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Find_Number_Starts_With_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,100);
		
		Function<Integer,String> f = i -> i + " ";
		Predicate<String> p = s -> s.startsWith("1");
		Predicate<String> l = s -> s.endsWith("5 ");
		list.stream().map(f).filter(l).forEach(System.out :: println);
	}

}
