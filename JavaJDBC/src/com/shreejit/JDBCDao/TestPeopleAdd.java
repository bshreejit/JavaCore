package com.shreejit.JDBCDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestPeopleAdd {
	public static void main(String[] args) throws Exception {
		PeopleDaoAdd p = new PeopleDaoAdd();
		People people = p.getPeople(7);// Get name for id 7
		System.out.println(people.name);
	}
}

//DAO Layer
class PeopleDaoAdd {
	public People getPeople(int id) throws Exception {
		People p = new People();
		p.id = id;

		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";
		String query = "select name from jdbc where id="+ id ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			p.name=name;
			return p;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

//DTO Layer
class PeopleAdd {
	int id;
	String name;
	String email;
}
