package com.psl.util;

public class NumberContainer<T extends Number> {
	
	private T[] data;
	
	public double sum(){
		double result = 0;
		for( T val :data){
			result += val.doubleValue();
		}
		return result;
	}
	
	public double average(){
		return sum()/data.length;
	}
	
	public boolean hasSameAverage(NumberContainer<?> val)
	{
		return average() == val.average();
	}
}
