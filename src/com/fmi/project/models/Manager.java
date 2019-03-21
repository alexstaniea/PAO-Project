package com.fmi.project.models;

public class Manager extends Employee{

    private int nrofsubordinates;

    public Manager(Integer id, String name, Salary salary, Contract contract, int nrofsubordinates) {
        super(id, name, salary, contract);
        this.nrofsubordinates = nrofsubordinates;
    }

    public int getNrofsubordinates() {
        return nrofsubordinates;
    }

    public void setNrofsubordinates(int nrofsubordinates) {
        this.nrofsubordinates = nrofsubordinates;
    }
}
