package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class AssignmentVeiwer extends JPanel {

	/**
	 * Create the panel.
	 */
	public AssignmentVeiwer(Assignment a) {
		setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setLayout(new BorderLayout(0, 0));
		
		Dimension minSize = new Dimension(350, 100);
        Dimension maxSize = new Dimension(600, 100);
        setMinimumSize(minSize);
        setMaximumSize(maxSize);
        
		JLabel lblAssingmentname = new JLabel("Title: " + a.getTitle());
		add(lblAssingmentname, BorderLayout.NORTH);
		
		//Will delete a comment...
		JButton btnNewButton = new JButton("Done");
		add(btnNewButton, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblClass = new JLabel("Course: " + a.getCourseName() + ", \t \t Time: " + Integer.toString(a.getClassPeriod()));
		lblClass.setBounds(6, 6, 359, 16);
		panel.add(lblClass);
		
		
		JLabel lblType = new JLabel("Type: " + a.getType()  + ", \t \t Priority: " +Integer.toString(a.getPriority()));
		lblType.setBounds(6, 34, 359, 22);
		panel.add(lblType);
		
		/*JLabel lblTime = new JLabel();
		lblTime.setBounds(160, 6, 95, 16);
		panel.add(lblTime);
		
		JLabel lblPriority = new JLabel();
		lblPriority.setBounds(160, 34, 61, 22);
		panel.add(lblPriority);*/
		
		JLabel lblDate = new JLabel("Due: " +a.printDueDate());
		lblDate.setBounds(6, 67, 215, 16);
		panel.add(lblDate);

	}
}
