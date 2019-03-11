package com.psl.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	//	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee)context.getBean("emp");
		Employee e1 = (Employee)context.getBean("emp");
		
		System.out.println(e==e1);
		System.out.println(e.equals(e1));
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		
		context.registerShutdownHook();
	}
}
