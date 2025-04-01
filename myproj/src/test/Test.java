package test;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {	
	public static void main(String[] args) {
		
		List<Integer> duplicates ;
				
		Map<Integer,Long> map= IntStream.of( 1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2 )
				   .boxed()
				   .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) );
//				   .entrySet()
//				   .stream()
//				   .filter( p -> p.getValue() > 1 )
//				   .map( Map.Entry::getKey )
//				   .toArray();
		
		
//		Arrays.asList(arr).forEach(System.out :: println);	   
		
		Set<Entry<Integer, Long>> set = map.entrySet();		
		Iterator itr = set.iterator();
		int x = 2;
		while(itr.hasNext()) {
			
			Map.Entry m =(Entry) itr.next();
			if(x == (int)m.getKey()) {
				System.out.println("occurrence value : " + m.getValue());
			}
//			System.out.println("key : "+m.getKey()+"......."+"value : "+m.getValue());
			
		}
		
		
	}
	

}
