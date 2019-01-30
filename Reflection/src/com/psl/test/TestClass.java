package com.psl.test;

public class TestClass {
	
	@TestThis(name = "This is first test method")
	public void testMethod_1(){
		System.out.println("Test Method 1");
	}
	@TestThis
	public void testMethod_2(){
		System.out.println("Test Method 2");
	}
	@TestThis
	public void testMethod_3(){
		System.out.println("Test Method 3");
	}
}
