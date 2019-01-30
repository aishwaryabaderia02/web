package com.psl.model;

public class Sphere extends ThreeDim{
	
	private double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calculateVolume()
	{
		setVolume(4/3 * Math.PI * getRadius() * getRadius() *getRadius());
	}
	
	public void calculateArea()
	{}
	
	public void calculatePerimeter()
	{}

	//@Override
	public void calculatesArea() {
		setsArea(4 * Math.PI * getRadius() * getRadius());
	}
	


}
