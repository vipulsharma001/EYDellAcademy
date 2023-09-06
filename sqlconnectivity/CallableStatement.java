package com.sqlconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallableStatement {
	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn = null;
		java.sql.CallableStatement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=Powerabc123@";
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				System.out.println("Connection establised using connection");
			}
		
			System.out.println("Enter Employee ID: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Employee Name: ");
			String empname = sc.nextLine();
			System.out.println("Enter Employee Role: ");
			String empRole = sc.nextLine();
			System.out.println("Enter Employee City: ");
			String empcity = sc.nextLine();
			System.out.println("Enter Employee Country: ");
			String empcountry = sc.nextLine();
			
			
			stmt = conn.prepareCall("call hplus.insertEmployee(?,?,?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, empname);
			stmt.setString(3, empRole);
			stmt.setString(4, empcity);
			stmt.setString(5, empcountry);
			
			
			stmt.registerOutParameter(6,java.sql.Types.VARCHAR);
			stmt.executeUpdate();
			String result =stmt.getString(6);
			System.out.println("Employee record save Sccess::"+result);
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {	
				stmt.close();
				sc.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
