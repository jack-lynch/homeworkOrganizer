package main;

public class Study extends AtHomeAssignment {

	boolean isStudy;
	int duration;
	
	public Study(Course course, String title, int month, int day, int year){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		duration = 5;
		isStudy = true;
	}
	
	public Study(Course course, String title, int month, int day, int year, int priority){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
		this.duration = duration;
		isStudy = true;
	}
	
	@Override
	String getType() {
		return "Test";
	}
	
	@Override
	boolean isHomework() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean isStudy() {
		// TODO Auto-generated method stub
		return true;
	}

}
