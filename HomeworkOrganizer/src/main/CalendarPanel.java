package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class CalendarPanel extends JPanel {

	AssignmentCalendar cal;
	
	/**
	 * Create the panel.
	 */
	public CalendarPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblFebruary = new JLabel("February");
		lblFebruary.setBackground(Color.RED);
		lblFebruary.setHorizontalAlignment(SwingConstants.CENTER);
		lblFebruary.setFont(new Font("Serif", Font.BOLD, 30));
		add(lblFebruary, BorderLayout.NORTH);
		
		cal = new AssignmentCalendar();
		add(cal, BorderLayout.CENTER);

	}
	
	public void refreshDate(){
		cal.refreshDate();
	}

}
