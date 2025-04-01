package serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6737599132075693337L;
	private String name;
	transient private String email;
	private int age;
	private String address;
	private String depart;
	private String sub1;
	
	//Default Constructor
	public Student() {
		
	}	
	// Parameterized Constructor
	public Student(String name, String email, int age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}	
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// we can manually serialize for customization
	
	/*
	 * private void writeObject(ObjectOutputStream os) {
	 * System.out.println("In, writeObject() method."); try { os.writeInt(this.age);
	 * os.writeObject(this.name); os.writeObject(this.address);
	 * os.writeObject(this.depart);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */
	
	// we can manually de-serialize for customization
	
	/*
	 * private void readObject(ObjectInputStream ois) {
	 * System.out.println("In, readObject() method."); try { age=ois.readInt();
	 * name=(String)ois.readObject(); address=(String)ois.readObject();
	 * depart=(String)ois.readObject(); } catch (Exception e) { e.printStackTrace();
	 * } }
	 */
	
	public void displayName() {
		System.out.println("Hi My Name is : "+ this.name + " & age : " + this.age );
	}
}
