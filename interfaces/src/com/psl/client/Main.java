package com.psl.client;

public class Main {
	public static void main(String[] args) {
		driveVehicle(new Airplane());
		driveVehicle(new Truck());
		
		final Vehicle v;
		v= new Vehicle();
		
		//String.v
	}
	
	public static void driveVehicle(Driveable d)
	{
		d.accelerate();
		d.steer();
	}
}
