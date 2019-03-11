package com.psl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AOPDemo {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("AOP.xml");
		
		Performer p = context.getBean("perform",Performer.class);
		try {
			p.perform();
		} catch (Exception e) {
			System.out.println("Rain");
		}
	}
}
