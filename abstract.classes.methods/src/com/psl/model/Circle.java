package com.psl.model;

public class Circle extends TwoDim {
	
	private double radius;
	public Circle(double radius)
	{
		super("Circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void calculateArea()
	{
		setArea(Math.PI*getRadius()*getRadius());
	}
	
	public void calculatePerimeter()
	{
		setPerimeter(Math.PI * getRadius() * 2);
	}
	
	public void calculateVolume()
	{}

	@Override
	public void calculatesArea() {
		// TODO Auto-generated method stub
		
	}
}
