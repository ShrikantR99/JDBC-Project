package com.learn.jdbc.ex4;

import java.sql.*;
public class Prog4 {

	public static void main(String[] args) {
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_db";
			String username = "root";
			String password = "Shrikant99";
			String query = "UPDATE STUDENT SET NAME='Shrikant' WHERE ROLL=3";
			//Establish the connection
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connection is established");
			
			//Creating the statement using connection
			Statement stmt = con.createStatement();
			
			//Executing the query using the statement
			stmt.executeUpdate(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

