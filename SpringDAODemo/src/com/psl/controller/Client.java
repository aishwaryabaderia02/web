package com.psl.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.service.EmployeeService;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
	/*	Employee e = context.getBean("emp", Employee.class);
		
		//client --> service -->IEmpDAO
						//  --->EmpDAOImpl --> Template --> DB
		*/EmployeeService service = context.getBean("service", EmployeeService.class);
		
	//	service.createEmployee(e);
		service.getEmployee();
	}
}
