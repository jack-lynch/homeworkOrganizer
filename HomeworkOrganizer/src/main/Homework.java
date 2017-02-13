package main;

public class Homework extends AtHomeAssignment {

	boolean isStudy;
	
	/**
	 * 
	 * @param course
	 * @param title
	 * @param month
	 * @param day
	 * @param year
	 */
	public Homework(Course course, String title, int month, int day, int year){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(1);
		isStudy = true;
	}
	
	/**
	 * 
	 * @param course
	 * @param title
	 * @param month
	 * @param day
	 * @param year
	 * @param priority
	 */
	public Homework(Course course, String title, int month, int day, int year, int priority){
		setCourse(course);
		setTitle(title);
		setDueDate(month, day, year);
		setPriority(priority);
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
		return false;
	}

}
