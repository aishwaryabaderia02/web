package com.util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.bean.Cheese;
import com.bean.CheeseType;
import com.bean.Item;
import com.bean.Milk;
import com.bean.MilkType;
import com.bean.Wheat;
import com.bean.WheatType;
import com.exception.NoDataFoundException;
import com.bean.Ingred;


// Override and implement all the methods of DBConnectionUtil Interface in this class
public class InventoryServiceImpl implements InventoryService {
	Connection connection;

	@Override
	public List<Item> readAllItemsFromDb() {
		List<Item> itemList = new ArrayList<Item>();
		Map<Ingred, Float> map = new HashMap<Ingred, Float>();
		Cheese cheese;
		DatabaseConnectionManager con = new DatabaseConnectionManager();
		try {
			
			connection = con.getConnection();
			Statement statement;
			PreparedStatement pstatement = null;
			statement = connection.createStatement();
			ResultSet resultset;
			resultset = statement.executeQuery("Select * from cheese_tbl");
			while (resultset.next()) {
				cheese = new Cheese();
				cheese.setId(resultset.getInt(1));
				cheese.setDescription(resultset.getString(2));
				cheese.setWeight(resultset.getFloat(3));
				cheese.setPrice(resultset.getFloat(4));
				cheese.setManufacturingDate(resultset.getDate(5));
				cheese.setUseBeforeMonths(resultset.getInt(6));
				cheese.setCheeseType(CheeseType.valueOf(resultset.getString(7)));
				ResultSetMetaData rsmd = resultset.getMetaData();
				map.put(Ingred.valueOf(rsmd.getColumnName(8)),
						resultset.getFloat(8));
				map.put(Ingred.vitamin, resultset.getFloat(9));
				map.put(Ingred.valueOf(rsmd.getColumnName(10)),
						resultset.getFloat(10));
				cheese.setCalorieTable(map);
				itemList.add(cheese);
			}
			resultset = statement.executeQuery("Select * from milk_tbl");
			while (resultset.next()) {
				Milk milk = new Milk();
				milk.setId(resultset.getInt(1));
				milk.setDescription(resultset.getString(2));
				milk.setWeight(resultset.getFloat(3));
				milk.setPrice(resultset.getFloat(4));
				milk.setManufacturingDate(resultset.getDate(5));
				milk.setUseBeforeMonths(resultset.getInt(6));
				milk.setMilkpacket(MilkType.valueOf(resultset.getString(8)));
				milk.setFatRate(resultset.getFloat(7));
				itemList.add(milk);
			}
			resultset = statement.executeQuery("Select * from wheat_tbl");
			while (resultset.next())
			{
				Wheat wheat = new Wheat();
				wheat.setId(resultset.getInt(1));
				wheat.setDescription(resultset.getString(2));
				wheat.setWeight(resultset.getFloat(3));
				wheat.setPrice(resultset.getFloat(4));
				wheat.setManufacturingDate(resultset.getDate(5));
				wheat.setUseBeforeMonths(resultset.getInt(6));
				wheat.setWheatType(WheatType.valueOf(resultset.getString(7)));
				itemList.add(wheat);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}finally{
			try {
				con.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return itemList;
	}
	@Override
public void calculateExpiryDate(List<Item> items) {

		for(Item item : items)
		{
			Calendar cal = Calendar.getInstance();
			cal.setTime(item.getManufacturingDate());
			cal.add(Calendar.MONTH, item.getUseBeforeMonths());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			item.setExpiryDate(Date.valueOf(sdf.format(cal.getTime())));
		}
	}
	@Override
	public void removeExpiredItems(List<Item> items) {
		Calendar cal = Calendar.getInstance();
		Iterator<Item> itr = items.iterator();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		while(itr.hasNext())
		{
			if(itr.next().getExpiryDate().compareTo(Date.valueOf(sdf.format(cal.getTime()))) < 0);
			{
				itr.remove();
			}
		}
		for(Item item :items)
		{
			System.out.println(item.getId());
		}
	}

	@Override
	public void sortItems(List<Item> items) {

		ExpirySort es = new ExpirySort();
		Collections.sort(items,es);

	}

	@Override
	public void applyDiscount(List<Item> items) {

		Calendar cal = Calendar.getInstance();
		
		for(Item item : items)
		{
			cal.setTime(item.getExpiryDate());
			cal.add(Calendar.MONTH, 6);
			java.util.Date date = cal.getTime();
			java.util.Date today = Calendar.getInstance().getTime();
			if(date.compareTo(today) >= 0){
				item.setPrice(Math.round(item.getPrice()*0.2));
			}
		}

	}

	@Override
	public List<Item> searchItem(String ItemType, List<Item> list)
			throws NoDataFoundException {

		List<Item> itemList = new ArrayList<Item>();
		for(Item item : list)
		{
	
			if(item.getDescription().contains(ItemType))
			{
				itemList.add(item);
			}
		}
		if(itemList.isEmpty())
		{
			throw new NoDataFoundException();
		}
		return itemList;

	}

}
class ExpirySort implements Comparator<Item>
{

	@Override
	public int compare(Item o1, Item o2) {
		return o1.getExpiryDate().compareTo(o2.getExpiryDate());
	}
	}
