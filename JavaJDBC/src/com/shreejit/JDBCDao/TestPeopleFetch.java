package com.shreejit.JDBCDao;

import java.sql.*;

public class TestPeopleFetch {
	public static void main(String[] args) throws Exception {
		PeopleDao dao = new PeopleDao();

		/*
		 * //For Fetching the data 
		 * People people = p.getPeople(7);// Get name for id 7
		 * System.out.println(people.name);
		 */

		// For Adding the data
		People people = new People();
		people.name = "Aurther";
		people.email="hark@gmail.com";
		dao.Connect();
		dao.addPeople(people);
	}
}



// DAO Layer
class PeopleDao {
	Connection con=null;
	public void Connect() throws Exception {
		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public People getPeople(int id) throws Exception {
		People p = new People();
		p.id = id;

		String URL = "jdbc:mysql://127.0.0.1:3307/jdbcDemo";
		String USER_NAME = "root";
		String PASSWORD = "admin";
		String query = "select name from jdbc where id=" + id;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			p.name = name;
			return p;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addPeople(People people) {
		
		String query = "insert into jdbc(name, email) values (?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, people.name);
			ps.setString(2, people.email);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}

}

// DTO Layer
class People {
	int id;
	String name;
	String email;
}