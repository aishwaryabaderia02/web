package com.psl.main;
import java.util.Date;

import com.psl.util.NumberContainer;
import com.psl.util.Stack;;
public class Client {
	public static void main(String[] args) {
		Stack<String> s= new Stack<String>(10);
		Stack<Date> d = new Stack<Date>(5);
		s.push("Today");
		s.push("is");
		s.push("Tuesday");
		
	//	s.push(new Date());                                        Type Safe
		System.out.println(s.peek());
		
		String v = (String)s.pop();
		//System.out.println(s.pop());*/
		
		NumberContainer<Double> dbls = new NumberContainer<Double>();
		NumberContainer<Long> lngs = new NumberContainer<Long>();
		
		dbls.hasSameAverage(lngs);
		//dbls = ints;
		
		
		/*String s1,s2;
		s1 = "Hello";
		s2 = s1;
		if(s1 == s2){
			
		}*/
	}
}
