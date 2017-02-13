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
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));
		
		Dimension minSize = new Dimension(350, 100);
        Dimension maxSize = new Dimension(600, 100);
        setMinimumSize(minSize);
        setMaximumSize(maxSize);
        
		//setSize(350, 150);
		JLabel lblAssingmentname = new JLabel("Title: " + a.getTitle());
		add(lblAssingmentname, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblClass = new JLabel("Course: " + a.getCourseName());
		lblClass.setBounds(6, 6, 90, 16);
		panel.add(lblClass);
		
		
		JLabel lblType = new JLabel("type");
		lblType.setBounds(6, 34, 82, 22);
		panel.add(lblType);
		
		JLabel lblTime = new JLabel("Time: " + Integer.toString(a.getClassPeriod()));
		lblTime.setBounds(114, 6, 95, 16);
		panel.add(lblTime);
		
		JLabel lblPriority = new JLabel("Priority: " +Integer.toString(a.getPriority()));
		lblPriority.setBounds(114, 34, 61, 22);
		panel.add(lblPriority);
		
		JLabel lblDate = new JLabel("Due: " +a.printDueDate());
		lblDate.setBounds(6, 67, 150, 16);
		panel.add(lblDate);

	}
}
