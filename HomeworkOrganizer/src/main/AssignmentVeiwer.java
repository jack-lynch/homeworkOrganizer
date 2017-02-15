package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class AssignmentVeiwer extends JPanel {

	/**
	 * Create the panel.
	 */
	public AssignmentVeiwer(Assignment a) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel main = new JPanel();
		Dimension minSize = new Dimension(350, 120);
        Dimension maxSize = new Dimension(600, 120);
        setMinimumSize(minSize);
        setMaximumSize(maxSize);
        
		JLabel lblAssingmentname = new JLabel("Title: " + a.getTitle());
		add(lblAssingmentname, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblClass = new JLabel("Course: " + a.getCourseName() + " \t \t Time: " + Integer.toString(a.getClassPeriod()));
		lblClass.setBounds(6, 6, 359, 16);
		panel.add(lblClass);
		
		
		JLabel lblType = new JLabel("Type: " + a.getType()  + " \t \t Priority: " +Integer.toString(a.getPriority()));
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
				
				JToggleButton tglbtnDelete = new JToggleButton("Delete");
				add(tglbtnDelete, BorderLayout.EAST);
				
						tglbtnDelete.setPreferredSize(new Dimension(75, 75));
						tglbtnDelete.setMaximumSize(new Dimension(80, 80));
		tglbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setDelete(!a.isDelete());
				if(a.isDelete())
					tglbtnDelete.setText("Will Delete");
				else 
					tglbtnDelete.setText("Delete");
			}
		});

	}
}
