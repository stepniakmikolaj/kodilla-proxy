package com.kodilla.proxy;

import com.kodilla.proxy.hw.WeatherForecastDataRetriever;
import com.kodilla.proxy.hw.WeatherForecast;

import java.util.Random;

public class WeatherApp {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherForecastDataRetriever weatherForecastDataRetriever = new WeatherForecast();
            int number = new Random().nextInt(100);
            if (number < 10)
                System.out.println(weatherForecastDataRetriever.getWeather("Nice Weather"));
            else if (number < 20)
                System.out.println(weatherForecastDataRetriever.getWeather("Good Weather"));

            System.out.println("Execution #" + (n+1) + " just finished");
        }
        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
