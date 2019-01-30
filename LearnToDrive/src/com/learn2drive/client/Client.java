package com.learn2drive.client;

import com.learn2drive.model.Car;
import com.learn2drive.model.SUV;
import com.learn2drive.model.Sedan;
import com.learn2drive.util.FuelType;

public class Client {

	public static void main(String[] args) {
		Car xuv, baleno;
		
		
		
		xuv = new Car();
		xuv.setMake("Mahindra");
		xuv.setModel("XUV 700");
		xuv.setColour("Ink Blue");
		
		System.out.println(xuv.toString());
		
		System.out.println(xuv.getColour());
		System.out.println(xuv.getModel());
		System.out.println(xuv.getMake());
		
		baleno = new Car();
		baleno.setMake("Maruti");
		baleno.setModel("Baleno RS");
		baleno.setColour("Deep red");
		
		baleno = new Car("Maruti", "Baleno", " Deep Red");
		
		System.out.println(baleno.getColour());
		System.out.println(baleno.getModel());
		System.out.println(baleno.getMake());	
		
	//	SUV rexton = new SUV();
		
	//	rexton.setColour("Pitch Black");
	//rexton.setMake("Sanyong");
	//rexton.setModel("Rexton");
	//rexton.setFourWheelDrive(true);
		
		SUV rexton = new SUV("Snayong", " Rexton", "Pitch Black", true);
		
		Sedan ciaz = new Sedan();
		
		ciaz.setColour("Bright Yellow");
		ciaz.setConvertible(false);
		ciaz.setMake("Maruti");
		ciaz.setModel("Ciaz");
		
		carManager(xuv); //Car
		carManager(baleno); //Car
		carManager(rexton); //SUV
		carManager(ciaz); //Sedan
		
		FuelType f = FuelType.NATURAL_GAS;
		
		FuelType.DIESEL.getCombustionTempreture();
		
		switch(f)
		{
		case DIESEL:
		case NATURAL_GAS:
		}
		
		for(FuelType ft : FuelType.values()){
			System.out.println(ft);
			System.out.println(ft.getCombustionTempreture());
		}
	}
	
	
	
	public static void carManager(Car car){
	/*	System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getColour());
	*/
		//only car methods could be called by subclasses
		System.out.println(car.toString());
		//we are able to access method of subclass by runtime polymorphism
		//environment is looking at datatype of object and not the datatype of refrence 
	}
}
