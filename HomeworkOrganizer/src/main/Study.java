package main;

public class Study extends AtHomeAssignment {

	boolean isStudy;
	int duration;
	
	public Study(String course, String title, int month, int day, int year, int duration){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		this.duration = duration;
		isStudy = true;
	}
	
	public Study(String course, String title, int month, int day, int year, int duration, int priority){
		setCourseName(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
		this.duration = duration;
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
		return true;
	}

}
