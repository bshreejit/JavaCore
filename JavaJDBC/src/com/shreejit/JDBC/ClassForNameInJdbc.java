package com.shreejit.JDBC;
import java.sql.DriverManager;

public class ClassForNameInJdbc{
	
		public static void main(String[] args) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");
			/*Is same as below statement I because the Driver class has the 
			  same statement I in its static method*/
			
			
			//Statement I
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		}

}
 