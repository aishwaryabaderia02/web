package com.psl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:/8080/SrpingMVC/
//http://localhost:/8080/SrpingMVC/home
//http://localhost:/8080/SrpingMVC/login

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/home")
	public String showHomePage(Model m) {
		System.out.println("inside showhomepage");
		m.addAttribute("hello", "Hello Welcome to SpringMVC...!!!");
		return "home";  //view name
	}
	
	@RequestMapping(value="/{empName}")
	public ModelAndView showEmpHome(Model m,@PathVariable String empName){
		
		System.out.println("inside empName");
		Employee e = new Employee();
		m.addAttribute("name",empName);
		//controller-->service-->DAOImpl-->DB
		return new ModelAndView("emp","employee",e);
	}
}
