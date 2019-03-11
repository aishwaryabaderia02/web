package com.psl.bean;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Address addr;
	
	public Employee(){
		System.out.println("Employee con");
	}

	public Employee(int employeeId, String employeeName, Address addr) {
		super();
		System.out.println("Employee param");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addr = addr;
		System.out.println("Employee con");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", addr=" + addr + "]";
	}
	public void myMethodABC(){
	System.out.println("MyMethodABC");	
	} 
	private void myMehodXYZ() {
		// TODO Auto-generated method stub
		System.out.println("MyMethodXYZ");	
	}
	
	
}
