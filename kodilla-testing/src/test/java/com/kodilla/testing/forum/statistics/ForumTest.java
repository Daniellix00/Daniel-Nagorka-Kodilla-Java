package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import com.kodilla.testing.forum.statistics.UserCalculate;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumTest {
    @Test
    public void testZeroPost(){
      //Given
        Statistics statistics = mock(Statistics.class);
        UserCalculate userCalculate = new UserCalculate();
        List<String>uzytkownik = new ArrayList<>();
        uzytkownik.add("User1");
        uzytkownik.add("User2");
        when(statistics.usersNames()).thenReturn(uzytkownik);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(10);
        //when
       userCalculate.calculateAdvStatistics(statistics);
       //then
        assertEquals(2, userCalculate.getLiczbaUzytkownikow());
        assertEquals(0,userCalculate.getLiczbaPostow());
        assertEquals(10,userCalculate.getLiczbaKom());
        assertEquals(0, userCalculate.getSrednialiczbaPostowUzytkownika());
        assertEquals(5, userCalculate.getSrednialiczbaKomUzytkownika());
        assertEquals(0, userCalculate.getLiczbaKomNaPost());

    }
  @Test
    public void test1000Post(){
     //Given
      Statistics statistics = mock(Statistics.class);
      UserCalculate userCalculate = new UserCalculate();
      List<String>uzytkownik = new ArrayList<>();
      uzytkownik.add("User1");
      uzytkownik.add("User2");
      when(statistics.usersNames()).thenReturn(uzytkownik);
      when(statistics.postsCount()).thenReturn(1000);
      when(statistics.commentsCount()).thenReturn(10);
      //When
      userCalculate.calculateAdvStatistics(statistics);
      //Then
      assertEquals(2, userCalculate.getLiczbaUzytkownikow());
      assertEquals(1000,userCalculate.getLiczbaPostow());
      assertEquals(10,userCalculate.getLiczbaKom());
      assertEquals(500, userCalculate.getSrednialiczbaPostowUzytkownika());
      assertEquals(5, userCalculate.getSrednialiczbaKomUzytkownika());
      assertEquals(0.01, userCalculate.getLiczbaKomNaPost());
    }
    @Test
            public void testPostMoreThanKom(){
        //Given
    Statistics statistics = mock(Statistics.class);
    UserCalculate userCalculate = new UserCalculate();
    List<String>uzytkownik = new ArrayList<>();
      uzytkownik.add("User1");
      uzytkownik.add("User2");
    when(statistics.usersNames()).thenReturn(uzytkownik);
    when(statistics.postsCount()).thenReturn(1000);
    when(statistics.commentsCount()).thenReturn(10);
        //When
        userCalculate.calculateAdvStatistics(statistics);
        //Then
        assertEquals(2, userCalculate.getLiczbaUzytkownikow());
        assertEquals(1000,userCalculate.getLiczbaPostow());
        assertEquals(10,userCalculate.getLiczbaKom());
        assertEquals(500, userCalculate.getSrednialiczbaPostowUzytkownika());
        assertEquals(5, userCalculate.getSrednialiczbaKomUzytkownika());
        assertEquals(0.01, userCalculate.getLiczbaKomNaPost());
    }
    @Test
    public void testKomMoreThanPost(){
        //Given
        Statistics statistics = mock(Statistics.class);
        UserCalculate userCalculate = new UserCalculate();
        List<String>uzytkownik = new ArrayList<>();
        uzytkownik.add("User1");
        uzytkownik.add("User2");
        when(statistics.usersNames()).thenReturn(uzytkownik);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(200);
        //When
        userCalculate.calculateAdvStatistics(statistics);
        //Then
        assertEquals(2, userCalculate.getLiczbaUzytkownikow());
        assertEquals(100,userCalculate.getLiczbaPostow());
        assertEquals(200,userCalculate.getLiczbaKom());
        assertEquals(50, userCalculate.getSrednialiczbaPostowUzytkownika());
        assertEquals(100, userCalculate.getSrednialiczbaKomUzytkownika());
        assertEquals(2, userCalculate.getLiczbaKomNaPost());
    }
    @Test
    public void testZeroUsers(){
        //Given
        Statistics statistics = mock(Statistics.class);
        UserCalculate userCalculate = new UserCalculate();
        when(statistics.usersNames()).thenReturn(List.of());
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(200);
        //When
        userCalculate.calculateAdvStatistics(statistics);
        //Then
        assertEquals(0, userCalculate.getLiczbaUzytkownikow());
        assertEquals(100,userCalculate.getLiczbaPostow());
        assertEquals(200,userCalculate.getLiczbaKom());
        assertEquals(0, userCalculate.getSrednialiczbaPostowUzytkownika());
        assertEquals(0, userCalculate.getSrednialiczbaKomUzytkownika());
        assertEquals(2, userCalculate.getLiczbaKomNaPost());
    }
    @Test
    public void test100Users(){
    //Given
    Statistics statistics = mock(Statistics.class);
    UserCalculate userCalculate = new UserCalculate();
    List<String>uzytkownik = new ArrayList<>();
       for ( int i = 1; i <= 100; i++ ){
           uzytkownik.add("Users"+i);
       }
       when(statistics.usersNames()).thenReturn(uzytkownik);
    when(statistics.postsCount()).thenReturn(100);
    when(statistics.commentsCount()).thenReturn(200);
    //When
        userCalculate.calculateAdvStatistics(statistics);
        //Then
        assertEquals(100, userCalculate.getLiczbaUzytkownikow());
        assertEquals(100,userCalculate.getLiczbaPostow());
        assertEquals(200,userCalculate.getLiczbaKom());
        assertEquals(1, userCalculate.getSrednialiczbaPostowUzytkownika());
        assertEquals(2, userCalculate.getSrednialiczbaKomUzytkownika());
        assertEquals(2, userCalculate.getLiczbaKomNaPost());
}}
