package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SchedulePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField periodTextField;
	private JTextField courseNameTextField;
	private JTextField percentageTextField;

	protected int coursePeriod;
	protected String courseName;
	protected double coursePercentage;

	protected HashMap<Integer, String> courseList = new HashMap<Integer, String>();

	public SchedulePanel() {

		JLabel lblPeriod = new JLabel("Period");

		JLabel lblCourseName = new JLabel("Course Name");

		JLabel lblGradePercentage = new JLabel("Grade Percentage");

		periodTextField = new JTextField();
		periodTextField.setToolTipText("(1, 2,3, ...)");
		periodTextField.setColumns(20);

		courseNameTextField = new JTextField();
		courseNameTextField.setToolTipText("(Math, English, Economics...)");
		courseNameTextField.setColumns(20);

		percentageTextField = new JTextField();
		percentageTextField.setToolTipText("(65.48, 84.93, 99.99, ...)");
		percentageTextField.setColumns(20);

		JButton btnAddCourse = new JButton("Add Course To Schedule");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Trying the period text field
				try {
					
					if (periodTextField != null && periodTextField.getText() != "") {
						coursePeriod = Integer.parseInt(periodTextField.getText());
					} else {
						
					}
					
				} catch (Exception c) {
					c.printStackTrace();
				}

				//Trying the course name text field
				try {
					
					if(courseNameTextField != null && courseNameTextField.getText() != "") {
						courseName = courseNameTextField.getText();
					} else {
						
					}
					
				} catch (Exception c) {
					c.printStackTrace();
				}

				//Trying the percetage text field
				try {
					if (percentageTextField != null && percentageTextField.getText() != null) {
						coursePercentage = Integer.parseInt(percentageTextField.getText());
					} else {
						
					}
					
				} catch (Exception c) {
					c.printStackTrace();
				}
				
				courseList.put(coursePeriod, courseName);
				System.out.println(courseList);
			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblGradePercentage)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(percentageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblPeriod, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCourseName))
												.addGap(45)
												.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
														.addComponent(courseNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(periodTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addComponent(btnAddCourse))
						.addContainerGap(65, Short.MAX_VALUE))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPeriod, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(periodTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCourseName)
								.addComponent(courseNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(19)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGradePercentage)
								.addComponent(percentageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(btnAddCourse)
						.addContainerGap(134, Short.MAX_VALUE))
				);
		setLayout(groupLayout);
	}
}
