package com.persistent.app;

public class Greeter {
	
	String name;
	
	public Greeter(String name){
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}

	public String sayHello(){
		
		return "Hello " + getName(); 
	}
	
	public String sayGoodBye(){
		
		return "GoodBye " + getName(); 
	}
}
