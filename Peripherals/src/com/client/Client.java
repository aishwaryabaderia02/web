package com.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Peripheral;

public class Client {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Set<Peripheral> peripherals = new HashSet<Peripheral>();
		readPeripheralInventory(peripherals);
		peripherals=sortInventoryByPrice(peripherals);
		for(Peripheral p : peripherals)
		{
			System.out.println(p.getPrice());
		}
		peripherals=sortInventoryByQuantityPrice(peripherals);
		for(Peripheral p : peripherals)
		{
			System.out.println(p.getPrice());
		}
		
	}

	/** this method will read peripheral details from the CSV file
	given to you and populate the Set*/
	public static void readPeripheralInventory(Set<Peripheral> peripherals) {
	
		//peripherals = new HashSet<Peripheral>();
		try {
			Scanner scanfile = new Scanner(new File("C:\\Workspace\\Peripherals\\Peripherals.txt"));
			while(scanfile.hasNext())
			{
				String[] peri = scanfile.nextLine().split(",");
				Peripheral p = new Peripheral();
				p.setItemCode(peri[0]);
				p.setName(peri[1]);
				p.setDescription(peri[2]);
				p.setPrice(Integer.parseInt(peri[3]));
				p.setQuantity(Integer.parseInt(peri[4]));
				peripherals.add(p);
	
			}
			
			//insertPeripheralRecords(peripherals);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/** this method will insert the peripheral information read earlier
	into a database table */
	public static void insertPeripheralRecords(Set<Peripheral> peripherals) {
		Connection connection = null;
		Statement statement;
		PreparedStatement pstatement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/peripheral","root","root");
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pstatement = connection.prepareStatement("INSERT INTO peripherals VALUES(?,?,?,?,?)");
			 
			for(Peripheral ph : peripherals){
				
				pstatement.setString(1,ph.getItemCode());
				pstatement.setString(2,ph.getName());
				pstatement.setString(3,ph.getDescription());
				pstatement.setInt(4,ph.getPrice());
				pstatement.setInt(5,ph.getQuantity());
				
				pstatement.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/** this method will sort a given Set by price in the ascending order.
	It will create a new ordered Set and return it. */
	public static Set<Peripheral>  sortInventoryByPrice(Set<Peripheral> peripherals) {
		
		TreeSet<Peripheral> ts = new TreeSet<Peripheral>(new priceComparator());
			ts.addAll(peripherals);
	
		return ts;
	}

	/** this method will sort a given Set by quantity in the ascending order.
	Peripherals with the same quantity should be sorted amongst themselves 
	by price in the ascending order. It will return a new Set with the sorted objects */
	public static Set<Peripheral>  sortInventoryByQuantityPrice(Set<Peripheral> peripherals) {
		TreeSet<Peripheral> ts = new TreeSet<Peripheral>(new QuantityComparator());
		ts.addAll(peripherals);

	return ts;
		
	}

	/** this method will return a new Set with records filtered from an existing Set on the basis
	of price. Both prices are inclusive. */
	public static Set<Peripheral> filterInventoryByPrice(int startingPrice, int endingPrice, Set<Peripheral> peripherals) {

		
	//	TreeSet tree_set.subSet(Peripheral  , Object up_element)

		return null;
	}

}
class priceComparator implements Comparator<Peripheral>{

	@Override
	public int compare(Peripheral o1, Peripheral o2) {
		if(o1.getPrice() > o2.getPrice())
		{
			return 1;
		}
		else if(o1.getPrice() < o2.getPrice())
		{
			return -1;
		}
		else
			return 0;
	}
	
}

class QuantityComparator implements Comparator<Peripheral>{

	@Override
	public int compare(Peripheral o1, Peripheral o2) {
		if(o1.getQuantity() > o2.getQuantity())
		{
			return 1;
		}
		else if(o1.getQuantity() < o2.getQuantity())
		{
			return -1;
		}
		else
		{
			if(o1.getPrice() > o2.getPrice())
			{
				return 1;
			}
			else if(o1.getPrice() < o2.getPrice())
			{
				return -1;
			}
			else
				return 0;
		}
	}
	
}