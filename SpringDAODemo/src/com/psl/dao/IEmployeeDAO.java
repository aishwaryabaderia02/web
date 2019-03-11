package com.psl.dao;

import java.util.List;

import com.psl.bean.Employee;

public interface IEmployeeDAO {
	void createEmployee(Employee e);
	
	void insertEmployee(Employee e);
	
	List<Employee> getEmployee();
	
	void updateEmployee(Employee e);
	
	void deleteEmployee(int id);
}
