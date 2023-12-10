package com.kodilla.patterns.factory.tasks;

public final  class TaskFactory {
    public static final String PAINTING = "PaintingTask";
    public static final String DRIVING = "DrivingTask";
    public static final String SHOPPING = "ShoppingTask";
public  final  Task createTask (final  String taskClass){
    return switch (taskClass){
        case PAINTING -> new PaintingTask("Painting", "Czarny", "Audi" );
        case  DRIVING -> new DrivingTask("Driving", "Germany-Poland", "Car");
        case  SHOPPING -> new ShoppingTask("Shopping", "T-shirt",2 );
        default -> null;
    };
}
}
