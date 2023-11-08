package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> lotyMapa;
    public FlightSearch (){
        Map<String,Boolean> lotyMapa = new HashMap<>();
        lotyMapa.put("Warsaw", true);
        lotyMapa.put("Barcelona", true);
        lotyMapa.put("Funchal", false);
    }
    public Boolean findFlight ( Flight flight) throws  RouteNotFoundException{
    String depertureAirport = flight.getDepartureAirport();
    String arrivalAirport = flight.getArrivalAirport();


}
