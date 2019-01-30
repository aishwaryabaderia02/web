package com.psl.client;

public interface Driveable {
	
	//var is public static final we write it or not
	int variable = 100;
	public default void accelerate()
	{
		
	}
	public void steer();

}
