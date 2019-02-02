package com.psl;

import java.util.ArrayList;
import java.util.List;

import com.bean.Item;
import com.exception.NoDataFoundException;
import com.util.InventoryServiceImpl;
public class Client {

	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
}
	
	public static void main(String[] args) {
		List<Item> itemList;
		List<Item> itemType = null;
		InventoryServiceImpl in = new InventoryServiceImpl();
		itemList = in.readAllItemsFromDb();
		
		in.calculateExpiryDate(itemList);
		in.sortItems(itemList);
		try {
			itemType = in.searchItem("Wheat", itemList);
		} catch (NoDataFoundException e) {
			e.printStackTrace();
		}
		for(Item item:itemType)
		{
			System.out.println(item.getClass());
		}
	}
		
}
