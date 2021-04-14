package com.vti.academy.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {
	public void connection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/Testing_System_Assignment_1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connection Success!");

		// Quession2
		String sql = "SELECT * FROM `Position`";
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(sql);
		while (resultset.next()) {
			System.out.print(resultset.getInt("PositionID") + " ");
			System.out.println(resultset.getString("PositionName"));
		}

		// Quession3: Insert into

		
		  String sql1 = "INSERT INTO `Position`(PositionName) " +
		  "Values 				(?)"; PreparedStatement preparedStatement =
		  connection.prepareStatement(sql1);
		 
		 String departmentName = "master1233259999";
		  
		 preparedStatement.setString(1,departmentName);
		  
		  int effectedrecordamout = preparedStatement.executeUpdate();
		  System.out.println(effectedrecordamout);
		 

		// Quession4. Update
		String sql2 = "UPDATE `Position`" + "SET PositionName = 'DEV111' " + "WHERE PositionID = 2";
		PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
		int effectedrecordamout1 = preparedStatement2.executeUpdate();
		System.out.println(effectedrecordamout1);
		
		// Quession5: Delete
		
	}
}
