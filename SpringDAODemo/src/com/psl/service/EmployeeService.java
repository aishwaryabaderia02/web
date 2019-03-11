package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psl.bean.Employee;
import com.psl.dao.IEmployeeDAO;

@Component("service")
public class EmployeeService {
	
	@Autowired
	IEmployeeDAO dao;
	
	public IEmployeeDAO getDao() {
		return dao;
	}

	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}

	public void createEmployee(Employee e) {
		dao.createEmployee(e);
		dao.insertEmployee(e);
		
	}
	
	public void updateEmployee() {
		// TODO Auto-generated method stub

	}
	
	public void getEmployee() {
		List<Employee> list = dao.getEmployee();
		System.out.println(list);
	}
}
