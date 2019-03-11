package com.psl.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Student> list = new ArrayList<Student>();
	Student st = new Student();
	st.setName("a");
	st.setRollno(10);
	list.add(st);
	st = new Student();
	st.setName("b");
	st.setRollno(20);
	list.add(st);
	st = new Student();
	st.setName("c");
	st.setRollno(30);
	list.add(st);
	Iterator<Student> itr = list.iterator();
	while(itr.hasNext())
	{
	
		System.out.println(itr.next().name);
			if(itr.next().getName().equals("b"))
			{
				System.out.println("yo");
			}
	}
	
}
}
