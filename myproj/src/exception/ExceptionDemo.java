package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	public void m1() throws FileNotFoundException{
		System.out.println("FileNotFOundException");
	}
	
}

class Child extends Parent{
	
	public void m1() throws IOException{
		System.out.println("IOException");
	}
}

public class ExceptionDemo {
	
	Parent p = new Child();
	

}
