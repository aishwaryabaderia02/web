package com.psl.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDAOImpl implements IEmployeeDAO {

	JdbcTemplate templateJdbc;
	
	
	public JdbcTemplate getTemplateJdbc() {
		return templateJdbc;
	}

	public void setTemplateJdbc(JdbcTemplate templateJdbc) {
		this.templateJdbc = templateJdbc;
	}

	@Override
	//@Transactional(propogation=Propogation.REQUIRED, readonly=false)
	public void deleteEmployee(int id) {
		templateJdbc.update("delete from field where id="+id);
		System.out.println("delete employee success");
		
		addEmployeeToHistory(id);
	}

	@Override
//	@Transactional(propogation=Propogation.REQUIRED)
	public void addEmployeeToHistory(int id) {
		templateJdbc.update("insert into history values(101,'aish')");
		System.out.println("Employee added to history table");
	}

}
