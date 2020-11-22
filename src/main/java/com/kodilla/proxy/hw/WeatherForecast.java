package com.kodilla.proxy.hw;

public class WeatherForecast implements WeatherForecastDataRetriever{

    public WeatherForecast() throws InterruptedException {
        refreshData();
    }

    @Override
    public String getWeather(String forecast) {
        return forecast;
    }

    private void refreshData() throws InterruptedException {
        Thread.sleep(5000);
    }
}
