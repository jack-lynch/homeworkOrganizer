package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class HomeworkOrganizer extends JFrame {

	private JPanel contentPane;
	protected HashMap<Integer, String> courseList = new HashMap<Integer, String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeworkOrganizer frame = new HomeworkOrganizer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeworkOrganizer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setTitle("Homework Organizer");
		setContentPane(contentPane);
		
		
		// Creates the hash map for corresponding period numbers and course names

		
		
		
		// Creates the tabbed panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		MainPanel mainMenuPanel = new MainPanel();
		tabbedPane.addTab("Main Menu", null, mainMenuPanel, "Main Menu");
		
		AssignmentPanel assignmentsPanel = new AssignmentPanel();
		tabbedPane.addTab("Assignments", null, assignmentsPanel, null);
		
		SchedulePanel schedulePanel = new SchedulePanel();
		tabbedPane.addTab("Add Course", null, schedulePanel, null);
	}

}
