package day5;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderFunction {

	public static void main(String[] args) {
		
	Calendar cal; 
	cal = new GregorianCalendar().getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	String date = sdf.format(cal.getTime());
	Date date1 = cal.getTime();
	
	Timestamp ts = new Timestamp(date1.getTime());
	System.out.println(date);
	System.out.println(ts);
	cal.add(cal.DATE,10);
	String date2 = sdf.format(cal.getTime());
	System.out.println(date2);
	
	
	//
	SimpleDateFormat format1 = new SimpleDateFormat("MMMM");
	System.out.println(format1.format(cal.getTime()));
	SimpleDateFormat format2 = new SimpleDateFormat("yyyy");
	System.out.println(format2.format(cal.getTime()));
	System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	
	//adding 1 year to Calendar
	cal.add(Calendar.YEAR, 1);
	String date3 = sdf.format(cal.getTime());
	System.out.println(date3);
	}
}
