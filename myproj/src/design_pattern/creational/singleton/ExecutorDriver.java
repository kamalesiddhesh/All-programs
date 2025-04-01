package design_pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDriver {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		executor.execute(()-> System.out.println(TVSet.getInstance()));
		executor.execute(()-> System.out.println(TVSet.getInstance()));
		
//		executor.execute(()-> TVSet.getInstance());
//		executor.execute(()-> TVSet.getInstance());
//		executor.execute(()-> TVSet.getInstance());
	}

}
