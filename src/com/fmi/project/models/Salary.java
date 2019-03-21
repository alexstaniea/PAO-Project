package com.fmi.project.models;

import java.util.Date;

public class Salary {

    private Double amount;
    private Date startFrom;
    private Date endFrom;
    private String currency;

    public Salary(Double price, Date startFrom, Date endFrom, String currency) {
        this.amount = price;
        this.startFrom = startFrom;
        this.endFrom = endFrom;
        this.currency = currency;
    }
    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(Date startFrom) {
        this.startFrom = startFrom;
    }

    public Date getEndFrom() {
        return endFrom;
    }

    public void setEndFrom(Date endFrom) {
        this.endFrom = endFrom;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
