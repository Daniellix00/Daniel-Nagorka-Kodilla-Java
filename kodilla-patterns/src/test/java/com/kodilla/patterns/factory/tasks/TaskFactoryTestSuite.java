package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TaskFactoryTestSuite {
    @Test
    void testFactoryTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        Task driving = factory.createTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals("Driving", driving.getTaskName());
    }
}
