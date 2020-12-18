package basic;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		
		Date date1 = new Date(cal.getTimeInMillis());
		System.out.println(date1);
		
		cal.setTime(date1);
		

	}

}
