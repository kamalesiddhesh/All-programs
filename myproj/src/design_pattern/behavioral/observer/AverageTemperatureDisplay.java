package design_pattern.behavioral.observer;

public class AverageTemperatureDisplay implements Observer{
	private int sumOfTemperatures;
	private int totalTemperatures;
	
	public AverageTemperatureDisplay(Observable observable) {
		this.sumOfTemperatures = 0;
		this.totalTemperatures = 0;
		observable.registerObserver(this);
	}

	@Override
	public void update(int temperature, int humidity) {
		sumOfTemperatures = sumOfTemperatures + temperature;
		totalTemperatures++;
		display();
		
	}
	
	public void display() {
		System.out.println("The Average Temperature for the past " + totalTemperatures
							+" records = " + (sumOfTemperatures/(double)totalTemperatures));
	}
}
