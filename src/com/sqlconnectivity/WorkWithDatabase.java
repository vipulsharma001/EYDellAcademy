package com.sqlconnectivity;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Savepoint;
import java.sql.Statement;

 

public class WorkWithDatabase {
    static {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Powerabc123@";
            conn = DriverManager.getConnection(dbURL);
            if(conn != null) {
                System.out.println("Connection establised using connection");
            }
            conn.setAutoCommit(false);
            stmt = conn.createStatement();          
            String droptable = "Drop table employee30";
            int i = stmt.executeUpdate(droptable);
            if(i==0)    System.out.println("Drop Completed Successfully");
            else    System.out.println("Table does not exist");
            String createTableSQL = "CREATE TABLE employee30(" +"ID INTEGER NOT NULL, FIRST_NAME VARCHAR(200)," +"LAST_NAME VARCHAR(200)," +"DESIGNATION VARCHAR(200));";
              i=stmt.executeUpdate(createTableSQL);
            if(i==0)    System.out.println("Drop Completed Successfully");
            else    System.out.println("Table does not exist");
           String insertSQL = "INSERT INTO employee30 VALUES(" +"111,'A','B','Manager');";
            i=stmt.executeUpdate(insertSQL);
            if(i!=0)    System.out.println("Insert Query Executed Successfully");
            else    System.out.println("Insert query could not work");         
            Savepoint sv1 = conn.setSavepoint("savePointTillInsert");
            conn.commit();
            String selectSQL = "SELECT * from employee30";
            rs = stmt.executeQuery(selectSQL);
            while(rs.next()) {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("First Name : " + rs.getString(2));
                System.out.println("Last Name : " + rs.getString(3));
                System.out.println("Designation : " + rs.getString(4));               
           }            
            String updateSQL = "UPDATE employee30 set First_NAME='X',"+
            "LAST_NAME = 'Y' where Designation='Manager';";
            i=stmt.executeUpdate(updateSQL);
            if(i!=0)    System.out.println("Update Completed Successfully");
            else    System.out.println("Update could not work");     
            
            String deletetable = "DELETE FROM employee30 WHERE id=111;";
            i=stmt.executeUpdate(deletetable);
            if(i!=0)    System.out.println("Delete Completed Successfully");
            else    System.out.println("Delete could not work");   
            conn.commit();
//            conn.rollback();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}