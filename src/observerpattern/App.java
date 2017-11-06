package observerpattern;

public class App {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		WeatherObserver observer = new WeatherObserver(station);
		
		station.setPressure(100);
		station.setTemperature(40);
		station.setHumidity(123);
	}

}
