package com.psl.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="emp")
public class Employee {
	@Value(value = "999")
	private int employeeId;
	
	@Value(value = "Aish")
	private String employeeName;
	
	@Autowired
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
	@PostConstruct
	public void myMethodABC(){
	System.out.println("MyMethodABC");	
	} 
	
	@PreDestroy
	private void myMehodXYZ() {
		// TODO Auto-generated method stub
		System.out.println("MyMethodXYZ");	
	}
	
	
}
