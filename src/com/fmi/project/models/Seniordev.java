package com.fmi.project.models;

public class Seniordev extends Juniordev {

    private int nrofknownlanguages;

    public Seniordev(String username, String password, Integer id, String name, Salary salary, Contract contract, Bestlanguage bestlanguage, String title, int nrofknownlanguages) {
        super(username, password, id, name, salary, contract, bestlanguage, title);
        this.nrofknownlanguages = nrofknownlanguages;
    }

    public void setNrofknownlanguages(int nrofknownlanguages) {
        this.nrofknownlanguages = nrofknownlanguages;
    }
}
