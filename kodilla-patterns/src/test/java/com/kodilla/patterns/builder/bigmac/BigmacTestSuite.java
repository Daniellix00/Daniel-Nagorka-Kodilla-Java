package com.kodilla.patterns.builder.bigmac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BigmacTestSuite {
@Test
void BigmacTestBuilder(){
    //Given
    Bigmac bigmac = new Bigmac.BigmacBuilder()
            .bun("sezam")
            .burgers(2)
            .sauce("Garlic")
            .ingredients("Becon")
            .ingredients("Onion")
            .build();
System.out.println(bigmac);
    //When
   //Then
    assertEquals("sezam", bigmac.getBun());
    assertEquals("Garlic", bigmac.getSauce());
    assertEquals(2, bigmac.getBurgers());
    assertEquals(2, bigmac.getIngredietns().size());


}}
