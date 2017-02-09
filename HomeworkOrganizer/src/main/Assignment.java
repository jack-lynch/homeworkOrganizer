package main;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Date;
import java.util.DuplicateFormatFlagsException;

public abstract class Assignment implements DueDate, Comparator<Assignment>, Comparable<Assignment>{

	protected int priority = -1;
	protected Course course;
	
	protected int dayofDue;
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
		dayofDue = day;
		try {
			dueDate = dateFormat.parse(month + "/" + day + "/" + year);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String toString(){
		String month;
		switch(dueDate.getMonth()){
		case 0: 
			month = "January";
			break;
		case 1: 
			month = "February";
			break;
		case 2: 
			month = "March";
			break;
		case 3: 
			month = "April";
			break;
		case 4: 
			month = "May";
			break;
		case 5: 
			month = "June";
			break;
		case 6: 
			month = "July";
			break;
		case 7: 
			month = "August";
			break;
		case 8: 
			month = "September";
			break;
		case 9: 
			month = "October";
			break;
		case 10: 
			month = "November";
			break;
		case 11: 
			month = "December";
		default:
			month = "January";
			break;
			
		}
		
		return title + " - " + course.getName() + ", due " + month + " " + dayofDue + ", 2017";
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
	
	public int compare(Assignment d, Assignment d1) {
	      return d.priority - d1.priority;
	}
	
	public int compareTo(Assignment d) {
	      return this.priority - d.priority;
	}

}