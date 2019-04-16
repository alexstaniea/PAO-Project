package com.fmi.project.models;

public class Employee  extends User{

    private Integer id;
    private String name;
    private Salary salary;
    private Contract contract;


    public Employee(String username, String password, Integer id, String name, Salary salary, Contract contract) {
        super(username, password);
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.contract = contract;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }


}
