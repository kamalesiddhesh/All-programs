package comparison;

public class Comparison {
	public static void main(String[] args) {
		Student s1 =  new Student();
		Student s2 =  new Student();
//		s2.x = 12;
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
