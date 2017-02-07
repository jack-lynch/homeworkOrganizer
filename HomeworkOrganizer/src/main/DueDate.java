package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public interface DueDate {
	
	Date currentDate = new Date();
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	
	//public boolean hasDueDate();
	public void setDueDate();//Sets due Date...
	
	//Check to make sure date is in correct form...
	default void checkDate(int month, int day, int year){
		if(month > 12 || month < 1){
			JOptionPane.showMessageDialog(null, "Invalid month.");
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
					JOptionPane.showMessageDialog(null, "Invalid day.");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day > 30 || day < 1){
					JOptionPane.showMessageDialog(null, "Invalid v.");
				}
			case 2:
				if(day > 28 || day < 1){
					JOptionPane.showMessageDialog(null, "Invalid day.");
				}
			default:
				if(day > 31 || day < 1){
					JOptionPane.showMessageDialog(null, "Invalid day.");
				}
			}
			
			if(Integer.toString(year).length() == 2 || Integer.toString(year).length() == 4){
				if(Integer.toString(year).length() == 2){
					year += 2000;
				}
			}
		} 
	}
	
	//Returns true if an assignment is late...
	default boolean checkLate(Date due){
		if(currentDate.compareTo(due) > 0){
			return true;
		} else {
			return false;
		}
		
	}
}
