package Tester;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class dueDateTest {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		Date dueDate = new Date();
		Date currentDate = new Date();
		
		try {
			dueDate = dateFormat.parse("04/10/1999");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(dateFormat.format(currentDate)); 
		System.out.println(dateFormat.format(dueDate)); 

		
	}
	
	private Calendar getCalendar(int year, int month, int day) {
	    Calendar c = Calendar.getInstance();
	    c.set(Calendar.YEAR, year);
	    c.set(Calendar.MONTH, month);
	    c.set(Calendar.DAY_OF_MONTH, day);
	    return c;
	}

}
