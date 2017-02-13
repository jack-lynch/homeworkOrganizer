package main;

public class Test extends AtSchoolAssignment {

	boolean isTest;
	
	public Test(Course course, String title, int month, int day, int year){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		isTest = true;
	}
	
	public Test(Course course, String title, int month, int day, int year, int priority){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
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
	
	public String toString(){
		return course.getName() + " - " + title + ", due " + dayofDue + ", TEST";
	}

	@Override
	String getType() {
		return "Test";
	}

	
	
	
	
	

	

}
