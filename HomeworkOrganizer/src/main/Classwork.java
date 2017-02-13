package main;

public class Classwork extends AtSchoolAssignment {

	boolean isClasswork;
	
	public Classwork(Course course, String title, int month, int day, int year){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		isClasswork = true;
	}
	
	public Classwork(Course course, String title, int month, int day, int year, int priority){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
		isClasswork = true;
	}
	
	@Override
	String getType() {
		return "Test";
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
