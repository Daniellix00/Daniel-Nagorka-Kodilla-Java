package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHnadlingTest {
    @Test
    public  void testWithoutException() throws Exception {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1.0;
        double y = 10.0;

        // When
        String result = secondChallenge.probablyIWillThrowException(x, y);

        // Then
        assertEquals("Done!", result);


    }
    @Test
    public void  testWithException(){
//Given
    SecondChallenge secondChallenge = new SecondChallenge();
    double x = 2.0;
    double y = 1.0;
    // When and Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

}
