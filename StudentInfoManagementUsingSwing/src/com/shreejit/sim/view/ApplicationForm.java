package com.shreejit.sim.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.shreejit.sim.dao.StudentDao;
import com.shreejit.sim.dto.StudentDto;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ApplicationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmApplicationForm;
	private JTextField nameTextField;
	private JButton btnSubmit;
	private JButton btnReset;
	private JLabel lblName;
	private JLabel lblEmailId;
	private JLabel lblDepartment;
	private JLabel lblGender;
	private JLabel lblCourses;
	private JLabel lblDescription;
	private JRadioButton maleRadioBtn;
	private JRadioButton femaleRadioBtn;
	private JCheckBox financeCheckBox;
	private JCheckBox itCheckBok;
	private JCheckBox accountCheckBox;
	private JCheckBox marketingCheckBox;
	private JTextArea descText;
	private JComboBox comboBox;
	private JLabel lblPhoto;
	private JTextField emailTextField;
	private JLabel lblDOB;
	private JDateChooser dateChooser;
	private ButtonGroup genderGroup;
	private JButton backBtn;

	/**
	 * Create the application.
	 */
	public ApplicationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApplicationForm = new JFrame();
		frmApplicationForm.setTitle("Application Form");
		frmApplicationForm.setResizable(false);
		frmApplicationForm.getContentPane().setForeground(Color.DARK_GRAY);
		frmApplicationForm.setBounds(100, 100, 415, 440);
		frmApplicationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 66, 29);
		frmApplicationForm.getContentPane().add(lblName);

		lblEmailId = new JLabel("Email ID");
		lblEmailId.setBounds(10, 51, 66, 29);
		frmApplicationForm.getContentPane().add(lblEmailId);

		lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 140, 66, 29);
		frmApplicationForm.getContentPane().add(lblGender);

		lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 180, 66, 29);
		frmApplicationForm.getContentPane().add(lblDepartment);

		lblCourses = new JLabel("Courses");
		lblCourses.setBounds(10, 208, 66, 29);
		frmApplicationForm.getContentPane().add(lblCourses);

		nameTextField = new JTextField();
		nameTextField.setBounds(92, 15, 214, 20);

		nameTextField.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);

		maleRadioBtn = new JRadioButton("Male");
		maleRadioBtn.setBounds(92, 143, 109, 23);
		maleRadioBtn.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(maleRadioBtn);

		femaleRadioBtn = new JRadioButton("Female");
		femaleRadioBtn.setBounds(197, 143, 109, 23);
		femaleRadioBtn.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(femaleRadioBtn);

		// To shift the gender chooser
		genderGroup = new ButtonGroup();
		genderGroup.add(maleRadioBtn);
		genderGroup.add(femaleRadioBtn);

		itCheckBok = new JCheckBox("IT");
		itCheckBok.setBounds(92, 211, 97, 23);
		itCheckBok.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(itCheckBok);

		marketingCheckBox = new JCheckBox("Marketing");
		marketingCheckBox.setBounds(197, 211, 97, 23);
		marketingCheckBox.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(marketingCheckBox);

		financeCheckBox = new JCheckBox("Finance");
		financeCheckBox.setBounds(92, 247, 97, 23);
		financeCheckBox.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(financeCheckBox);

		accountCheckBox = new JCheckBox("Account");
		accountCheckBox.setBounds(197, 247, 97, 23);
		accountCheckBox.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(accountCheckBox);

		lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 275, 66, 29);
		frmApplicationForm.getContentPane().add(lblDescription);

		descText = new JTextArea();
		descText.setBounds(92, 277, 214, 73);
		descText.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(descText);

		comboBox = new JComboBox();
		comboBox.setBounds(92, 184, 214, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"------Please Select-----", "Engineering", "Business & Accounting", "Arts", "Social Work"}));
		frmApplicationForm.getContentPane().add(comboBox);

		emailTextField = new JTextField();
		emailTextField.setBounds(92, 55, 214, 20);
		emailTextField.setColumns(10);
		emailTextField.setBackground(Color.CYAN);
		frmApplicationForm.getContentPane().add(emailTextField);

		lblDOB = new JLabel("DOB");
		lblDOB.setBounds(10, 100, 66, 29);
		frmApplicationForm.getContentPane().add(lblDOB);

		dateChooser = new JDateChooser();
		dateChooser.setBackground(Color.CYAN);
		dateChooser.setBounds(92, 100, 214, 29);
		frmApplicationForm.getContentPane().add(dateChooser);

		// For Uploading Photo
		lblPhoto = new JLabel("Upload Photo");
		lblPhoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser imageChooser = new JFileChooser();
				if (imageChooser.showOpenDialog(lblPhoto) == JFileChooser.APPROVE_OPTION) {
					ImageIcon icon = new ImageIcon(imageChooser.getSelectedFile().getPath());
					Image image = icon.getImage().getScaledInstance(130, 140, Image.SCALE_SMOOTH);
					icon = new ImageIcon(image);
					lblPhoto.setIcon(icon);
				}
			}
		});
		lblPhoto.setBounds(316, 11, 83, 83);
		lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmApplicationForm.getContentPane().add(lblPhoto);

		// Submit Button
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(30, 361, 89, 39);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Creating StudentDao's Object
				StudentDao studentDao = new StudentDao();
				
				// Creating StudentDto's Object.
				StudentDto studentDto = new StudentDto();
				studentDto.setName(nameTextField.getText());
				studentDto.setEmailId(emailTextField.getText());
				studentDto.setDob(dateChooser.getDate());
				//studentDto.setImageUrl(lblPhoto.);
				studentDto.setDescription(descText.getText());
				
				//Department
				studentDto.setDepartment((String)comboBox.getSelectedItem());
				
				//Courses
				String courses="";
				if(itCheckBok.isSelected()) {
					courses=courses+itCheckBok.getText()+"/";
				}if(marketingCheckBox.isSelected()) {
					courses=courses+marketingCheckBox.getText()+"/";
				}if(accountCheckBox.isSelected()) {
					courses=courses+accountCheckBox.getText()+"/";
				}if(financeCheckBox.isSelected()) {
					courses=courses+financeCheckBox.getText()+"/";
				}
				studentDto.setCourses(courses);
				
				//Gender		
				if(maleRadioBtn.isSelected()) {
					studentDto.setGender(maleRadioBtn.getText());
				}else {
					studentDto.setGender(femaleRadioBtn.getText());
				}
				
				
				
				// Calling saveStudentInfo() method in studentDao
				int saved = studentDao.saveStudentInfo(studentDto);
				if(saved>0) {
					JOptionPane.showMessageDialog(ApplicationForm.this,"Saved Successfully","Saved!",
							JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(ApplicationForm.this,"Unsuccessful","Not Saved!",
							JOptionPane.ERROR_MESSAGE);
				}
				dispose();
				new StudentDetails().setVisible(true);
			}
		});
		frmApplicationForm.getContentPane().setLayout(null);
		btnSubmit.setBackground(Color.DARK_GRAY);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSubmit.setForeground(Color.WHITE);
		frmApplicationForm.getContentPane().add(btnSubmit);

		// Reset Button
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nameTextField.setText("");
				emailTextField.setText("");
				descText.setText("");
				dateChooser.setDate(null);
				maleRadioBtn.setSelected(false);
				femaleRadioBtn.setSelected(false);
				comboBox.setSelectedItem("------Please Select----");
				itCheckBok.setSelected(false);
				marketingCheckBox.setSelected(false);
				financeCheckBox.setSelected(false);
				accountCheckBox.setSelected(false);				
			}
		});
		btnReset.setBounds(169, 361, 89, 39);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.DARK_GRAY);
		frmApplicationForm.getContentPane().add(btnReset);
		
		//Back Button
		backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new StudentDetails().setVisible(true);
			}
		});
		backBtn.setForeground(Color.WHITE);
		backBtn.setBackground(Color.DARK_GRAY);
		backBtn.setBounds(293, 361, 89, 39);
		frmApplicationForm.getContentPane().add(backBtn);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm window = new ApplicationForm();
					window.frmApplicationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
