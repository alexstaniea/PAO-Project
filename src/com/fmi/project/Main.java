package com.fmi.project;


import static com.fmi.project.services.EmployeeService.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Relocation status of Alex Staniea:");
        boolean a = getRelocationStatus("Alex Staniea");
        System.out.println(a);

        AscendingId();
    }
}
