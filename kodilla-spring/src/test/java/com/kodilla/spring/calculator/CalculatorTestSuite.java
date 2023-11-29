package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class CalculatorTestSuite {
    @Test
     void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
   Calculator calculator = context.getBean(Calculator.class);
   //When
  calculator.add(10.0,5.0);
calculator.sub(10.0,5.0);
calculator.mul(10.0, 5.0);
calculator.div(10.0,5.0);
   //Then
   //do nothing
    }

}
