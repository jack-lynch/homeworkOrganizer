package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddAssignmentPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtAssignmentLabel;
	Course[] courses = new Course[HomeworkOrganizer.courseList.size()];
	
	public JComboBox<Course> classesDropdown = new JComboBox<Course>();
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


		courses = HomeworkOrganizer.courseList.toArray(courses);

		//JComboBox<Course> classesDropdown = new JComboBox<Course>();
		classesDropdown.setModel(new DefaultComboBoxModel<Course>(courses));
		System.out.println(courses.toString());



		JButton btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtAssignmentLabel.getText().equals("") && courses.length >= 0) {
					switch(typeDropdown.getSelectedIndex()){
					case 0:
						Homework newHomework = new Homework((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getSelectedIndex() + 1, //Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getSelectedIndex() + 1,
								(int) priorityDropdown.getSelectedItem());
						HomeworkOrganizer.assignments.add(newHomework);
						break;
					case 1:
						Test newTest = new Test((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getSelectedIndex() + 1, //Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getSelectedIndex() + 1,
								(int) priorityDropdown.getSelectedItem());
						HomeworkOrganizer.assignments.add(newTest);
						break;
					case 2:
						Study newStudy = new Study((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getSelectedIndex() + 1, //Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getSelectedIndex() + 1,
								(int) priorityDropdown.getSelectedItem());
						HomeworkOrganizer.assignments.add(newStudy);
						break;
					case 3:
						Classwork newClassWork = new Classwork((Course) classesDropdown.getSelectedItem(), 
								txtAssignmentLabel.getText(), 
								monthDropdown.getSelectedIndex() + 1, 
								dayDropdown.getSelectedIndex() + 1, //Integer.parseInt(txtDayDue.getText()), 
								yearDropdown.getSelectedIndex() + 1,
								(int) priorityDropdown.getSelectedItem());
						HomeworkOrganizer.assignments.add(newClassWork);
						break;						
					}
					
					JFrame frame = new JFrame("JOptionPane showMessageDialog example");
					JOptionPane.showMessageDialog(frame, txtAssignmentLabel.getText() + " has been added to your assignments!");
					
					txtAssignmentLabel.setText("");
					
				} else {
					JFrame frame = new JFrame("JOptionPane showMessageDialog example");
					JOptionPane.showMessageDialog(frame, "Please make sure all the fields are filled out!");
				}
			}
		});

		JLabel lblPriorityLevelOf = new JLabel("Priority of Assignment");

		JLabel lblMonth = new JLabel("Month");

		JLabel lblDay = new JLabel("Day");

		JLabel lblYear = new JLabel("Year");

		JLabel lblClass = new JLabel("Class");


		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
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
														.addComponent(classesDropdown, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(typeDropdown, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addGroup(groupLayout.createSequentialGroup()
										.addContainerGap()
										.addComponent(btnAddAssignment)))
						.addContainerGap(23, Short.MAX_VALUE))
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
								.addComponent(lblClass)
								.addComponent(classesDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
						.addGap(18)
						.addComponent(btnAddAssignment)
						.addGap(51))
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
