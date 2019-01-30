package com.psl.client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.PooledConnection;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.psl.util.BankAccount;


public class Client {
	
	static{                                            //written in static because connection would be made only once
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {	
		
		Connection connection = null;
		try {
			BankAccount iron_man = new BankAccount("Tony Stark", "3565", 354.64, Date.valueOf("2000-01-01"));
			BankAccount batman = new BankAccount("bruce Wayne", "46756", 364.64, Date.valueOf("2002-02-02"));
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root","root");
			connection.setAutoCommit(false);
			
			
			
		
			Statement statement;
			//resultset values could be forward only,scroll sensitive and scroll insensitive
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String sql ;
			sql = String.format("INSERT INTO tbl_bank_accounts VALUES('%s','%s','%f','%s')",  iron_man.getFullName(),
											iron_man.getNumbers(),	iron_man.getBalance(),iron_man.getOpenedOn());
			
			//statement.executeUpdate(sql);
			
			sql = String.format("INSERT INTO tbl_bank_accounts VALUES('%s','%s','%f','%s')",  batman.getFullName(),
												batman.getNumbers(),batman.getBalance(),batman.getOpenedOn());
			//statement.executeUpdate(sql);
			
			ResultSet resultset;
			resultset = statement.executeQuery("Select * from tbl_bank_accounts");
			while(resultset.next()){
				System.out.println(resultset.getString("account_number"));
				System.out.println(resultset.getString("full_name"));
				System.out.println(resultset.getDouble("balance")); 
				System.out.println(resultset.getDate("opening_date"));
				System.out.println("============================================");
			}
			
			while(resultset.previous()){
				System.out.println(resultset.getString("account_number"));
				System.out.println(resultset.getString("full_name"));
				System.out.println(resultset.getDouble("balance")); 
				System.out.println(resultset.getDate("opening_date"));
				System.out.println("============================================");
			}
			
			resultset.absolute(2);
			resultset.relative(-1);
			
			resultset.updateDouble("balance", 456.34);
			resultset.updateDate("opening_date", Date.valueOf("2003-05-02"));
			resultset.updateRow();
			statement.close();
			
			PreparedStatement prepareStatement;
			prepareStatement = connection.prepareStatement("INSERT INTO tbl_bank_accounts VALUES(?,?,?,?)");
			
			prepareStatement.setString(1, "43242");
			prepareStatement.setString(2, "abeer tripathi");
			prepareStatement.setDouble(3, 2576.13);
			prepareStatement.setDate(4, Date.valueOf("1999-04-11"));
			
			prepareStatement.executeUpdate();
			
			connection.commit();
			
			/*MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
			ds.setUrl("");
			ds.setPassword("");
			ds.setPassword("");
			
			PooledConnection pc = ds.getPooledConnection();*/
			
			//marking boundaries of code bu commit is called marketion
			//conection.getMetaData; return meta deta of database 
			//resultset.getMetadata return metadata of resultset
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}
}
