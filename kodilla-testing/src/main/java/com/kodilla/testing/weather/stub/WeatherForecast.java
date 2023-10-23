package com.kodilla.testing.weather.stub;
import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.ArrayList;
public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverage() {
        Map<String, Double> wartosci = temperatures.getTemperatures();
        double suma = 0;
        for (Map.Entry<String, Double> entry : wartosci.entrySet()) {
            double pobrane = entry.getValue();
            suma += pobrane;
        }
        return suma / 3;

    }

    public double calculateMedian() {
        Map<String, Double> wartosci = temperatures.getTemperatures();
        List<Double> wartosciTemp = new ArrayList<>(wartosci.values());
        Collections.sort(wartosciTemp);
        int n = wartosciTemp.size();
        int srodek = n / 2;
        if (n % 2 == 0) {
            double median1 = wartosciTemp.get(srodek - 1);
            double median2 = wartosciTemp.get(srodek);
            return (median1 + median2) / 2;
        }
        else {
            return srodek;
            }

        }
    }



