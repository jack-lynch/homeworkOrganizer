package Tester;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.AssignmentVeiwer;
import main.Course;
import main.Test;

public class veiwer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					veiwer frame = new veiwer();
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
	public veiwer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		 
		Course c = new Course(1, "Math");
		
		Test t = new Test(c, "ch 2", 2, 2, 2017, 3);
		AssignmentVeiwer panel = new AssignmentVeiwer(t);
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
