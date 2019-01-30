package com.psl.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		
		Class<?> cls = TestClass.class;
		
		for(Method m: cls.getDeclaredMethods())
		{
			if(m.isAnnotationPresent(TestThis.class))
			{
				try {
					m.invoke(testClass);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
