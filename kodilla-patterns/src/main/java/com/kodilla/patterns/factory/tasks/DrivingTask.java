package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements  Task{
    private String taskName;
    private String where;
    private String using;
    private boolean taskExecuted;


    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute driving task: " + taskName);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return  taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return  taskExecuted;
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}
