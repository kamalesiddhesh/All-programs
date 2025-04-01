package streams.coding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ContainsDuplicate {
	
	public boolean containsDuplicate(List<Integer> list) {
		// if input is an array of integer
		//List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if(set.size() == list.size()) 
			return false;		
		return true;
	}
	public static void main(String[] args) {
		List<Integer> list= List.of(1,2,3);
		ContainsDuplicate d = new ContainsDuplicate();
		System.out.println(d.containsDuplicate(list));
		
	}

}
