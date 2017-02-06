package Tester;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tester {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		Date dueDate = new Date();
		Date currentDate = new Date();
		
		System.out.println(dateFormat.format(currentDate)); 

	}

}
