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
		setDropdown();
		
		txtPriority = new JTextField();
		txtPriority.setText("Priority");
		add(txtPriority);
		txtPriority.setColumns(10);
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		JComboBox<String> monthDropdown = new JComboBox<String>();
		monthDropdown.setModel(new DefaultComboBoxModel<String>(months));
		//txtMonthDue = new JTextField();
		//txtMonthDue.setText("Month Due");
		add(monthDropdown);
		//txtMonthDue.setColumns(10);
				
		JComboBox<Integer> dayDropdown = new JComboBox<Integer>();
		dayDropdown.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 , 31}));
		
		//txtDayDue = new JTextField();
		//txtDayDue.setText("Day Due");
		add(dayDropdown);
		//txtDayDue.setColumns(10);
		
		
		JComboBox<Integer> yearDropdown = new JComboBox<Integer>();
		yearDropdown.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2017, 2018}));
		//txtYearDue = new JTextField();
		//txtYearDue.setText("Year Due");
		add(yearDropdown);
		//txtYearDue.setColumns(10);
		
		
		JButton btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(typeDropdown.getSelectedIndex()){
					case 0:
						Homework newHomework = new Homework((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex(), 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newHomework);
						break;
					case 1:
						Test newTest = new Test((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex(), 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newTest);
						break;
					case 2:
						Study newStudy = new Study((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex(), 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newStudy);
						break;
					case 3:
						Classwork newClassWork = new Classwork((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex(), 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newClassWork);
						break;
					
					
				}
			}
		});
		add(btnAddAssignment);
	}
	public void setDropdown() {
		for(Course course: HomeworkOrganizer.courseList){
			classesDropdown.addItem(course);
		}
	}

}