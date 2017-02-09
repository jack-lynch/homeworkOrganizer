package main;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

public class MainPanel extends JPanel {
	private JPanel assignmentsPanel;
	private JPanel classesPanel;
	private JLabel lblCurrentCourses;
	private JLabel lblCurrentAssignments;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	public MainPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		lblCurrentAssignments = new JLabel("Current Assignments");
		panel_2.add(lblCurrentAssignments);
		lblCurrentAssignments.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		
		assignmentsPanel = new JPanel();
		panel_2.add(assignmentsPanel);
		assignmentsPanel.setLayout(new BoxLayout(assignmentsPanel, BoxLayout.Y_AXIS));
		
		panel = new JPanel();
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		lblCurrentCourses = new JLabel("Current Courses");
		panel_3.add(lblCurrentCourses);
		lblCurrentCourses.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		classesPanel = new JPanel();
		panel_3.add(classesPanel);
		classesPanel.setLayout(new BoxLayout(classesPanel, BoxLayout.Y_AXIS));
		
		
		
		refreshData();
		
	}

	public void refreshData() {
		assignmentsPanel.removeAll();
		classesPanel.removeAll();
		
		for(Assignment assignment: HomeworkOrganizer.assignments){
			JLabel assignmentLabel = new JLabel();
			assignmentLabel.setText(assignment.toString());
			assignmentsPanel.add(assignmentLabel);
		}
		
		for(Course course: HomeworkOrganizer.courseList){
			JLabel courseLabel = new JLabel();
			courseLabel.setText(course.toString());
			classesPanel.add(courseLabel);
		}
	}

}
