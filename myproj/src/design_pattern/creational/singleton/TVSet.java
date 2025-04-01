package design_pattern.creational.singleton;

public class TVSet {
	
	private static volatile TVSet tvSetInstance= null;
	
	private TVSet() {
		System.out.println("TV Set Instantiated");
	}
	
	public synchronized static  TVSet getInstance() { 
		if(tvSetInstance == null){ // optimization
			synchronized (TVSet.class) { // t2
					if(tvSetInstance == null) // double checking
						tvSetInstance = new TVSet();				
			}
		}
		return tvSetInstance;
	}

}
