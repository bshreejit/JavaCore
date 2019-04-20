package com.shreejit.sim.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.shreejit.sim.dao.StudentDao;
import com.shreejit.sim.dto.StudentDto;

public class StudentDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frmStudentDetails;
	private JTable studentTable;
	private JScrollPane scrollPane;
	StudentDao studentDao = new StudentDao();
	private JTextField searchTextField;
	private JButton newBtn;
	private JButton editBtn;
	private JButton deleteBtn;
	private JButton searchBtn;

	/**
	 * Create the application.
	 */
	public StudentDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDetails = new JFrame();
		frmStudentDetails.setResizable(false);
		frmStudentDetails.setTitle("Student Details");
		frmStudentDetails.setBounds(100, 100, 700, 410);
		frmStudentDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDetails.getContentPane().setLayout(null);

		// Table Creation
		studentTable = new JTable();
		String[] columnNames = { "Id", "Name", "EmailID", "Department", "Courses", "Gender", "DOB", "ImageUrl",
				"Description" };
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		studentTable.setModel(tableModel);

		scrollPane = new JScrollPane(studentTable);
		scrollPane.setBounds(0, 41, 694, 294);
		frmStudentDetails.getContentPane().add(scrollPane);

		loadDataInTable();

		newBtn = new JButton("New");
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Disposes the opened StudentDetails Frame
				StudentDetails.this.dispose();
				new ApplicationForm().setVisible(true);
			}
		});
		newBtn.setBackground(Color.GRAY);
		newBtn.setBounds(54, 344, 105, 26);
		frmStudentDetails.getContentPane().add(newBtn);

		
		editBtn = new JButton("Edit");
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		editBtn.setBackground(Color.GRAY);
		editBtn.setBounds(289, 345, 105, 25);
		frmStudentDetails.getContentPane().add(editBtn);

		
		deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();
				int row = studentTable.getSelectedRow();
				Object ids = tableModel.getValueAt(row, 0);
				int yn= JOptionPane.showConfirmDialog(StudentDetails.this, "Are you sure you want to delete it?",
						"Delete!!!",JOptionPane.YES_NO_OPTION);
				if(yn == 0) {
					studentDao.deleteStudentInfo(Integer.parseInt(ids.toString()));
					loadDataInTable();
				}else {
					loadDataInTable();
				}
				}
		});
		deleteBtn.setBackground(Color.GRAY);
		deleteBtn.setBounds(512, 345, 105, 25);
		frmStudentDetails.getContentPane().add(deleteBtn);

		searchTextField = new JTextField();
		searchTextField.setBounds(376, 11, 196, 19);
		frmStudentDetails.getContentPane().add(searchTextField);
		searchTextField.setColumns(10);

		// Search button
		searchBtn = new JButton("Search");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchTextField.getText();
				if (name == null || name.isEmpty()) {
					loadDataInTable();
				} else {
					searchInTable(name);
				}
			}
		});
		searchBtn.setBackground(Color.GRAY);
		searchBtn.setBounds(582, 10, 89, 23);
		frmStudentDetails.getContentPane().add(searchBtn);

	}

	// Loading the data in the table
	public void loadDataInTable() {
		DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();
		tableModel.setRowCount(0);
		List<StudentDto> studentList = studentDao.getAllStudentInfo();
		// Object[] rowData=new Object[] {};
		for (StudentDto studentDto : studentList) {
			// tableModel.addRow(rowData);
			tableModel.addRow(new Object[] { studentDto.getId(), studentDto.getName(), studentDto.getEmailId(),
					studentDto.getDepartment(), studentDto.getCourses(), studentDto.getGender(), studentDto.getDob(),
					studentDto.getImageUrl(), studentDto.getDescription() });
		}

	}

	// Searching the data in the table
	public void searchInTable(String name) {
		DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();
		tableModel.setRowCount(0);
		List<StudentDto> studentList = studentDao.searchStudentInfo(name);
		// Object[] rowData=new Object[] {};
		for (StudentDto studentDto : studentList) {
			// tableModel.addRow(rowData);
			tableModel.addRow(new Object[] { studentDto.getId(), studentDto.getName(), studentDto.getEmailId(),
					studentDto.getDepartment(), studentDto.getCourses(), studentDto.getGender(), studentDto.getDob(),
					studentDto.getImageUrl(), studentDto.getDescription() });
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails window = new StudentDetails();
					window.frmStudentDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
