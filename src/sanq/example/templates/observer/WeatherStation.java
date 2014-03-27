package sanq.example.templates.observer;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 11.03.14
 * Time: 16:28
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(0.5f, 10f, 20f);
        weatherData.setMeasurements(0.1f, 20f, 40f);
        weatherData.setMeasurements(0.2f, 30f, 80f);

    }
}
