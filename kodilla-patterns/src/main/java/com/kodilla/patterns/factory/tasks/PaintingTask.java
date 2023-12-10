package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements  Task{
    private String taskName;
    private String color;
    private  String whatToPaint;
    private boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute painting task: " + taskName);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return  taskName;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}
