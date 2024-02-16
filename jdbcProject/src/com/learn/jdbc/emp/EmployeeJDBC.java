package com.learn.jdbc.emp;

import java.sql.*;
import java.util.Scanner;


public class EmployeeJDBC { 
 //Method to insert the row in the database
 public static void insert(Connection con) throws Exception {
  String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the id, name and salary to be inserted");
  int id = scan.nextInt();
  String name = scan.next();
  int salary = scan.nextInt();
  PreparedStatement pstmt = con.prepareStatement(query);
  pstmt.setInt(1, id);
  pstmt.setString(2, name);
  pstmt.setInt(3, salary);
  pstmt.executeUpdate();
  System.out.println("Row is inserted");
 }
//Method to update the row in the database
 public static void update(Connection con) throws Exception {
  String query = "UPDATE EMPLOYEE SET SALARY = ? WHERE ID=?";
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the id and salary to be updated");
  int id = scan.nextInt();
  int salary = scan.nextInt();
  PreparedStatement pstmt = con.prepareStatement(query);
  pstmt.setInt(1, salary);
  pstmt.setInt(2, id);
  pstmt.executeUpdate();
  System.out.println("Row is updated");
 }

//Method to delete the row in the database
 public static void delete(Connection con) throws Exception {
  String query = "DELETE FROM EMPLOYEE WHERE ID=?";
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the id to be deleted");
  int id = scan.nextInt();
  PreparedStatement pstmt = con.prepareStatement(query);
  pstmt.setInt(1, id);
  pstmt.executeUpdate();
  System.out.println("Row is deleted");
 }
//Method to select the rows in the database
 public static void select(Connection con) throws Exception {
  String query = "SELECT * FROM EMPLOYEE where id = ?";  
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the id to be selected");
  int id = scan.nextInt();
  PreparedStatement pstmt = con.prepareStatement(query);
  pstmt.setInt(1, id);
  ResultSet rs = pstmt.executeQuery();
  while(rs.next()) 
  {
   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
  }
 }
public static void main(String[] args) throws Exception  {
  Scanner scan = new Scanner(System.in);
  String url="jdbc:mysql://localhost:3306/jdbc_database";
  String username = "root";
  String password = "Shrikant99";
  Connection con = DriverManager.getConnection(url, username, password);
  System.out.println("Connection is established");
  while(true)  
  {
   System.out.println("Enter 1 for insert, 2 for update, 3 for delete, 4 for select and any other choice to terminate");  
   int choice = scan.nextInt();
   if(choice == 1) {
    insert(con);
   }
   else if(choice == 2) {
    update(con);
   }
   else if(choice == 3) {
    delete(con);
   }
   else if(choice == 4) {
    select(con);
   }
   else {
    System.out.println("Incorrect choice");
    System.exit(0);
   }
  }
 }
}


