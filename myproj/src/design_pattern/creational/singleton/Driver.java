package design_pattern.creational.singleton;


public class Driver {
	
	public static void main(String[] args) {
		TVSet tvSetForMember1 = TVSet.getInstance();
		
		TVSet tvSetForMember2 = TVSet.getInstance();
		
		System.out.println(tvSetForMember1);
		System.out.println(tvSetForMember2);
		
	}

}
