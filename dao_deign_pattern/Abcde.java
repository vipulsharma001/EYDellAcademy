package com.dao_deign_pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Abcde {

	 

    static { try {
Class.forName("com.mysql.cj.jdbc.Driver");
 }
catch (ClassNotFoundException e) {
 e.printStackTrace();
}
 }
public static void main(String[] args) {
Connection conn = null;
PreparedStatement ps = null;
ResultSet rs = null;
try {
String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=root";
conn = DriverManager.getConnection(dbURL);
 if (conn != null) {
 String query = "SELECT * FROM country_tab c INNER JOIN state_tab s ON c.country_id=s.country_id";}
 ps = conn.prepareStatement(query);

            // ps.setInt(1, 1);

 

            // int rows = ps.executeUpdate();

 

//            String selectSQL = "SELECT * from emp_ta where empno=?";
 ps = conn.prepareStatement(query);

            // ps.setInt(1, 7001);
 rs = ps.executeQuery();

 

            while (rs.next()) {

 

                System.out.println(rs.getInt(1));

 

            }

 

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
