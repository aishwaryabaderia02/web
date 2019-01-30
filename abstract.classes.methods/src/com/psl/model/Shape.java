package com.psl.model;

	public abstract class Shape {
	
	//String name;
	
	private String name;
	private double area , perimeter , volume,sArea;
	
	public double getsArea() {
		return sArea;
	}

	public void setsArea(double sArea) {
		this.sArea = sArea;
	}

	public Shape(String name){
		this.name = name;
		
	}
	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	abstract public void calculateArea();
	abstract public void calculatePerimeter();
	abstract public void calculateVolume();
	abstract public void calculatesArea();

		
	
}
