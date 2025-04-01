package immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {
	public static void main(String[] args) {
		System.out.println("Immutable example triggered");
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Raman");
		Student student = new Student("Durgesh", 23, 98L, list);
		
		System.out.println(student);
		student.display();
		
		List<String> friends = student.getFriends();
//		friends.forEach(System.out :: println);
		
		friends.clear();
		
		System.out.println("Local Friends size : "+friends.size());
		student.display();
//		
//		student.name = "Sid";
//		
		System.out.println(student);
//		student.display();
		
	}

}
