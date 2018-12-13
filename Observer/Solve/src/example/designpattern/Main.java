package example.designpattern;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(10, 5, 1);

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 10.5f);
        weatherData.setMeasurements(15, 25, 1.5f);
        weatherData.setMeasurements(5, 15, 13.4f);
    }
}
