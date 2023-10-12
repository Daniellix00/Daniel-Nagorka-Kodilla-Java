package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain{
    public static void main(String[] args) {
Calculator calculator = new Calculator();
Integer result = calculator.add(10,5);
if (result.equals(15))
{
    System.out.println("test ok");
}
else
{
    System.out.println("Error!");
}
Integer result2 = calculator.subtract(10,5);
if(result2.equals(5))
{
    System.out.println("test ok");
}
else
{
    System.out.println("Error!");
}
    }

}
