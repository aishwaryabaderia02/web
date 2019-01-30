package com.psl.main;

public class ProductNotFoundException extends Exception {

	public ProductNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println(message);
	}

}
