package com.learn.jdbc.ex3;

import java.sql.*;
public class Prog3 {

	public static void main(String[] args) {
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_db";
			String username = "root";
			String password = "Shrikant99";
			String query = "INSERT INTO STUDENT VALUES(1,'Rohit'),(2,'mohit'),(3,'Ajay')";
			
			// Establish the connection
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connection is established");
			
			//Creating the statement using connection
			Statement stmt = con.createStatement();
			
			//Executing the query using the statement
			stmt.execute(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
