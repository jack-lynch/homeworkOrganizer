package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AssignmentPanel extends JPanel {
	public AssignmentPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblFutureAssignments = new JLabel("Future Assignments");
		lblFutureAssignments.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFutureAssignments, BorderLayout.NORTH);
		
		JLabel futureAssignmentsLbl = new JLabel("New label");
		futureAssignmentsLbl.setText("");
		add(futureAssignmentsLbl, BorderLayout.CENTER);
		

	}
	
}
