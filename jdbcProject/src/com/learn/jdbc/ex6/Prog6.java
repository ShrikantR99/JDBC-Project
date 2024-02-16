package com.learn.jdbc.ex6;

import java.sql.*;

public class Prog6 {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String username = "root";
		String password = "Shrikant99";
		String query = "SELECT * FROM STUDENT";
	
		// Establish the connection
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connection is established");
		
		//Creating the statement using connection
		Statement stmt = con.createStatement();
		
		//Executing the query using the statement and getting result set
		ResultSet rs = stmt.executeQuery(query);
		
		//Traversing the result set
		while(rs.next())
		{
			//Displaying the data of table
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
	}

}
