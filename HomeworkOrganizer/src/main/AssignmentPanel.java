package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.TextArea;

public class AssignmentPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	TextArea assignmentsList;
	
	public AssignmentPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblFutureAssignments = new JLabel("Future Assignments");
		lblFutureAssignments.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFutureAssignments, BorderLayout.NORTH);
		
		assignmentsList = new TextArea();
		assignmentsList.setEditable(false);
		add(assignmentsList, BorderLayout.CENTER);
		
		updatePanel();
	}
	
	public void updatePanel() {
		
		String list = new String("");
		int i = 0;
		
		while (i < HomeworkOrganizer.assignments.size()) {
			
			Assignment assignment = HomeworkOrganizer.assignments.get(i);
			System.out.println(assignment.toString());
			list = list + assignment.toString() + "\n";
			
			i++;
		}
		System.out.println(list);
		assignmentsList.setText(list);

	}
	
}
