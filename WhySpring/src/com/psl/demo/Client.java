package com.psl.demo;

public class Client {
	public static void main(String[] args) {
		Performance p = new Performance(new Dancer());
		p.perform();
		Performance p1 = new Performance(new Singer());
		p.perform();
		Performance p2 = new Performance(new Painter());
		p.perform();
	
	}
}
