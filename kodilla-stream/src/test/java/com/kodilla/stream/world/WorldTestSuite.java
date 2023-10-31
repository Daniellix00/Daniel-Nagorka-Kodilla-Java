package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
// Given
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Poland", new BigDecimal("38000000")));
        europeCountries.add(new Country("Germany", new BigDecimal("83000000")));

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("China", new BigDecimal("1400000000")));
        asiaCountries.add(new Country("India", new BigDecimal("1350000000")));

        Continent europe = new Continent("Europe", europeCountries);
        Continent asia = new Continent("Asia", asiaCountries);

        List<Continent>continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);
        World world = new World(continents);
//When
        BigDecimal population = world.getPeopleQuantity();
//Then
        assertEquals(new BigDecimal("2871000000"), population);

    }
}
