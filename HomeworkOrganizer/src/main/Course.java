package main;

public class Course {

	private int period; 
	private String name;
	private double grade;
	
	public Course(int period, String name, double grade){
		this.period = period;
		this.name = name;
		this.grade = grade;
	}
	
	public Course(int period, String name){
		this.period = period;
		this.name = name;
		grade = 100;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the period
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public void setPeriod(int period) {
		this.period = period;
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
