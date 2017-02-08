package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddCoursePanel extends JPanel {
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

	public AddCoursePanel() {

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
				if (periodTextField.getText() == "" && courseNameTextField.getText() == ""
						&& percentageTextField.getText() == "") {
					coursePeriod = Integer.parseInt(periodTextField.getText());
					courseName = courseNameTextField.getText();
					coursePercentage = Integer.parseInt(percentageTextField.getText());

					Course course = new Course(coursePeriod, courseName, coursePercentage);

					HomeworkOrganizer.courseList.add(course);

					periodTextField.setText("");;
					courseNameTextField.setText("");
					percentageTextField.setText("");

					for (int i = 0; i < HomeworkOrganizer.courseList.size(); i++) {
						System.out.println(HomeworkOrganizer.courseList.get(i).getPeriod());
						System.out.println(HomeworkOrganizer.courseList.get(i).getName());
						System.out.println(HomeworkOrganizer.courseList.get(i).getGrade());
					}

				} else {
					JFrame frame = new JFrame("JOptionPane showMessageDialog example");
					JOptionPane.showMessageDialog(frame, "Please make sure all the fields are filled out!");
				}

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
