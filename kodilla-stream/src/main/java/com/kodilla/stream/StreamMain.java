package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();
   PoemDecorator abc =   text -> "ABC" + text + "ABC";
   PoemDecorator xyz = text -> "<3" + text + "<3";
beautifier.beautify("Hello world", abc);
beautifier.beautify("Hello world", String::toUpperCase);
        beautifier.beautify("Hello world", xyz);
    }
}
