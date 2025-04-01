package exception;

class P{
	public void property() {
		System.out.println("GOLD | CASH | LAND");
	}
	public void marry() {
		System.out.println("Parent method : Sunita");
	}
}

class C extends P{
	public void marry() {
		System.out.println("Child method : Katrina");
	}
	
	public void buy() {
		System.out.println("Car");
	}
}
public class MethodOverrinding {
	public static void main(String[] args) {
//		P p = new P();
//		p.marry();
		
		C c = new C();
//		c.marry();
		
		
//		P p = new C();
//		p.marry();
//		p.property();
//		p.buy();
		
		
	}

}
