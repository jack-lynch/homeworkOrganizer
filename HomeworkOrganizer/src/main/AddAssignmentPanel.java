package main;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AddAssignmentPanel extends JPanel {
	
	private JTextField txtAssignmentLabel;
	private JTextField txtPriority;
	private JTextField txtDayDue;
	private JTextField txtMonthDue;
	private JTextField txtYearDue;
	private JComboBox<Course> classesDropdown = new JComboBox<Course>();
	public AddAssignmentPanel() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		txtAssignmentLabel = new JTextField();
		txtAssignmentLabel.setText("Assignment Name");
		add(txtAssignmentLabel);
		txtAssignmentLabel.setColumns(10);
		
		
		JComboBox<String> typeDropdown = new JComboBox<String>();
		typeDropdown.setModel(new DefaultComboBoxModel<String>(new String[] {"Homework", "Test", "Study", "Classwork"}));
		
		add(classesDropdown);
		refreshDropdown();
		
		txtPriority = new JTextField();
		txtPriority.setText("Priority");
		add(txtPriority);
		txtPriority.setColumns(10);
		
		
		
		txtDayDue = new JTextField();
		txtDayDue.setText("Day Due");
		add(txtDayDue);
		txtDayDue.setColumns(10);
		
		txtMonthDue = new JTextField();
		txtMonthDue.setText("Month Due");
		add(txtMonthDue);
		txtMonthDue.setColumns(10);
		
		txtYearDue = new JTextField();
		txtYearDue.setText("Year Due");
		add(txtYearDue);
		txtYearDue.setColumns(10);
		
		
		JButton btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(typeDropdown.getSelectedIndex()){
					case 0:
						Homework newHomework = new Homework((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								Integer.parseInt(txtMonthDue.getText()), 
								Integer.parseInt(txtDayDue.getText()), 
								Integer.parseInt(txtYearDue.getText()));
						HomeworkOrganizer.assignments.add(newHomework);
						break;
					case 1:
						Test newTest = new Test((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								Integer.parseInt(txtMonthDue.getText()), 
								Integer.parseInt(txtDayDue.getText()), 
								Integer.parseInt(txtYearDue.getText()));
						HomeworkOrganizer.assignments.add(newTest);
						break;
					case 2:
						Study newStudy = new Study((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								Integer.parseInt(txtMonthDue.getText()), 
								Integer.parseInt(txtDayDue.getText()), 
								Integer.parseInt(txtYearDue.getText()));
						HomeworkOrganizer.assignments.add(newStudy);
						break;
					case 3:
						Classwork newClassWork = new Classwork((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								Integer.parseInt(txtMonthDue.getText()), 
								Integer.parseInt(txtDayDue.getText()), 
								Integer.parseInt(txtYearDue.getText()));
						HomeworkOrganizer.assignments.add(newClassWork);
						break;
					
					
				}
			}
		});
		add(btnAddAssignment);
	}
	public void refreshDropdown() {
		for(Course course: HomeworkOrganizer.courseList){
			classesDropdown.addItem(course);
		}
	}

}
