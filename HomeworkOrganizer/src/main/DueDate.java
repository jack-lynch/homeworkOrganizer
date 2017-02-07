package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public interface DueDate {
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	
	public boolean hasDueDate();
	public void setDueDate();//Sets due Date...
	public boolean checkLate();//Checks date to current date..
	
	//Check to make sure date is in correct form
	default void checkDate(int month, int day, int year){
		if(month > 12 || month < 1){
			//return a message
		} else if (month <= 12 || month > 0){
			switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day > 31 || day < 1){
					//return a message
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day > 30 || day < 1){
					//return a message
				}
			case 2:
				if(day > 28 || day < 1){
					//return a message
				}
			default:
				if(day > 31 || day < 1){
					//return a message
				}
			}
			
			if(Integer.toString(year).length() == 2 || Integer.toString(year).length() == 4){
				if(Integer.toString(year).length() == 2){
					year += 2000;
				}
			}
		} 
	}
	
}
