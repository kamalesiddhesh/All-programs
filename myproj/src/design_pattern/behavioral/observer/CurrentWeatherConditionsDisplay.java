package design_pattern.behavioral.observer;

public class CurrentWeatherConditionsDisplay implements Observer{
	private int temperature;
	private int humidity;
	
	public CurrentWeatherConditionsDisplay(Observable observable) {
		observable.registerObserver(this);
		
	}	
	
	public void display() {
		System.out.println("Current Weather Condition : Temperature : "+ temperature
							+", Humidity : " + humidity);
	}

	@Override
	public void update(int temperature, int humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();		
	}

}
