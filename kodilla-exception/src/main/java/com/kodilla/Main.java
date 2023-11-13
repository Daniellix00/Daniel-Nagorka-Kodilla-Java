package com.kodilla;


import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearch;
import com.kodilla.exception.test.RouteNotFoundException;

public class Main {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        try {
            Flight flight1 = new Flight("Warsaw", "Barcelona");
            flightSearch.findFlight(flight1);


            Flight flight2 = new Flight("Warsaw", "Funchal");
            flightSearch.findFlight(flight2);
        }
        catch (RouteNotFoundException e){
          System.out.println(e.getMessage());
        }
        }
    }