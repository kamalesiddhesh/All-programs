package exception;

class P1{
	public void m1() {
		System.out.println("P1");
	}
	public void m2() {
		System.out.println("P - m2");
	}
	
}

class C1 extends P1{
	public void m1() {
		System.out.println("C1");
	}
}

class C2 extends P1{
	public void m1() {
		System.out.println("C2");
	}
}
public class InheritanceDemo {
	
	public static void main(String[] args) {
		P1 p = new C1();
		p.m2();
	}	

}
