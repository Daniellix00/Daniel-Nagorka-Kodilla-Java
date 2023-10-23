package com.kodilla.testing.weather.mock;
import  com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.Test;                                            // [5]
import org.mockito.Mock;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)

public class WeatherForecastTestSuite {
@Mock
private Temperatures temperaturesMock;
    @Test

void testCalculateForecastWithMock() {                                     // [9]
    //Given
                   // [13]
    Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
    temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
    temperaturesMap.put("Krakow", 26.2);                                       // [16]
    temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
    temperaturesMap.put("Warszawa", 25.2);                                     // [18]
    temperaturesMap.put("Gdansk", 26.1);                                       // [19]
    when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
    WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

    //When
    int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

    //Then
    Assertions.assertEquals(5, quantityOfSensors);                          // [13]
}                                                                          // [14]
}


