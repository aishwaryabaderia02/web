package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

//Override and implement all the methods of DBConnectionUtil here to create and close db connection 
public class DatabaseConnectionManager implements DBConnectionUtil {

	private Connection connection;
	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondb","root","root");
		return connection;
	}

	@Override
	public void closeConnection() throws SQLException {
		connection.close();
		
	}


}
