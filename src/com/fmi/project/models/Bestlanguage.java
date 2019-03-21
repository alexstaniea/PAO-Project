package com.fmi.project.models;

public class Bestlanguage {

    private String name;
    private int yearsofexperience;

    public Bestlanguage(String name, int yearsofexperience) {
        this.name = name;
        this.yearsofexperience = yearsofexperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsofexperience() {
        return yearsofexperience;
    }

    public void setYearsofexperience(int yearsofexperience) {
        this.yearsofexperience = yearsofexperience;
    }
}
