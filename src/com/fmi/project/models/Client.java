package com.fmi.project.models;

public class Client extends User{

    private Project project;
    private String name;

    public Client(String username, String password, Project project, String name) {
        super(username, password);
        this.project = project;
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
