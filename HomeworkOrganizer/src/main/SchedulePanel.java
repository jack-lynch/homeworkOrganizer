package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class SchedulePanel extends JPanel {
	
	
	public SchedulePanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeriod = new JLabel("Period");
		add(lblPeriod, BorderLayout.WEST);
	}
	
	
	

}
