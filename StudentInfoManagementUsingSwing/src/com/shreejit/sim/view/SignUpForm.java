package com.shreejit.sim.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpForm extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private JFrame frmSignUp;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnSignUp;
	private JLabel lblName;
	private JLabel lblPassword;
	private JLabel lblReenterPassword;
	private JLabel lblUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm window = new SignUpForm();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUpForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setTitle("Sign Up");
		frmSignUp.setBounds(100, 100, 415, 440);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		
		lblName = new JLabel("Name");
		lblName.setBounds(22, 38, 92, 24);
		frmSignUp.getContentPane().add(lblName);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(22, 85, 92, 24);
		frmSignUp.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 134, 92, 24);
		frmSignUp.getContentPane().add(lblPassword);
		
		lblReenterPassword = new JLabel("Re-Enter Password");
		lblReenterPassword.setBounds(22, 179, 92, 24);
		frmSignUp.getContentPane().add(lblReenterPassword);
		
		textField = new JTextField();
		textField.setBounds(122, 40, 202, 20);
		frmSignUp.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 85, 202, 22);
		frmSignUp.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 134, 200, 22);
		frmSignUp.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(124, 181, 200, 22);
		frmSignUp.getContentPane().add(passwordField_1);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sign Up Successful");
			}
		});
		btnSignUp.setBounds(214, 230, 110, 33);
		frmSignUp.getContentPane().add(btnSignUp);
	}

}
