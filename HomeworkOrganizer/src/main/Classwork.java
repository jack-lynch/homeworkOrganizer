package main;

public class Classwork extends AtSchoolAssignment {

	boolean isClasswork;
	
	public Classwork(String course, String title, int month, int day, int year){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		isClasswork = true;
	}
	
	public Classwork(String course, String title, int month, int day, int year, int priority){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
		isClasswork = true;
	}
	
	@Override
	boolean isSchoolWork() {
		return isClasswork;
	}

	@Override
	boolean isTest() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
