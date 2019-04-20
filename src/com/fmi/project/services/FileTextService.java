package com.fmi.project.services;

import com.fmi.project.models.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.*;
import java.util.Date;

public class FileTextService {
    private static FileTextService ourInstance = new FileTextService();


    public static FileTextService getInstance() {
        return ourInstance;
    }

    private FileTextService() {
    }

    public void writeTextToFile(String textToWrite, String fileNamePath) {

        try {
            PrintWriter printWriter = new PrintWriter(
                    new FileOutputStream(fileNamePath));

            printWriter.println(textToWrite);

            printWriter.flush();
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public User readUserFromFile(String fileNamePath) {
        User user = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            user = new User(values[0], values[1]);
            lineNumberReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }

    public Project readProjectFromFile(String fileNamePath) {
        Project project = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            project = new Project(new Integer(values[0]), new Integer(values[1]), values[2]);
            lineNumberReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return project;
    }

    public Contract readContractFromFile(String fileNamePath) {
        Contract contract = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            contract = new Contract(new Date(values[0]), new Date(values[1]), values[2], new Boolean (values[3]));
            lineNumberReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contract;
    }

    public Ceo readCeoFromFile(String fileNamePath) {
        Ceo ceo = null;
        try {

            LineNumberReader lineNumberReader = new LineNumberReader(
                    new FileReader(fileNamePath));

            String line = lineNumberReader.readLine();
            String[] values = line.split(",");

            ceo = new Ceo(values[0],values[1],new Integer(values[2]),values[3],new Salary(new Double(values[4]), new Date(values[5]), new Date(values[6]), values[7]),new Contract(new Date(values[8]),
                    new Date(values[9]), values[10], new Boolean (values[11])), new Integer(values[12]), new Integer(values[13]));
            lineNumberReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ceo;
    }


}
