package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;


// Override and implement the methods of Interface DataManager here 
public class DataManagerImpl implements DataManager {

	@Override
	public Map<String, List<String>> populateCityDataMap(String fileName)
			throws FileNotFoundException {
		Set<String> State = new HashSet<String>();
		List<String> city = new ArrayList<String>();
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		Scanner scanfile = new Scanner(new File(fileName));
		while(scanfile.hasNext())
		{
			String[] StateCity = scanfile.nextLine().split("-");
			State.add(StateCity[0]);
			
		}
		
		for(String state: State)
		{
			scanfile = new Scanner(new File(fileName));
			city = new ArrayList<String>();
			while(scanfile.hasNext())
			{
				String[] StateCity = scanfile.nextLine().split("-");
				if(state.equals(StateCity[0]))
				{
					city.add(StateCity[1]);
				}
				map.put(state, city);
				
			}
		}
		return map;
	}

	@Override
	public List<String> getCities(Map<String, List<String>> stateCityMap,
			String state) throws InvalidStateException {
		List<String> city = new ArrayList<String>();
		for(Map.Entry<String, List<String>> val :stateCityMap.entrySet())
		{
			if(state.equals(val.getKey()))
			{
				for(String st : val.getValue())
				{
					city.addAll(val.getValue());
					break;
				}
			}
		}
		return city;
	}

	@Override
	public String getState(Map<String, List<String>> stateCityMap, String city)
			throws CityNotFoundException {
		for(Map.Entry<String, List<String>> val :stateCityMap.entrySet())
		{
			if(val.getValue().contains(city))
			{
				return val.getKey();
			}
			
		}
	return null;	
	}
}
