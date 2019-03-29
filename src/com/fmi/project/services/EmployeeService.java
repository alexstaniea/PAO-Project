package com.fmi.project.services;

import com.fmi.project.models.*;

import java.util.*;

class Sortbyid implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return (int) (a.getId() - b.getId());
    }
}


public class EmployeeService {

    private static final Employee listOfEmployees[] = new Employee[4];

    private static final EmployeeService instance = new EmployeeService();

    private EmployeeService() {

        Date d1 = new Date (2009,3,29);
        Date d2 = new Date (2019,3,29);
        Salary s1= new Salary(1200.0,d1,d2,"RON");
        Contract c1 = new Contract(d1,d2,"janitor",false);
        Bestlanguage b = new Bestlanguage("c++",2);

        listOfEmployees[0] = new Employee("alex","123",1,"Alex Staniea",s1, c1);
        listOfEmployees[1] = new Juniordev("alex","123",2,"Alin Dima", s1, c1, b,"front-end developer");
        listOfEmployees[2] = new Seniordev("alex","123",3,"Vlad Ivascu", s1, c1, b,"back-end developer",150);
        listOfEmployees[3] = new Ceo("alex","123",4,"Vlad Secatureanu", s1, c1,23,234);
    }

    public static EmployeeService getInstance() {
        return instance;
    }

    public static void AscendingId(){

        List<Employee> l1 = new ArrayList<>();
        l1.add(0, listOfEmployees[0]);
        l1.add(1, listOfEmployees[1]);
        l1.add(2, listOfEmployees[2]);
        l1.add(3, listOfEmployees[3]);

        Collections.sort(l1, new Sortbyid());

        System.out.println("\n\nThe employees is ascending order of the id are: ");

        for(Employee aux : l1) {
            System.out.println(aux.getName() + "; id: " + aux.getId());
        }
    }

    public static Employee getEmployeeByName(String name) {

        for(Employee employee : listOfEmployees) {
            if(employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee getEmployeeById(Integer employeeId) {

        for(Employee employee : listOfEmployees) {
            if(employee.getId().equals(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    public static Salary getSalaryByName(String name) {

        for(Employee employee : listOfEmployees) {
            if(employee.getName().equals(name)) {
                return employee.getSalary();
            }
        }
        return null;
    }

    public static Salary getSalaryById(Integer employeeId) {

        for(Employee employee : listOfEmployees) {
            if(employee.getId().equals(employeeId)) {
                return employee.getSalary();
            }
        }
        return null;
    }

    public static boolean getRelocationStatus(String name) {

        for(Employee employee : listOfEmployees) {
            if(employee.getName().equals(name)) {
                return employee.getContract().getRelocation();
            }
        }
        System.out.println("No match!");
        return false;
    }

    public static boolean getRelocationStatus(Integer employeeId) {

        for(Employee employee : listOfEmployees) {
            if(employee.getId().equals(employeeId)) {
                return employee.getContract().getRelocation();
            }
        }
        System.out.println("No match!");
        return false;
    }


    public static String getPositionByName(String name) {

        for(Employee employee : listOfEmployees) {
            if(employee.getName().equals(name)) {
                return employee.getContract().getPosition();
            }
        }
        return null;
    }

    public static String getPositionById(Integer employeeId) {

        for(Employee employee : listOfEmployees) {
            if(employee.getId().equals(employeeId)) {
                return employee.getContract().getPosition();
            }
        }
        return null;
    }


    public static Date getStartdateByName(String name) {

        for(Employee employee : listOfEmployees) {
            if(employee.getName().equals(name)) {
                return employee.getContract().getStartFrom();
            }
        }
        return null;
    }

    public static Date getStartdateById(Integer employeeId) {

        for(Employee employee : listOfEmployees) {
            if(employee.getId().equals(employeeId)) {
                return employee.getContract().getStartFrom();
            }
        }
        return null;
    }

    public static Date getEnddateByName(String name) {

        for(Employee employee : listOfEmployees) {
            if(employee.getName().equals(name)) {
                return employee.getContract().getEndFrom();
            }
        }
        return null;
    }

    public static Date getEnddateById(Integer employeeId) {

        for(Employee employee : listOfEmployees) {
            if(employee.getId().equals(employeeId)) {
                return employee.getContract().getEndFrom();
            }
        }
        return null;
    }
}
