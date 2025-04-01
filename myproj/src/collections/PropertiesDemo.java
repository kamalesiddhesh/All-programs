package collections;

import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties p = new Properties();
//		File file = new File("C:/Users/siddhesh.kamale/eclipse-ide/myproj/src/collections/abc.properties");
		File file = new File("abc.properties");
//		String path = "C:/Users/siddhesh.kamale/eclipse-ide/myproj/src/collections/abc.properties";
		
		FileInputStream fis = new FileInputStream(file);
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "8810");
		p.setProperty("sid","7777");
		System.out.println(p);
		FileOutputStream fos = new FileOutputStream(file); 
//		p.store(fos, "Updated By Durga for me"); 
		p.store(fos,"my changes");
		
		fos.close();
		fis.close();
	}

}
