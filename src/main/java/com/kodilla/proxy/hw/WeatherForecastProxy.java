package com.kodilla.proxy.hw;

public class WeatherForecastProxy implements WeatherForecastDataRetriever{

    private WeatherForecast weatherForecast;

    @Override
    public String getWeather(String forecast) throws InterruptedException {
        if (weatherForecast == null)
            weatherForecast = new WeatherForecast();
        return forecast;
    }
}
