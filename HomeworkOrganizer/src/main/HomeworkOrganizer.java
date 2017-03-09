package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class HomeworkOrganizer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static ArrayList<Course> courseList = new ArrayList<Course>();
	public static ArrayList<Assignment> assignments = new ArrayList<Assignment>();

	public static AddAssignmentPanel addAssignmentPanel;
	public static CalendarPanel calendarPanel;
	
	public static MainPanel mainMenuPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeworkOrganizer frame = new HomeworkOrganizer();
					frame.setVisible(true);
//					Image ico = new Image("logo.jpg");
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
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Creates the tabbed panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		mainMenuPanel = new MainPanel();
		mainMenuPanel.setBackground(UIManager.getColor("Button.disabledText"));
		tabbedPane.addTab("Main Menu", null, mainMenuPanel, "Main Menu");
		
		AssignmentPanel assignmentsPanel = new AssignmentPanel();
		
		AddCoursePanel schedulePanel = new AddCoursePanel();
		tabbedPane.addTab("Add Course", null, schedulePanel, null);
		
		addAssignmentPanel = new AddAssignmentPanel();
		tabbedPane.addTab("Add Assignment", null, addAssignmentPanel, null);
		
		calendarPanel = new CalendarPanel();
		tabbedPane.addTab("Calendar", null, calendarPanel, null);
		
		tabbedPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addAssignmentPanel.setDropdown();
				mainMenuPanel.refreshData();
				assignmentsPanel.updatePanel();
				calendarPanel.refreshDate();
				
			}
		});
		 
		
		
	}
	

}
