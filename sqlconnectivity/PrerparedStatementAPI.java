package com.sqlconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrerparedStatementAPI {
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
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
        	String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Powerabc123@";
            conn = DriverManager.getConnection(dbURL);
            if(conn != null) {
                System.out.println("Connection establised using connection");
            }
                String query = "UPDATE emp_tab SET name = ? WHERE empno = ?";
                ps= conn.prepareStatement(query);
                ps.setString(1, "King2");
                ps.setInt(2,7001);
                int rows = ps.executeUpdate();
                
                if(rows != 0)
                	{System.out.println("Update Completed Succesffully");
                	}	
                else
                {
                	System.out.println("Could not be done");
                }
                String selectquery = "SELECT * FROM emp_tab where empno = ?";
                ps= conn.prepareStatement(selectquery);
                ps.setInt(1, 7001);
                
                rs= ps.executeQuery();
                
                while(rs.next()) {
                    System.out.println( rs.getInt(1) +"\t"+ rs.getString(2) +"\t"+rs.getString(3)+"\t"+rs.getString(4));               
               } 
            }
        
        catch(Exception e) {
            e.printStackTrace();
        }
	}

}
