package com.learn.jdbc.student;

import java.sql.*;

public class StuidentApp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username = "root";
		String password = "Shrikant99";
		Connection con = null;
		try 
		{
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			
			Student st1 = new Student(11,"Shrikant",24);
			DBHandler.insert(con, st1.rollNo, st1.name,st1.age);
			Student st2 = new Student(12,"Shreyash",25);
			DBHandler.insert(con, st2.rollNo, st2.name,st2.age);
			Student st3 = new Student(13,"Pallavi",22);
			DBHandler.insert(con, st3.rollNo, st3.name,st3.age);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
