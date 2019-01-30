package Day3;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RepeatCalender {
	public static void main(String[] args) throws ParseException {
		
	int interval = 0;
	
	LocalDate date1 = LocalDate.of(2000, 1, 1);
	int numDays = date1.lengthOfYear(); 
	DayOfWeek firstday = date1.getDayOfWeek();
	
	for(int year = 2001 ;year <= 2100 ; year++){
		LocalDate date2 = LocalDate.of(year, 1, 1);
		int numOfDays = date2.lengthOfYear();
		DayOfWeek fday = date2.getDayOfWeek();
		interval++;
		if(firstday.equals(fday)){

			if(numDays == numOfDays){
				System.out.println(interval);
				break;
			
			}				
		}
		
	}
	}
}
