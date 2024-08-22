package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";

		Connection con = DriverManager.getConnection(url, uname, password);

		Statement statement = con.createStatement();
		
		String sql="delete from student where id=5";
		
		int executeUpdate = statement.executeUpdate(sql);
		
		System.out.println(executeUpdate+" row/s affected");
		
		con.close();
	}
}
