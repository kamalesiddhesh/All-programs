package collections;
import java.util.*;
public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t);//[1000, 2000, 3000, 4000, 5000] 
		System.out.println(t.ceiling(2000)); // 2000
		System.out.println(t.higher(2000)); // 3000
		System.out.println(t.floor(3000)); // 3000
		System.out.println(t.lower(3000)); // 2000
		System.out.println(t.pollFirst()); // 1000
		System.out.println(t.pollLast()); // 5000
		System.out.println(t); // [2000, 3000, 4000]

	}

}
