package main;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class AssignmentPanel extends JPanel {
	
	public AssignmentPanel() {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < HomeworkOrganizer.assignments.size(); i++){
			sb.append(HomeworkOrganizer.assignments.get(i));
			sb.append("/n");
		}
		JLabel lblLabel = new JLabel();
		add(lblLabel);
	}

	
}
