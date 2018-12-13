package example.designpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by linuxias on 18. 12. 13.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    private Observable weatherData;

    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay :" + " Temperature : " + temp + " Humidity : " + humidity + " Pressure : " + pressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getpressure();
            display();
        }
    }
}
