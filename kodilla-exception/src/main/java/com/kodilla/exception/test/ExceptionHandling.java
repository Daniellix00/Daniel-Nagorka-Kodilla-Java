package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String wynik = secondChallenge.probablyIWillThrowException(2.0, 1.0);
            System.out.println("Result: " + wynik);
        }
        catch (Exception e) {
            System.out.println("Exception:" + e);
        }
        finally {
            System.out.println("End");
        }
        try {
            String wynik = secondChallenge.probablyIWillThrowException(1.5, 10.0);
            System.out.println("Result: " + wynik);
        }
        catch (Exception e) {
            System.out.println("Exception" + e);
        }
        finally {
            System.out.println("End");
        }
    }
}
