package main;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddAssignmentPanel extends JPanel {
	
	private JTextField txtAssignmentLabel;
	private JTextField txtPriority;
	private JTextField txtDayDue;
	private JTextField txtMonthDue;
	private JTextField txtYearDue;
	private JComboBox<Course> classesDropdown = new JComboBox<Course>();
	public AddAssignmentPanel() {
		
		JLabel lblAssignmentName = new JLabel("Assignment Name");
		
		txtAssignmentLabel = new JTextField();
		txtAssignmentLabel.setColumns(10);
		
		String[] typesOfWork = {"Homework", "Test", "Study", "Classwork"};
		
		JLabel lblTypeOfWork = new JLabel("Type of Work");
		JComboBox<String> typeDropdown = new JComboBox<String>();
		typeDropdown.setModel(new DefaultComboBoxModel<String>(typesOfWork));
		

		Integer[] prioritySettings = {1, 2, 3, 4, 5};
		JComboBox<Integer> priorityDropdown = new JComboBox<Integer>();
		priorityDropdown.setModel(new DefaultComboBoxModel<Integer>(prioritySettings));
		
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		JComboBox<String> monthDropdown = new JComboBox<String>();
		monthDropdown.setModel(new DefaultComboBoxModel<String>(months));
		//txtMonthDue.setColumns(10);
				
		JComboBox<Integer> dayDropdown = new JComboBox<Integer>();
		dayDropdown.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 , 31}));
		//txtDayDue.setColumns(10);
		
		
		JComboBox<Integer> yearDropdown = new JComboBox<Integer>();
		yearDropdown.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2017, 2018}));
		//txtYearDue.setColumns(10);
		
		
		JButton btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(typeDropdown.getSelectedIndex()){
					case 0:
						Homework newHomework = new Homework((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newHomework);
						break;
					case 1:
						Test newTest = new Test((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newTest);
						break;
					case 2:
						Study newStudy = new Study((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newStudy);
						break;
					case 3:
						Classwork newClassWork = new Classwork((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),//Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newClassWork);
						break;
					
					
				}
			}
		});
		
		JLabel lblPriorityLevelOf = new JLabel("Priority of Assignment");
		
		JLabel lblMonth = new JLabel("Month");
		
		JLabel lblDay = new JLabel("Day");
		
		JLabel lblYear = new JLabel("Year");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTypeOfWork)
								.addComponent(lblPriorityLevelOf)
								.addComponent(lblMonth)
								.addComponent(btnAddAssignment)
								.addComponent(lblDay)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(dayDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblYear)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addGap(6)
										.addComponent(yearDropdown, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addComponent(monthDropdown, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(lblAssignmentName)))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(priorityDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAssignmentLabel, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
						.addComponent(typeDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAssignmentName)
						.addComponent(txtAssignmentLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(typeDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTypeOfWork))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPriorityLevelOf)
						.addComponent(priorityDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMonth)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(monthDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDay)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dayDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblYear)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(yearDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(btnAddAssignment))
		);
		setLayout(groupLayout);
	}
	
	public void setDropdown() {
		for(Course course: HomeworkOrganizer.courseList){
			classesDropdown.addItem(course);
		}
	}

}
