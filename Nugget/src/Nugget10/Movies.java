package Nugget10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Movies {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstatement;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
			File file = new File("H:\\Users\\aishwarya_baderia\\Persistent\\Nugget\\Movies.txt");
			Scanner scanFile = new Scanner(new FileReader(file));
			pstatement = (PreparedStatement) connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			pstatement = connection.prepareStatement("Insert into movie values(?,?,?,?)");
			
			while(scanFile.hasNext()){
				String movie = scanFile.nextLine();
				String[] details = movie.split(",");
				System.out.println(details[0] + " " + details[1] );
				java.util.Date date = new SimpleDateFormat("dd/mm/yy").parse(details[3]);
				DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd");
				String formatedDate = dateformat.format(date);
								
				//pstatement.setString(1, details[0]);
				//pstatement.setString(2, details[1]);
				//pstatement.setString(3, details[2]);
				//pstatement.setDate(4,Date.valueOf(formatedDate));
	
				//pstatement.executeUpdate();
			}
			
			
			//String sql = String.format("INSERT INTO MOVIE VALUES('%s','%s','%s')", );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}
}
