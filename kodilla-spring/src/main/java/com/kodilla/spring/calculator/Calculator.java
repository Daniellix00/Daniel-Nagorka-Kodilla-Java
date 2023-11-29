package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Calculator {

 private final    Display display;
    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public  void add(double a, double b){
     double val = a + b;
     display.displayValue(val);
    }
  public void sub(double a, double b){
       double val = a - b;
       display.displayValue(val);
    }
  public void mul(double a, double b){
      double val = a * b;
      display.displayValue(val);
   }
   public void div(double a, double b){
        double val = a / b;
       display.displayValue(val);
    }
}
