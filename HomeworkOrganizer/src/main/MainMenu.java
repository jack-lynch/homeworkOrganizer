package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtCourses;
	private JTextField txtTodo;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel mainCoursesPanel = new JPanel();
		contentPane.add(mainCoursesPanel, BorderLayout.WEST);
		mainCoursesPanel.setLayout(new BoxLayout(mainCoursesPanel, BoxLayout.Y_AXIS));
		
		txtCourses = new JTextField();
		txtCourses.setText("Courses");
		mainCoursesPanel.add(txtCourses);
		txtCourses.setColumns(10);
		
		JPanel coursesPanel = new JPanel();
		mainCoursesPanel.add(coursesPanel);
		coursesPanel.setLayout(new BoxLayout(coursesPanel, BoxLayout.Y_AXIS));
		
		JPanel mainToDoPanel = new JPanel();
		contentPane.add(mainToDoPanel, BorderLayout.EAST);
		mainToDoPanel.setLayout(new BoxLayout(mainToDoPanel, BoxLayout.Y_AXIS));
		
		txtTodo = new JTextField();
		txtTodo.setText("To-Do");
		mainToDoPanel.add(txtTodo);
		txtTodo.setColumns(10);
		
		JPanel ToDoPanel = new JPanel();
		mainToDoPanel.add(ToDoPanel);
		ToDoPanel.setLayout(new BoxLayout(ToDoPanel, BoxLayout.Y_AXIS));
	}

}
