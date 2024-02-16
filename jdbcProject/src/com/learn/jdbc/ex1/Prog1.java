package com.learn.jdbc.ex1;
// 1. import java.sql package
import java.sql.*;
public class Prog1 {

	public static void main(String[] args) {
		
		try
		{
			String url = "jdbc:mysql://localhost:3306/jdbc_db";
			String username = "root";
			String password = "Shrikant99";
		
			//2. Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
		
			//3. Establish the connection
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connection is established at "+con);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
