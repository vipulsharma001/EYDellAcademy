package com.sqlconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlcool {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/hplus?user=root&password=Powerabc123@";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url);
		Statement st= conn.createStatement();
		String query="select * from alien";
		ResultSet rs =st.executeQuery(query);
		while(rs.next()) {
            System.out.print("Name : " + rs.getString(1));
            System.out.println("Id : " + rs.getInt(2));            
       }    
		st.close();
		conn.close();
		
	}
}
