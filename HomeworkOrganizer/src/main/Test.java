package main;

public class Test extends AtSchoolAssignment {

	boolean isTest;
	
	public Test(String course, String title, int month, int day, int year){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(3);
		isTest = true;
	}
	
	@Override
	boolean isSchoolWork() {
		return false;
	}
	@Override
	boolean isTest() {
		return true;
	}
	
	
	
	
	

	

}
