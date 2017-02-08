package Tester;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lateChecker {

	public static void main(String[] args) {


		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		Date currentDate = new Date();
		Date due = new Date();
		
		try {
			due = dateFormat.parse("04/10/1999");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(currentDate.compareTo(due) > 0){
			System.out.println(currentDate);
			System.out.println(due);
			System.out.println("late");
		}

	}

}
