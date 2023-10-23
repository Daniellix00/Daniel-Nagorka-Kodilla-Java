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
}
@Test
void TestCalculateAverageWithMock() {
  //Given
    Map<String,Double>temperaturesMap = new HashMap<>();
    temperaturesMap.put("Rzeszów",25.0);
    temperaturesMap.put("Krakow", 26.0);                                       // [16]
    temperaturesMap.put("Wroclaw", 24.0);
   when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
  WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
   //when
    double srednia = weatherForecast.calculateAverage();
    //then
    Assertions.assertEquals(25,srednia);

    }
@Test
    void TestCalculateMedianWithMock(){
        //Given
    Map<String, Double>temperaturesMap = new HashMap<>();
    temperaturesMap.put("Rzeszow", 25.0);                                      // [15]
    temperaturesMap.put("Krakow", 26.0);                                       // [16]
    temperaturesMap.put("Wroclaw", 24.0);                                      // [17]
    temperaturesMap.put("Warszawa", 25.0);
    when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
//when
    double mediana = weatherForecast.calculateMedian();
    // then
    Assertions.assertEquals(25,mediana);
    }

}




