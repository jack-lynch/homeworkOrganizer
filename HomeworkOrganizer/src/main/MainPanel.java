package main;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Collections;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;

public class MainPanel extends JPanel {
	private JPanel assignmentsPanel;
	private JPanel classesPanel;
	private JLabel lblCurrentCourses;
	private JLabel lblCurrentAssignments;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_3;
	private JScrollPane panel_2;
	
	
	public MainPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		lblCurrentAssignments = new JLabel("Current Assignments");
		lblCurrentAssignments.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblCurrentAssignments, BorderLayout.NORTH);
		lblCurrentAssignments.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		Dimension panel_2Size = new Dimension(350, 400);
		
		panel_2 = new JScrollPane();
		panel_2.setPreferredSize(panel_2Size);
		panel_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(panel_2, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
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
		
		
		
		assignmentsPanel = new JPanel();
		//add(assignmentsPanel);
		panel_2.setViewportView(assignmentsPanel);
		assignmentsPanel.setLayout(new BoxLayout(assignmentsPanel, BoxLayout.Y_AXIS));
		
        
		refreshData();
	}

	public void refreshData() {
		assignmentsPanel.removeAll();
		classesPanel.removeAll();
		Collections.sort(HomeworkOrganizer.assignments);
		Collections.reverse(HomeworkOrganizer.assignments);
		
		
		for(Assignment assignment: HomeworkOrganizer.assignments){
			JLabel assignmentLabel = new JLabel();
			
			//assignmentLabel.setText(assignment.toString());
			assignmentsPanel.add(new AssignmentVeiwer(assignment));
		}
		
		Dimension minSize = new Dimension(350, HomeworkOrganizer.assignments.size() * 100);
        assignmentsPanel.setPreferredSize(minSize);
		
		for(Course course: HomeworkOrganizer.courseList){
			JLabel courseLabel = new JLabel();
			courseLabel.setText(course.toString());
			classesPanel.add(courseLabel);
		}
	}

}
