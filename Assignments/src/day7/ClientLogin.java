package day7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClientLogin {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type L to Login, R to Regrister");
		char c = sc.nextLine().charAt(0);
		
		
				
		
		ResultSet resultSet;
		
		if(c == 'R')
		{
				Login login = new Login();
				System.out.println("Username : ");
				login.setUserName(sc.nextLine());
				System.out.println("Password : ");
				login.setPassword(sc.nextLine());
			
			
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
				
				Statement statement;
				statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				//statement = connection.createStatement();
				
				String sql;
				sql = String.format("INSERT INTO login VALUES('%s','%s')", login.getUserName(),login.getPassword());
				
				System.out.println("yo");
				statement.executeUpdate(sql);
				
			
			
		}
		if ( c == 'L')
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
			System.out.println("Username :");
			String username = sc.nextLine();
			System.out.println("Password :");
			String password = sc.nextLine();
			Statement statement;
			statement = connection.createStatement();
			String sql = String.format("SELECT password FROM login where username = '%s'",username);
			resultSet = statement.executeQuery(sql);
			if(resultSet.equals(password));
			{
				System.out.println("Login Successfull");
				
			}
		}
		connection.close();
		

	}
}
