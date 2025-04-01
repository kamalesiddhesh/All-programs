package comparison;

public class Student {
	int x = 34;
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Comparing objects");
		Student st = (Student)obj;
		
		return st.x == this.x;
		
	}

}
