package com.shreejit.sim.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
		private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
		//private static final String DATABASE_NAME = "studentmanagementswing";
		private static final String URL="jdbc:mysql://127.0.0.1:3307/studentmanagementswing"; 
		private static final String USER_NAME = "root";
		private static final String PASSWORD = "admin";
		
		
		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			Class.forName(DRIVER_NAME);
			return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		
	
}
