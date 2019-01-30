package com.psl.client;

public class myDummyClass {
	public static int variable = 100; //inline initialization
	
	static
	{
		//static initialization block
	}
	
	public static int getVariable()
	{
		return variable;
	}
}
