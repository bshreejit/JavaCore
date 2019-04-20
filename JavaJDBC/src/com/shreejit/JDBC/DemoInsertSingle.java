package com.shreejit.JDBC;

import java.sql.*;

//Inserting a single row
public class DemoInsertSingle {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";

		/*
		 * String query =
		 * "insert into jdbc(name,email) values (\"Ram\",\"rame@gmail.com\")";
		 */
		String query = "insert into jdbc(name,email) values (\"Haris\",\"hari@gmail.com\")";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);// Data Manipulation Language(DML)
		// executeUpdate() returns integer value : returns how many times the table is updated
		System.out.println(count + " Row's Affected");
		st.close();
		con.close();
	}
}
