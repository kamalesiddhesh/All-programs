package comparison;

public class MainClass {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("John");
		
		Employee e2 = new Employee();
		
		e2.setId(1);
		e2.setName("John");
		
		System.out.println("Shallow Compare : " + (e1 == e2));
		System.out.println("Deep Compare : "+ e1.equals(e2));
	}

}
