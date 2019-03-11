package com.psl.service;

import com.psl.dao.IEmployeeDAO;

public class EmployeeService {
	
	IEmployeeDAO dao;
	
	public IEmployeeDAO getDao() {
		return dao;
	}
	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}
	
	public void employeeLDAP(int id){
		System.out.println("Employee LDAP process started");
		dao.deleteEmployee(id);
	}
}
