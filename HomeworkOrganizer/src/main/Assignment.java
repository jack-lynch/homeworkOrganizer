package main;

import java.text.ParseException;
import java.util.Date;

public abstract class Assignment implements DueDate{

	protected double classGrade;
	protected int priority = -1;
	protected String courseName;
	protected int classPeriod;
	
	Date dueDate = new Date();
	
	
	public void setDueDate(int month, int day, int year){
		checkDate(month, day, year);
		
		try {
			dueDate = dateFormat.parse(month + "/" + day + "/" + year);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	protected double getClassGrade() {
		return classGrade;
	}
	protected void setClassGrade(double classGrade) {
		this.classGrade = classGrade;
	}

	
	protected int getPriority() {
		return priority;
	}

	protected void setPriority(int priority) {
		this.priority = priority;
	}

	
	protected String getCourseName() {
		return courseName;
	}

	protected void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	protected int getClassPeriod() {
		return classPeriod;
	}

	protected void setClassPeriod(int classPeriod) {
		this.classPeriod = classPeriod;
	}

}