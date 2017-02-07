package main;

public class Homework extends AtHomeAssignment {

	boolean isStudy;
	
	public Homework(String course, String title, int month, int day, int year){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		isStudy = true;
	}
	
	public Homework(String course, String title, int month, int day, int year, int priority){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
		isStudy = true;
	}
	
	@Override
	boolean isHomework() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean isStudy() {
		// TODO Auto-generated method stub
		return false;
	}

}
