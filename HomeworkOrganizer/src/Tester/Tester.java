package Tester;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tester {

	public static void main(String[] args) {
		
		Date dueDate = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date currentDate = new Date();
		System.out.println(dateFormat.format(currentDate)); //2016/11/16

	}

}
