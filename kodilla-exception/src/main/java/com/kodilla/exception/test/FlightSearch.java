package com.kodilla.exception.test;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> lotyMapa;
    public FlightSearch (){
         lotyMapa = new HashMap<>();
        lotyMapa.put("Warsaw", true);
        lotyMapa.put("Barcelona", true);
        lotyMapa.put("Funchal", false);
    }
    public void findFlight ( Flight flight) throws  RouteNotFoundException {
        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();
if(!lotyMapa.containsKey(departureAirport)|| !lotyMapa.containsKey(arrivalAirport)){
    throw new RouteNotFoundException("Brak lotniska");
}
boolean dostep = lotyMapa.get(arrivalAirport);
if(!dostep){
    throw new RouteNotFoundException("Brak mozliwosci lotu do:" + arrivalAirport);
}
    }}
