package com.fmi.project;


import com.fmi.project.models.Ceo;
import com.fmi.project.models.Contract;
import com.fmi.project.models.Project;
import com.fmi.project.models.User;
import com.fmi.project.services.FileTextService;

import static com.fmi.project.services.ClientService.getClientByName;
import static com.fmi.project.services.EmployeeService.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Relocation status of Alex Staniea:");
        boolean a = getRelocationStatus("Alex Staniea");
        System.out.println(a + "\n\n");

        AscendingId();

        //System.out.println("\n\n" + getClientByName("Vlad Ivascu"));


        //Citire din fisiere
        User u = FileTextService.getInstance().readUserFromFile(
                "C:\\Users\\Alex\\Desktop\\Proiect PAO\\files\\user.csv");

        Project p = FileTextService.getInstance().readProjectFromFile(
                "C:\\Users\\Alex\\Desktop\\Proiect PAO\\files\\project.csv");

        Contract c = FileTextService.getInstance().readContractFromFile(
                "C:\\Users\\Alex\\Desktop\\Proiect PAO\\files\\contract.csv");

        Ceo ceo = FileTextService.getInstance().readCeoFromFile(
                "C:\\Users\\Alex\\Desktop\\Proiect PAO\\files\\ceo.csv");

        System.out.println("Ceo-ul citit din fisierul ceo.csv are networth-ul: " + ceo.getNetworth() + ", numarul de sedii: "+ ceo.getNrofheadquarters() + ", si se numeste: " + ceo.getName() + ".\n");

        User user = new User("alexandru","alexandru98");


        //Scriere in fisier

        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(user.getUsername())
                .append(",").append(user.getPassword());


        FileTextService.getInstance().writeTextToFile(stringBuilder.toString(),
                "C:\\Users\\Alex\\Desktop\\Proiect PAO\\files\\user.csv");
    }
}
