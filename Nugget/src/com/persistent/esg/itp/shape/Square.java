package com.persistent.esg.itp.shape;

public class Square implements Polygon {

	private float side,area,perimeter;
	
	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}


	public void setSide(float side) {
		this.side = side;
	}


	public float getArea() {
		return area;
	}


	public void setArea(float area) {
		this.area = area;
	}


	public float getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(float perimeter) {
		this.perimeter = perimeter;
	}


	@Override
	public void calcArea() {
		setArea(side * side);
		
	}

	@Override
	public void calcPeri() {
		setPerimeter(4 * side);		
	}

	@Override
	public void display() {
		System.out.println("area : " + getArea() + "\n" + "permeter : " + getPerimeter());
		
	}
	
	
}
