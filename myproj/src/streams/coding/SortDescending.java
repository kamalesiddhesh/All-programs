package streams.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Comparator<Integer> c = (i1,i2) -> -i1.compareTo(i2);
		list.stream().sorted(c).collect(Collectors.toList()).forEach(i-> System.out.print(i + " "));
	}

}
