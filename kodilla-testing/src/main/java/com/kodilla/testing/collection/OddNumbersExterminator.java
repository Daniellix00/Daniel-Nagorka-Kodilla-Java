package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
       List<Integer> liczby = new ArrayList<>();
        for (Integer zbior : numbers) {
            if (zbior % 2 == 0) {
                liczby.add(zbior);
            }
        }
return liczby;

    }}