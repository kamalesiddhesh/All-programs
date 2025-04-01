package arraylist;

class User{
	
	public static String name;
	public static int id;
	
//	public User(String name, int id) {
//		this.name = name;
//		this.id = id;
//	}
	{
		name = "mom";
	    id = 100;
	}
	
	void printUser() {
		System.out.println(this.name);
		System.out.println(this.id);
	}
	
}

class Vehicle {
    
    public String accelerate(long mph) {
        return "The vehicle accelerates at : " + mph + " MPH.";
    }
    
    public String stop() {
        return "The vehicle has stopped.";
    }
    
    public String run() {
        return "The vehicle is running.";
    }
}

class Car extends Vehicle {

    @Override
    public String accelerate(long mph) {
        return "The car accelerates at : " + mph + " MPH.";
    }
}

public class MyPrg {
	
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		
		Car obj1 = new Car();
		
		Vehicle obj2= new Car();
		
		
		String result = obj.accelerate(60);
//		String stop = obj.stop();
//		String run = obj.run();
		
		System.out.println(result);
//		System.out.println(run);
//		System.out.println(stop);
	}
	
	

}
