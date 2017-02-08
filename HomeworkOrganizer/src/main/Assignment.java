package main;

import java.text.ParseException;
import java.util.Date;

public abstract class Assignment implements DueDate{

	protected int priority = -1;
	protected Course course;
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	protected String title;
	
	Date dueDate = new Date();
	
	public void setDueDate(int month, int day, int year){
		checkDate(month, day, year);
		
		try {
			dueDate = dateFormat.parse(month + "/" + day + "/" + year);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String toString(){
		return course.getName() + " - " + title + ", due " + dueDate;
	}
	
	protected double getClassGrade() {
		return course.getGrade();
	}
	protected void setClassGrade(double classGrade) {
		course.setGrade(classGrade);
	}

	
	protected int getPriority() {
		return priority;
	}

	protected void setPriority(int priority) {
		this.priority = priority;
	}

	
	protected String getCourseName() {
		return course.getName();
	}

	protected void setCourseName(String courseName) {
		course.setName(courseName);
	}

	
	protected int getClassPeriod() {
		return course.getPeriod();
	}

	protected void setClassPeriod(int classPeriod) {
		course.setPeriod(classPeriod);
	}

	
protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

}