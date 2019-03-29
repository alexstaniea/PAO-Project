package com.fmi.project.models;

public class Juniordev extends Employee{

    private Bestlanguage bestlanguage;
    protected String title;        //example: front-end dev

    public Juniordev(String username, String password,Integer id, String name, Salary salary, Contract contract, Bestlanguage bestlanguage, String title) {
        super(username, password, id, name, salary, contract);
        this.bestlanguage = bestlanguage;
        this.title = title;
    }

    public Bestlanguage getBestlanguage() {
        return bestlanguage;
    }

    public void setBestlanguage(Bestlanguage bestlanguage) {
        this.bestlanguage = bestlanguage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
