package com.learn2drive.model;

public class SUV extends Car {
	
	private boolean fourWheelDrive;

	public SUV(){
		super(); /*Can be used only in the body of the constructor
		          *It has to be the first statement in the body of the constructor
		          */
		fourWheelDrive = false;
	}
	public SUV(String make,String model,String colour,boolean fourWheelDrive){
		super(make,model,colour);
		this.fourWheelDrive = fourWheelDrive;
	}
	
	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	@Override
	public String toString() {
		return super.toString() + "---" + isFourWheelDrive();
	}
	
	
}
