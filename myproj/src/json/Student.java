package json;

public class Student {
	
	String name;
	String phone;
	String city;
	long studentId;
	
	public Student(String name,String phone,String city, long studentId) {
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", city=" + city + ", studentId=" + studentId + "]";
	}

}
