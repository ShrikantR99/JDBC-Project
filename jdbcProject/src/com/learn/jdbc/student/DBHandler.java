package com.learn.jdbc.student;

import java.sql.*;

public class DBHandler 
{
	public static void insert(Connection con, int rollNo, String name, int age)
	{
		try
		{
			String query ="INSERT INTO STUDENT VALUES(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, rollNo);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.executeUpdate();
			System.out.println("Rows are inserted");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
