package com.learn2drive.model;

import java.io.Serializable;

import com.learn2drive.util.FuelType;

public class Engine implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4985737911262347214L;
	private double horsePower;
	private int cubicCapacity;
	private FuelType fuelType;
	
	
	public Engine(double horsePower, int cubicCapacity, FuelType fuelType) {
		super();
		this.horsePower = horsePower;
		this.cubicCapacity = cubicCapacity;
		this.fuelType = fuelType;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
}
