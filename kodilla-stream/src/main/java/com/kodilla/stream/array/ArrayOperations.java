package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {


       static double getAverage(int[]numbers){
           IntStream.range(1, numbers.length+1)
                   .forEach(i -> System.out.println(numbers[i-1]));
           double srednia = IntStream.range(1,numbers.length+1)
                   .average()
                   .orElse(0.0);


           return srednia;


       }
   }







