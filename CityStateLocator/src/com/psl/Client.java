package com.psl;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.util.DataManagerImpl;


public class Client {
	
	public static void main(String[] args) {
		//Call your methods from here  to test the code implemented
		Map<String,List<String>> map = null;
		DataManagerImpl dmi = new DataManagerImpl();
		try {
			map = dmi.populateCityDataMap("StateCityDetails.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Map.Entry<String, List<String>> val :map.entrySet())
		{
			System.out.print(val.getKey());
			for(String state : val.getValue())
			{
				System.out.print("   " + state );
			}
			System.out.println();
		}
	}
}