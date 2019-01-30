package day5;

import java.sql.Date;
import java.sql.Timestamp;

public class DateClass {
	public static void main(String[] args) {
		
		Date d1 = Date.valueOf("2000-02-01");
		Date d2 = Date.valueOf("2000-01-01");
		Timestamp ts1 = new Timestamp(d1.getTime());
		Timestamp ts2 = new Timestamp(d2.getTime());
		
		System.out.println(ts1 + " " + ts2);
		if(d1.after(d2)){
			System.out.println(d1.getTime() + " appears b4 " + d2.getTime());
		}
		else
		{
			System.out.println(d2.getTime() + " appears b4 " + d1.getTime());
		}
		
		if(d1.compareTo(d2) > 0){
			System.out.println(d1.getTime() + " appears b4 " + d2.getTime());
		}else if(d1.compareTo(d2) < 0)
		{
			System.out.println(d2.getTime() + " appears b4 " + d1.getTime());
		}
		else
		{
			System.out.println("Dates are equal");
		}
		
		
		}
		
	

}
