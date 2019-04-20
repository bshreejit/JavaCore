package com.shreejit.sim.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 595, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 589, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnOpen = new JMenu("Open");
		menuBar.add(mnOpen);
		
		JMenuItem mntmNotepad = new JMenuItem("Notepad");
		mnOpen.add(mntmNotepad);
		
		JMenuItem mntmEclipse = new JMenuItem("Eclipse");
		mnOpen.add(mntmEclipse);
		
		JMenuItem mntmPubg = new JMenuItem("Pubg");
		mnOpen.add(mntmPubg);
		
		JMenuItem mntmMspaint = new JMenuItem("MS-Paint");
		mnOpen.add(mntmMspaint);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mnOpen.add(mntmCalculator);
		
		JMenu mnLogin = new JMenu("Login");
		menuBar.add(mnLogin);
		
		JMenu mnSignUp = new JMenu("Sign Up");
		menuBar.add(mnSignUp);
	}
}
