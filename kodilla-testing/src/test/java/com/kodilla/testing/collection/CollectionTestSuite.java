package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before()
    {
        System.out.println("Start test");
    }
    @AfterEach
    public void after()
    {
        System.out.println("End test");
    }
@DisplayName("test OddNumbersExterminator for empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
    //Given
    List<Integer> emptyList = new ArrayList<>();
    //When
    OddNumbersExterminator numbers = new OddNumbersExterminator();
    List<Integer> lista = numbers.exterminate(emptyList);
    //Then
    Assertions.assertEquals(0, lista.size());
}
    @DisplayName("test OddNumbersExterminator for normal list")
@Test
void testOddNumbersExterminatorNormalList(){
    //Given
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    //when
    OddNumbersExterminator number = new OddNumbersExterminator();
    List<Integer>sortedList = number.exterminate(list);
    //Then
   List<Integer>testList = new ArrayList<>();
   testList.add(2);
   testList.add(4);
   Assertions.assertEquals(testList, sortedList );


                }}




