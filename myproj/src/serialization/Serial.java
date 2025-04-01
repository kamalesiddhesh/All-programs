package serialization;


import java.io.*;

public class Serial {
	public static void main(String[] args) {
		try {
			Student student =  new Student("Siddhesh","sid@gmail.com",24,"Mumbai");
//			Student student =  new Student("Siddhesh",24);
			
			
			// write data to file
			FileOutputStream fos = new FileOutputStream("ob.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//how to serialize			
			oos.writeObject(student);
			
			oos.close();
			fos.close();
			System.out.println("Object stated is transfered to file ob !!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
