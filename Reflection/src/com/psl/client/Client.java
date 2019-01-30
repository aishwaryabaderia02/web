/*
 * Reflection is process of obtaining meta information  about object
 * All framework internally uses reflection API to create objects , therefore a without parameter constructor is must for every class
 */
package com.psl.client;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Client {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Warren Buffet","34235",3234.13);
		Class<?> cls = account.getClass();
		
		
		
		//another way of getting class object 
		Class<?> cls1 = BankAccount.class;
		
		for(Field f : cls.getDeclaredFields())
		{
			System.out.println(f.getType());
			System.out.println(f.getName());
		}
		System.out.println("=======");
		
		for(Method m : cls.getDeclaredMethods()){
			System.out.println(m.getName());
			System.out.println("--------------------------");
			if(m.getName().contains("get")){
				try {
					m.invoke(account);
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}                 //write try catch;
			}
		}
	}
}
