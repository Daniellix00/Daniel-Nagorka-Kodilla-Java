package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
private final String nazwaKraju;
private final BigDecimal quantity;

    public Country(String nazwaKraju, BigDecimal quantity) {
        this.nazwaKraju = nazwaKraju;
        this.quantity = quantity;
    }



    public BigDecimal getPeopleQuantity(){
      return  quantity;
   }
}
