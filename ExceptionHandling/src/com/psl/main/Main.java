package com.psl.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		/*try(FileReader fr = new FileReader("Some file")){
			searchProduct("CODE-001");
			
		}catch(IOException | ProductNotFoundException e){
			
		}finally{
			
		}*/
		
		System.out.println(caculateSpeed(55.0,0.0));
	}
	
	/*public static void searchProduct(String productCode) throws ProductNotFoundException
	{
		throw new ProductNotFoundException("Not Found");
		
	}*/
	
	public static double caculateSpeed(double distance, double time)
	{
		assert distance > 0 : "Distance should be greater than 0";
		assert time > 0	: "time should be greater than 0";
		
		return distance/time;
	}
}
