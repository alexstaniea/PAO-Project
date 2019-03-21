package com.fmi.project.models;

import java.util.Date;

public class Contract {

    private Date startFrom;
    private Date endFrom;
    private String position;
    private boolean relocation;   //is eligible for relocation

    public Contract(Date startFrom, Date endFrom, String position, boolean relocation) {
        this.startFrom = startFrom;
        this.endFrom = endFrom;
        this.position = position;
        this.relocation = relocation;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean getRelocation() {
        return relocation;
    }

    public void setRelocation(boolean relocation) {
        this.relocation = relocation;
    }
}
