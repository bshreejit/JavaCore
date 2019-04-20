package com.shreejit.JDBC;

import java.sql.*;

/*Fetching Data from Table Part I*/

public class DemoSelectSingle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";
		String query = "Select name,email from jdbc where id=1";
		
		//Registering the driver
		Class.forName("com.mysql.jdbc.Driver");
		//Establising the connection
		Connection con = (Connection) DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		//Creating a statement
		Statement st = con.createStatement();
		//Executing the query
		ResultSet rs = st.executeQuery(query);
		//Fetching the data
		rs.next();
		String name=rs.getString("name");
		String email=rs.getString("email"); 
		System.out.println(name);
		System.out.println(email);
		st.close();
		con.close();
	}

}
