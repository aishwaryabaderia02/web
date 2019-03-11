package com.psl.demo;

public class Painter implements IArt {
	public Painter(){
		System.out.println("Painter");
	}
	
	public void doArt(){
		System.out.println("I paint");
	}
	
}
