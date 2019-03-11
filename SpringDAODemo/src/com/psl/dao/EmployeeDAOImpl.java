package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.psl.bean.Employee;

@Component("dao")
//@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void createEmployee(Employee e) {
		template.execute("create table Employee(id int,name varchar(20),email varchar(20))");
	}

	@Override
	public void insertEmployee(Employee e) {
		String query = "Insert into Employee values("+e.getEmployeeId()+",'"+e.getEmployeeName()+"','"+e.getEmployeeEmail()+"')"; 
		template.execute(query);
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> list = template.query("select * from employee",new RowMapper(){

			@Override
			public Employee mapRow(ResultSet rs, int i) throws SQLException {
				Employee e = new Employee();
				e.setEmployeeId(rs.getInt(1));
				e.setEmployeeName(rs.getString(2));
				e.setEmployeeEmail(rs.getString(3));
				System.out.println("MapRow"+e);
				return e;
			}});
		return list;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
