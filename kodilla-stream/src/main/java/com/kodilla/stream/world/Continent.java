package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
 private  String name;
 private List<Country> countries;

 public Continent(String name, List<Country>countries) {
  this.name = name;
 this.countries = countries;
 }
 public List<Country> getCountries() {
  return countries;
 }
}


