package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	private int pressure;
	private int temperature;
	private int humidity;
	private List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList<>();
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObserver();
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObserver();
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObserver();
	}
	public void setObserverList(List<Observer> observerList) {
		this.observerList = observerList;
		notifyAllObserver();
	}
	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o);
		
	}

	@Override
	public void notifyAllObserver() {
		for(Observer o:observerList){
			o.update(pressure, temperature, humidity);
		}
		
	}

}
