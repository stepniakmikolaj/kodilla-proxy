package com.kodilla.proxy.hw;

public interface WeatherForecastDataRetriever {
    String getWeather(String forecast) throws InterruptedException;
}
