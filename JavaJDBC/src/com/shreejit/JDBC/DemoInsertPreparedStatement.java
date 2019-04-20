package com.shreejit.JDBC;

import java.sql.*;

//Use of PreparedStatenent

public class DemoInsertPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";

		String query = "insert into jdbc(name,email) values (?,?)";
		// Instead of adding values add ?
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		PreparedStatement ps = con.prepareStatement(query);
		
		// Now to add values we use setString(),setInt(),etc.
		ps.setString(1, "Shammy");
		ps.setString(2, "shammy@gmail.com");
		
		/*ps.setString(parameterIndex, x);
		 * here, parameterIndex = position of question mark
		 * 		 x = value
		 */
		int count = ps.executeUpdate();
		System.out.println(count + " Row's Affected");
		ps.close();
		con.close();
	}

}
