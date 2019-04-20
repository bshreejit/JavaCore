package com.shreejit.sim.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shreejit.sim.dto.StudentDto;
import com.shreejit.sim.util.DbUtil;

public class StudentDao {
	PreparedStatement ps = null;

	// To i/p data received from the application form into the database
	public int saveStudentInfo(StudentDto studentDto) {

		String sql = "insert into studentmanagementswing(name,emailId,department,courses,gender,dob,imageUrl,description)values(?,?,?,?,?,?,?,?)";
		int saved = 0;
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, studentDto.getName());
			ps.setString(2, studentDto.getEmailId());
			ps.setString(3, studentDto.getDepartment());
			ps.setString(4, studentDto.getCourses());
			ps.setString(5, studentDto.getGender());
			ps.setDate(6, new Date(studentDto.getDob().getTime()));
			ps.setString(7, studentDto.getImageUrl());
			ps.setString(8, studentDto.getDescription());
			saved = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return saved;
	}

	// To display the data in the Student Details View from the database
	public List<StudentDto> getAllStudentInfo() {
		List<StudentDto> studentList = new ArrayList<>();
		String sql = "select * from studentmanagementswing";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentDto studentDto = new StudentDto();
				studentDto.setId(rs.getInt("id"));
				studentDto.setName(rs.getString("name"));
				studentDto.setEmailId(rs.getString("emailId"));
				studentDto.setDepartment(rs.getString("department"));
				studentDto.setCourses(rs.getString("courses"));
				studentDto.setGender(rs.getString("gender"));
				studentDto.setDob(rs.getDate("dob"));
				studentDto.setDescription(rs.getString("imageUrl"));
				studentDto.setDescription(rs.getString("description"));
				studentList.add(studentDto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	// Searching
	public List<StudentDto> searchStudentInfo(String name) {
		List<StudentDto> studentList = new ArrayList<>();
		String sql = "select * from studentmanagementswing where name=?";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentDto studentDto = new StudentDto();
				studentDto.setId(rs.getInt("id"));
				studentDto.setName(rs.getString("name"));
				studentDto.setEmailId(rs.getString("emailId"));
				studentDto.setDepartment(rs.getString("department"));
				studentDto.setCourses(rs.getString("courses"));
				studentDto.setGender(rs.getString("gender"));
				studentDto.setDob(rs.getDate("dob"));
				studentDto.setDescription(rs.getString("imageUrl"));
				studentDto.setDescription(rs.getString("description"));
				studentList.add(studentDto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	public void deleteStudentInfo(int id) {
		String sql = "delete from studentManagementswing where id=?";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
