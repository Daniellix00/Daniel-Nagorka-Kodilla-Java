package com.kodilla.testing.shape;

public interface Shape {
  String getShapeName();
  double getField();
}
class Square implements Shape {
   private double side;
   public Square (double side)
   {
       this.side = side;
   }

    public double getSide() {
        return side;
    }

    @Override
    public double getField( ) {
return getSide()*getSide();
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}
class Circle implements  Shape{
  private double radius;
  public Circle ( double radius){
      this.radius = radius;
  }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getField() {
return 3.14*(getRadius()*getRadius());
    }
    @Override
    public String getShapeName() {
return "Circle";
    }
}
class Triangle implements Shape{
  private double base;
  private double height;
  public Triangle ( double base, double height){
      this.base = base;
      this.height = height;
  }

    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    @Override
        public double getField() {
    return ((getHeight()*getBase())/2);
    }
    @Override
    public String getShapeName() {
return "Triangle";
    }
}

