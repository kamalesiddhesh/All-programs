package jaava;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal<String> tl = new ThreadLocal<String>();
		
		System.out.println(tl.get()); // null
		tl.set("Durga");
		System.out.println(tl.get()); // Durga
		tl.remove();
		System.out.println(tl.get()); // null

	}

}
