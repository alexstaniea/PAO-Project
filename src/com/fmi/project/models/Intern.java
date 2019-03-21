package com.fmi.project.models;

public class Intern extends Employee {

    private String yearofstudy;
    private int age;
    private int graduationyear;

    public Intern(Integer id, String name, Salary salary, Contract contract, String yearofstudy, int age, int graduationyear) {
        super(id, name, salary, contract);
        this.yearofstudy = yearofstudy;
        this.age = age;
        this.graduationyear = graduationyear;
    }

    public String getYearofstudy() {
        return yearofstudy;
    }

    public void setYearofstudy(String yearofstudy) {
        this.yearofstudy = yearofstudy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGraduationyear() {
        return graduationyear;
    }

    public void setGraduationyear(int graduationyear) {
        this.graduationyear = graduationyear;
    }
}
