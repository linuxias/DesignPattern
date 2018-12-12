package example.designpattern;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(10, 5, 1);
        weatherData.measurementsChanged();
    }
}
