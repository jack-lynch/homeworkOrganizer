package main;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	public MainPanel() {
		JPanel mainCoursesPanel = new JPanel();
		this.add(mainCoursesPanel);
		mainCoursesPanel.setLayout(new BoxLayout(mainCoursesPanel, BoxLayout.Y_AXIS));
		
		JLabel lblCourses = new JLabel("Courses");
		mainCoursesPanel.add(lblCourses);
		
		JPanel coursesPanel = new JPanel();
		mainCoursesPanel.add(coursesPanel);
		coursesPanel.setLayout(new BoxLayout(coursesPanel, BoxLayout.Y_AXIS));
		
		JPanel mainToDoPanel = new JPanel();
		this.add(mainToDoPanel);
		mainToDoPanel.setLayout(new BoxLayout(mainToDoPanel, BoxLayout.Y_AXIS));
		
		JLabel lblTodo = new JLabel("To-Do");
		mainToDoPanel.add(lblTodo);
		
		JPanel ToDoPanel = new JPanel();
		mainToDoPanel.add(ToDoPanel);
		ToDoPanel.setLayout(new BoxLayout(ToDoPanel, BoxLayout.Y_AXIS));
		
		

	}

}
