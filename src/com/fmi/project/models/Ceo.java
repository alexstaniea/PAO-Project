package com.fmi.project.models;

public class Ceo extends Employee {

    private int nrofheadquarters;
    private int networth;

    public Ceo(Integer id, String name, Salary salary, Contract contract, int nrofheadquarters, int networth) {
        super(id, name, salary, contract);
        this.nrofheadquarters = nrofheadquarters;
        this.networth = networth;
    }

    public int getNrofheadquarters() {
        return nrofheadquarters;
    }

    public void setNrofheadquarters(int nrofheadquarters) {
        this.nrofheadquarters = nrofheadquarters;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }
}
