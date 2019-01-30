package com.bean;

public class Employee {
	private String employeeCode;
	private String name;
	private String designation;
	
	public Employee() { /* does nothing */ }
	public Employee(String employeeCode, String name, String designation) {
		this.employeeCode = employeeCode;
		this.name = name;
		this.designation = designation;
	}
	
	public String getEmployeeCode() { return employeeCode; }
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getDesignation() { return designation; }
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return getEmployeeCode();
	}
}
