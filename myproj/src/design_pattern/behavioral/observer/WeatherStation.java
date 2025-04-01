package design_pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
	
	private List<Observer> observers;
	private int temperature;
	private int humidity;
	
	public WeatherStation() {
		this.observers = new ArrayList<>();
	}
	
	private boolean hasObserver(Observer observer) {
		int index = observers.indexOf(observer);
		boolean hasObserver = (index >= 0);
		return hasObserver;		
	}

	@Override
	public void registerObserver(Observer observer) {
		if(!hasObserver(observer))
			observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		if(hasObserver(observer))
			observers.remove(observers.indexOf(observer));		
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(temperature,humidity));		
	}
	
	public void parametersChanged(int temperature, int humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		notifyObservers();
	}

}
