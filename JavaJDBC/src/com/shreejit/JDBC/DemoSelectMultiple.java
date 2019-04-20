package com.shreejit.JDBC;

import java.sql.*;

/*Fetching Data from Table Part II*/

public class DemoSelectMultiple {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";
		String query = "Select * from jdbc";//Data Descriptive Language(DDL)

		// Registering the driver
		Class.forName("com.mysql.jdbc.Driver");
		// Establising the connection
		Connection con = (Connection) DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		// Creating a statement
		Statement st = con.createStatement();
		// Executing the query
		ResultSet rs = st.executeQuery(query);
		// Fetching the data
		/*while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			System.out.println(id + "\t" + name);
		};*/
		while (rs.next()) {
			String userData = rs.getInt("id")+ " : "+ rs.getString("name")+" : "+ rs.getString("email");
			System.out.println(userData);
		};
		st.close();
		con.close();
	}

}