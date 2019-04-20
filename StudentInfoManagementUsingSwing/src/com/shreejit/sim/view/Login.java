package com.shreejit.sim.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private JFrame frmLogin;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel lblUsernameemail;
	private JLabel lblPassword;
	private JButton btnForget;
	private JButton btnSignUp;
	private JButton btnLogin;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setForeground(Color.MAGENTA);
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 415, 440);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sucessfully Logged In");
			}
		});
		btnLogin.setBackground(Color.CYAN);
		btnLogin.setBounds(151, 182, 89, 45);
		frmLogin.getContentPane().add(btnLogin);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(Color.CYAN);
		btnSignUp.setBounds(151, 283, 89, 45);
		frmLogin.getContentPane().add(btnSignUp);
		
		usernameField = new JTextField();
		usernameField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameField.setBackground(Color.CYAN);
		usernameField.setBounds(47, 73, 298, 33);
		frmLogin.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setBackground(Color.CYAN);
		passwordField.setBounds(47, 142, 298, 32);
		frmLogin.getContentPane().add(passwordField);
		
		lblUsernameemail = new JLabel("Username/Email");
		lblUsernameemail.setBounds(47, 49, 216, 14);
		frmLogin.getContentPane().add(lblUsernameemail);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(47, 117, 216, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		btnForget = new JButton("Forgot Password?");
		btnForget.setBackground(Color.CYAN);
		btnForget.setBounds(87, 229, 229, 23);
		frmLogin.getContentPane().add(btnForget);
		
		JLabel lblDontHaveAn = new JLabel("Dont have an account?");
		lblDontHaveAn.setBounds(142, 328, 136, 14);
		frmLogin.getContentPane().add(lblDontHaveAn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
