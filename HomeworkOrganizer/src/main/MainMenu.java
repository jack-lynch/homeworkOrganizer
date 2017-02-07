package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setResizable(false);
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel mainMenuPanel= new JPanel();
		
		JPanel mainCoursesPanel = new JPanel();
		mainMenuPanel.add(mainCoursesPanel);
		mainCoursesPanel.setLayout(new BoxLayout(mainCoursesPanel, BoxLayout.Y_AXIS));
		
		JPanel coursesPanel = new JPanel();
		mainMenuPanel.add(coursesPanel);
		coursesPanel.setLayout(new BoxLayout(coursesPanel, BoxLayout.Y_AXIS));
		
		JLabel lblCourses = new JLabel("Courses");
		mainMenuPanel.add(lblCourses);
		
		JPanel mainToDoPanel = new JPanel();
		mainMenuPanel.add(mainToDoPanel);
		mainToDoPanel.setLayout(new BoxLayout(mainToDoPanel, BoxLayout.Y_AXIS));
		
		JPanel ToDoPanel = new JPanel();
		mainMenuPanel.add(ToDoPanel);
		ToDoPanel.setLayout(new BoxLayout(ToDoPanel, BoxLayout.Y_AXIS));
		
		JLabel lblTodo = new JLabel("To-Do");
		mainMenuPanel.add(lblTodo);
		
		tabbedPane.addTab("Main Menu", null, mainMenuPanel, "Main Menu");
		
		JPanel assignmentsPanel = new JPanel();
		tabbedPane.addTab("Assignments", null, assignmentsPanel, null);
	}

}
