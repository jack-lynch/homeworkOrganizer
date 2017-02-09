package main;

<<<<<<< HEAD
=======
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Collections;
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddAssignmentPanel extends JPanel {
	
	private JTextField txtAssignmentLabel;
	private JTextField txtPriority;
	private JTextField txtDayDue;
	private JTextField txtMonthDue;
	private JTextField txtYearDue;
	private JComboBox<Course> classesDropdown;
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
		dayDropdown.setModel(new DefaultComboBoxModel<Integer>(new Integer[] 
					{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 ,20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 , 31}));
		//txtDayDue.setColumns(10);
		
		
		JComboBox<Integer> yearDropdown = new JComboBox<Integer>();
		yearDropdown.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {2017, 2018}));
		//txtYearDue.setColumns(10);
		
		
		ArrayList<String> classes = new ArrayList<String>();
		for (int i = 0; i < HomeworkOrganizer.courseList.size(); i++) {
		}
		JComboBox<String> classDropdown = new JComboBox<String>();
		classDropdown.setModel(new DefaultComboBoxModel<String>());
		
		
		JButton btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(typeDropdown.getSelectedIndex()){
					case 0:
						Homework newHomework = new Homework((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newHomework);
						System.out.println(newHomework);
						invalidate();
						break;
					case 1:
						Test newTest = new Test((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newTest);
						System.out.println(newTest);
						break;
					case 2:
						Study newStudy = new Study((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(), 
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newStudy);
						System.out.println(newStudy);
						invalidate();
						break;
					case 3:
						Classwork newClassWork = new Classwork((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getComponentCount(),
								yearDropdown.getComponentCount());
						HomeworkOrganizer.assignments.add(newClassWork);
						System.out.println(newClassWork);
						invalidate();
						break;
					
				}
				Collections.sort(HomeworkOrganizer.assignments);
			}
		});
		
		JLabel lblPriorityLevelOf = new JLabel("Priority of Assignment");
		
		JLabel lblMonth = new JLabel("Month");
		
		JLabel lblDay = new JLabel("Day");
		
		JLabel lblYear = new JLabel("Year");
		
<<<<<<< HEAD
		JLabel lblClass = new JLabel("Class");
		

=======
		JLabel classLbl = new JLabel("Course");
		
		classesDropdown = new JComboBox<Course>();
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
<<<<<<< HEAD
=======
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(15)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblTypeOfWork)
										.addComponent(lblPriorityLevelOf)
										.addComponent(btnAddAssignment)
										.addComponent(classLbl, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(lblAssignmentName)))
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(priorityDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAssignmentLabel, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addComponent(typeDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
<<<<<<< HEAD
=======
								.addComponent(lblYear)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblMonth)
										.addComponent(lblDay))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(dayDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(monthDropdown, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(9)
											.addComponent(classesDropdown, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))))
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
								.addGroup(groupLayout.createSequentialGroup()
<<<<<<< HEAD
									.addGap(15)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTypeOfWork)
										.addComponent(lblPriorityLevelOf)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(yearDropdown, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblYear, Alignment.LEADING)
											.addComponent(dayDropdown, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblDay, Alignment.LEADING)
											.addComponent(monthDropdown, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblMonth, Alignment.LEADING))
										.addComponent(lblClass)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(lblAssignmentName)))
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(priorityDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAssignmentLabel, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(classDropdown, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(typeDropdown, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAddAssignment)))
					.addContainerGap(23, Short.MAX_VALUE))
=======
									.addGap(6)
									.addComponent(yearDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addGap(23))
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
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
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
<<<<<<< HEAD
						.addComponent(lblClass)
						.addComponent(classDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(lblMonth)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(monthDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDay)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dayDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
=======
						.addComponent(classLbl)
						.addComponent(classesDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMonth)
						.addComponent(monthDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDay)
						.addComponent(dayDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
					.addComponent(lblYear)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(yearDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
					.addGap(18)
					.addComponent(btnAddAssignment)
					.addGap(51))
=======
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnAddAssignment))
>>>>>>> branch 'master' of https://github.com/jack-lynch/homeworkOrganizer.git
		);
		setLayout(groupLayout);
	}
	
	public void setDropdown() {
		classesDropdown.removeAllItems();
		for(Course course: HomeworkOrganizer.courseList){
			classesDropdown.addItem(course);
		}
	}
}
