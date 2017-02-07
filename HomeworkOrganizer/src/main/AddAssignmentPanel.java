package main;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class AddAssignmentPanel extends JPanel {
	private JTextField txtAssignmentLabel;
	private JTextField txtPriority;
	public AddAssignmentPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		txtAssignmentLabel = new JTextField();
		txtAssignmentLabel.setText("Assignment Name");
		add(txtAssignmentLabel);
		txtAssignmentLabel.setColumns(10);
		
		JComboBox classesDropdown = new JComboBox();
		add(classesDropdown);
	//	for(int i = 0; i < )
		
		txtPriority = new JTextField();
		txtPriority.setText("Priority");
		add(txtPriority);
		txtPriority.setColumns(10);
		
		JButton btnAddClass = new JButton("Add Class");
		add(btnAddClass);
	}

}
