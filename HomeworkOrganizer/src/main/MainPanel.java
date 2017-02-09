package main;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private JPanel assignmentsPanel;
	public MainPanel() {
		
		
		JPanel classesPanel = new JPanel();
		add(classesPanel);
		classesPanel.setLayout(new BoxLayout(classesPanel, BoxLayout.Y_AXIS));
		
		assignmentsPanel = new JPanel();
		add(assignmentsPanel);
		
		
		refreshData();
	}

	public void refreshData() {
		assignmentsPanel.removeAll();
		
		for(Assignment assignment: HomeworkOrganizer.assignments){
			JLabel assignmentLabel = new JLabel();
			assignmentLabel.setText(assignment.toString());
			assignmentsPanel.add(assignmentLabel);
		}
		
		for(Course course: HomeworkOrganizer.courseList){
			JLabel courseLabel = new JLabel();
			courseLabel.setText(course.toString());
			assignmentsPanel.add(courseLabel);
		}
	}

}
