package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC Project1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		Statement statement = con.createStatement();
		statement.execute("create table student (id int,name varchar(20))");
		
		
		System.out.println("Success");
		
		
		con.close();
	}

}
