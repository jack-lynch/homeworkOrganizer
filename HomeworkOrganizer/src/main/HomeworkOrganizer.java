package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeworkOrganizer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ArrayList<Course> courseList = new ArrayList<Course>();
	public static ArrayList<Assignment> assignments = new ArrayList<Assignment>();

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
		setContentPane(contentPane);
		
		// Creates the tabbed panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		MainPanel mainMenuPanel = new MainPanel();
		tabbedPane.addTab("Main Menu", null, mainMenuPanel, "Main Menu");
		
		AssignmentPanel assignmentsPanel = new AssignmentPanel();
		tabbedPane.addTab("Assignments", null, assignmentsPanel, null);
		
		AddCoursePanel schedulePanel = new AddCoursePanel();
		tabbedPane.addTab("Add Course", null, schedulePanel, null);
		
		AddAssignmentPanel addAssignmentPanel = new AddAssignmentPanel();
		tabbedPane.addTab("Add Assignment", null, addAssignmentPanel, null);
		tabbedPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addAssignmentPanel.setDropdown();
				mainMenuPanel.refreshData();
			}
		});
	}

}
