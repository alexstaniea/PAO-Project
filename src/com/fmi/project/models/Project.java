package com.fmi.project.models;

public class Project {

    private int budget;
    private int timespan; //in days
    private String tasks;

    public Project(int budget, int timespan, String tasks) {
        this.budget = budget;
        this.timespan = timespan;
        this.tasks = tasks;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getTimespan() {
        return timespan;
    }

    public void setTimespan(int timespan) {
        this.timespan = timespan;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }


}
