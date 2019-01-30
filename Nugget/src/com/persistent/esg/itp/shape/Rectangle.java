package com.persistent.esg.itp.shape;

public class Rectangle implements Polygon {
	
	private int length,breadth,area,perimeter;
	
	public Rectangle(int length , int breadth){
		this.breadth = breadth;
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
	
	@Override
	public void calcArea() {
		setArea(length*breadth);
		
	}

	@Override
	public void calcPeri() {
		setPerimeter(2*(length+breadth));		
	}

	@Override
	public void display() {
		System.out.println("area : " + getArea() + "\n" + "permeter : " + getPerimeter());
		
	}

	
}
