package com.fmi.project.services;

import com.fmi.project.models.Contract;
import com.fmi.project.models.Project;
import com.fmi.project.models.Salary;
import com.fmi.project.models.User;

import java.sql.*;

public class DbService {

    private static int user_id = 1;
    private static int project_id = 1;
    private static int salary_id = 1;
    private static int contract_id = 1;



    public void update_user(int id, User input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "UPDATE users " +
                    "SET username = " + input.getUsername() + " ,password = " + input.getPassword() + " WHERE id in (" + id +")";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void delete_user(int id){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "DELETE FROM users " +
                    "WHERE id = " + id;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void create_user(User input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "INSERT INTO users " +
                    "VALUES (" + user_id + ',' + input.getUsername() + ',' + input.getPassword() +")";

            user_id++;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void read_users(){

        Connection connection = null;

            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from users");


            while (resultSet.next()) {
                System.out.println("id=" + resultSet.getInt(1)
                        + ", username=" + resultSet.getString(2)
                        + ", password=" + resultSet.getString(3));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }





    public void update_project(int id, Project input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "UPDATE projects " +
                    "SET budget = " + input.getBudget() + " ,timespan = " + input.getTimespan() + " ,tasks = " + input.getTasks() + " WHERE id in (" + id +")";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void delete_project(int id){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "DELETE FROM projects " +
                    "WHERE id = " + id;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void create_project(Project input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "INSERT INTO users " +
                    "VALUES (" + project_id + ',' + input.getBudget() + ',' + input.getTimespan() + "," + input.getTasks() +")";

            project_id++;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void read_projects(){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from projects");


            while (resultSet.next()) {
                System.out.println("id=" + resultSet.getInt(1)
                        + ", budget=" + resultSet.getInt(2)
                        + ", timespan=" + resultSet.getInt(3)
                        + ", tasks=" + resultSet.getString(4));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    //..................................



    public void update_salary(int id, Salary input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "UPDATE salaries " +
                    "SET amount = " + input.getAmount() + " ,startFrom = " + input.getStartFrom() + " ,endFrom = " + input.getEndFrom() + " ,currency = " + input.getCurrency() + " WHERE id in (" + id +")";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void delete_salary(int id){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "DELETE FROM salaries " +
                    "WHERE id = " + id;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void create_salary(Salary input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "INSERT INTO salaries " +
                    "VALUES (" + salary_id + ',' + input.getAmount() + ',' + input.getStartFrom() + "," + input.getEndFrom() + ',' + input.getCurrency() + ")";

            salary_id++;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void read_salaries(){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from salaries");


            while (resultSet.next()) {
                System.out.println("id=" + resultSet.getInt(1)
                        + ", amount=" + resultSet.getInt(2)
                        + ", startFrom=" + resultSet.getDate(3)
                        + ", endFrom=" + resultSet.getDate(4)
                        + ", currency=" + resultSet.getString(5));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    //..................................



    public void update_contract(int id, Contract input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "UPDATE contracts " +
                    "SET startFrom = " + input.getStartFrom() + " ,endFrom = " + input.getEndFrom() + " ,position = " + input.getPosition() + " ,relocation = " + input.getRelocation() + " WHERE id in (" + id +")";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void delete_contract(int id){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "DELETE FROM contracts " +
                    "WHERE id = " + id;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public void create_contract(Contract input){

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            String sql = "INSERT INTO contracts " +
                    "VALUES (" + contract_id + ',' + input.getStartFrom() + ',' + input.getEndFrom() + "," + input.getPosition() + ',' + input.getRelocation() + ")";

            contract_id++;

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public void read_contracts() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/corporation?serverTimezone=UTC",
                    "root", "alex1234");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from contracts");


            while (resultSet.next()) {
                System.out.println("id=" + resultSet.getInt(1)
                        + ", startFrom=" + resultSet.getDate(2)
                        + ", endFrom=" + resultSet.getDate(3)
                        + ", position=" + resultSet.getString(4)
                        + ", relocation=" + resultSet.getBoolean(5));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
