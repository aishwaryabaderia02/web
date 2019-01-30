package day7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import day7.CMS;
public class Client {
	
	static{                                            
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		CMS contact = Client.createContact("Aishwarya","9425465912",Date.valueOf("1997-04-02"));
		Client.updateContact
		}
	
	public static CMS createContact(String name,String mobile,Date date) throws SQLException{
		CMS contact = new CMS(name,mobile,date);
		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");
		Statement statement;
		statement = connection.createStatement();
		
		String sql = String.format("INSERT INTO contantinfo VALUES('%s','%s','%s')", contact.getName(),contact.getNumber(),contact.getDate());
		statement.executeUpdate(sql);
		connection.close();
		statement.close();
		return contact;
	}
}
