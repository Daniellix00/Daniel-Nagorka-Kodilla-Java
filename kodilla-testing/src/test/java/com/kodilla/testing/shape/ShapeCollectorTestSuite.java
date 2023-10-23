package com.kodilla.testing.shape;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {


@Test
void testAddFigure(){
    //given

    Shape square = new Square(3.0);
    ShapeCollector shapeCollector = new ShapeCollector();

    //when
    shapeCollector.addFigure(square);
 //then
  assertEquals(1,shapeCollector.getFigury().size());

}
@Test
void testRemoveFigure(){
    //given
    Shape square = new Square(3.0);
    ShapeCollector shapeCollector = new ShapeCollector();
shapeCollector.addFigure(square);
    assertEquals(1,shapeCollector.getFigury().size());

    //when
    shapeCollector.removeFigure(square);
    //then
   assertEquals(0,shapeCollector.getFigury().size());
}
@Test
    void testGetFigure(){
    //given
    Shape square = new Square( 3.0);
    ShapeCollector shapeCollector = new ShapeCollector();
    shapeCollector.addFigure(square);
    //when
    Shape zwrocona = shapeCollector.getFigure(0);
    //then
    assertEquals(square,zwrocona);
}

}
