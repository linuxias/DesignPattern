package example.designpattern;

/**
 * Created by linuxias on 18. 12. 13.
 */
public class WeatherData {
    private float temp;
    private float humidity;
    private float pressure;

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        currentConditionDisplay = new CurrentConditionDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public void measurementsChanged() {
        /*
         * If display is changed(add or remove), this code must be changed always.
         * By coding to concrete implementations we have no way to add or remove
         * other display elements without making changes to the program
         */

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getpressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    public float getTemperature() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getpressure() {
        return pressure;
    }
}
