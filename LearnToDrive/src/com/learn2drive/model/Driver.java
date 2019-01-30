package com.learn2drive.model;

public class Driver {
	private String name;
	private Licence licence;
	private Car car[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Licence getLicence() {
		return licence;
	}
	public void setLicence(Licence licence) {
		this.licence = licence;
	}
	public Car[] getCar() {
		return car;
	}
	public void setCar(Car[] car) {
		this.car = car;
	}
}
