package com.fmi.project.services;

import com.fmi.project.models.*;

import java.util.Date;

public class ClientService {
    private static final Client listOfClients[] = new Client[4];

    private static final ClientService instance = new ClientService();

    private ClientService() {

        Project p1 = new Project(1200,120,"task1");


        listOfClients[0] = new Client("alex","123",p1,"Alex Staniea");
        listOfClients[1] = new Client("alex","123",p1,"Alin Dima");
        listOfClients[2] = new Client("alex","123",p1,"Vlad Ivascu");
        listOfClients[3] = new Client("alex","123",p1,"Vlad Secatureanu");
    }

    public static ClientService getInstance() {
        return instance;
    }

    public static Client getClientByName(String name) {

        for(Client client : listOfClients) {
            if(client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }
}
