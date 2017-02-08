package main;

public class Homework extends AtHomeAssignment {

	boolean isStudy;
	
	public Homework(Course course, String title, int month, int day, int year){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		isStudy = true;
	}
	
	public Homework(Course course, String title, int month, int day, int year, int priority){
		setCourse(course);
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
