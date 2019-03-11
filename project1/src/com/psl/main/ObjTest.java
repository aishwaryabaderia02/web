package com.psl.main;

import java.util.HashSet;
import java.util.Set;


public class ObjTest {
	
	static void test() throws Error{
		System.out.println("yo");
		 if(true) throw new AssertionError();
		 System.out.println("test");
	}
	public static void main (String [] args) {
	 try{
		 test();
	 }
	 catch(Exception ex)
	 {
		 System.out.println("end");
	 }
	 
	 try{
	 args = null;
	 args[0] = "yay";
	 System.out.println(args[0]);
	 }catch(NullPointerException ex){
		 System.out.println("Exception");
	 }catch(Exception e)
	 {
		 System.out.println("Null pointer");
	 }
	 
	 Set<Integer> set = new HashSet<Integer>();
	 Integer i1 = 45;
	 Integer i2 = 46;
	 set.add(i1);
	 set.add(i2);
	 i2 = 47;
	 set.remove(i2);
	 for(Integer i : set)
	{
		System.out.println(i.intValue());
		 };
	//System.out.println(p1 =(B) p0);
 }
 } 