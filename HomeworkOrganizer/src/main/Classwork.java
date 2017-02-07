package main;

public class Classwork extends AtSchoolAssignment {

	boolean isClasswork;
	
	public Classwork(String course, int month, int day, int year){
		setCourseName(course);
		setDueDate(month, day, year);
		setPriority(3);
		isClasswork = true;
	}
	
	public Classwork(String course, int month, int day, int year, int priority){
		setCourseName(course);
		setDueDate(month, day, year);
		setPriority(priority);
		isClasswork = true;
	}
	
	@Override
	boolean isSchoolWork() {
		return true;
	}

	@Override
	boolean isTest() {
		// TODO Auto-generated method stub
		return false;
	}

}
