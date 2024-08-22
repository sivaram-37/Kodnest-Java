package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";

		Connection con = DriverManager.getConnection(url, uname, password);

		Statement statement = con.createStatement();
		
		int executeUpdate = statement.executeUpdate("update student set name='Siva' where id=5");
		
		System.out.println(executeUpdate+" success");
		
		con.close();
	}
}
