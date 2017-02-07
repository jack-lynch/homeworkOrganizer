package main;

import java.text.ParseException;
import java.util.Date;

public abstract class Assignment implements DueDate {

	Date dueDate = new Date();
	
	abstract float enterClassGrade();
	abstract int enterClassPeriod();
	
	public void setDueDate(int month, int day, int year){
		checkDate(month, day, year);
		try {
			dueDate = dateFormat.parse(month + "/" + day + "/" + year);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}