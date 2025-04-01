package immutable;

import java.util.ArrayList;
import java.util.List;

//Point no. 1
final public class Student {
	

	// Point No. 2,4
	final private String name;
	
	final private int studentId;
	
	final private long percentage;
	
	final private List<String> friends;


	
	public Student(String name, int studentId, long percentage, List<String> friends) {
		this.name = name;
		this.studentId = studentId;
		this.percentage = percentage;
		
		// Point no. 5
		// deep copy of list : value copy
		List<String> tempList = new ArrayList<>();
		
		for(String value: friends) {
			tempList.add(value);
		}
		
		this.friends = tempList;
	}

	

	public void display() {
		System.out.println(this.name);
		System.out.println(this.studentId);
		System.out.println(this.percentage);
		System.out.println(this.friends);
		System.out.println("---------------------------------------");
	}


//	Getters
	public String getName() {
		return name;
	}


	public int getStudentId() {
		return studentId;
	}


	public long getPercentage() {
		return percentage;
	}
	
	public List<String> getFriends() {
		
		// Point no.6
		List<String> tempList =  new ArrayList<>();
		
		for(String value : friends) {
			tempList.add(value);
		}
		return tempList;
		
//		return friends;
	}

}
