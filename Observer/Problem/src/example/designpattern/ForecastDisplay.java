package example.designpattern;

/**
 * Created by linuxias on 18. 12. 13.
 */
public class ForecastDisplay {
    private float temp;
    private float humidity;
    private float pressure;

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
