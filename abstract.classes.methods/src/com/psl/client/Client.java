package com.psl.client;

import com.psl.model.Circle;
import com.psl.model.Rectangle;
import com.psl.model.Shape;
import com.psl.model.Sphere;
import com.psl.model.ThreeDim;
import com.psl.model.Triangle;

public class Client {
	
	public static void main(String[] args) {
		Circle c = new Circle(6.4);
		Rectangle r = new Rectangle(45,57);
		Triangle t = new Triangle(57, 48 , 43);
		Sphere sp = new Sphere(20);
		shapeManager(c);
		shapeManager(r);
		shapeManager(t);
		shapeManager(sp);
		
		/*c.calculateArea();
		c.calculatePerimeter();
		
		r.calculateArea();
		r.calculatePerimeter();
		
		t.calculateArea();
		t.calculatePerimeter();
		
		System.out.println(c.getName());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		
		System.out.println(r.getName());
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		
		System.out.println(t.getName());
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
	}
	*/
	}
	public static void shapeManager(Shape s){
		if(Boolean.valueOf((s instanceof ThreeDim)))
		{
			s.calculateVolume();
			s.calculatesArea();
			System.out.println(s.getName());
			System.out.println(s.getVolume());
			System.out.println(s.getsArea());
		}
		else
		{
			s.calculateArea();
			s.calculatePerimeter();
			
			System.out.println(s.getName());
			System.out.println(s.getArea());
			System.out.println(s.getPerimeter());
		}
		
		
	}
}
