package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private  String whatToBuy;
   private double quantity;
private boolean taskExecuted;
    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
       this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute shopping task: " + taskName);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}
