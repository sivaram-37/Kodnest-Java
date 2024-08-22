package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicallyInsetRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner in = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";

		Connection con = DriverManager.getConnection(url, uname, password);

		String sql="insert into student values(?,?)";
		
		System.out.println("User! Enter the Student-Id");
		int id=in.nextInt();
		System.out.println("User! Enter the Student-Name");
		String name=in.next();
		
		PreparedStatement statement = con.prepareStatement(sql);
		
		statement.setInt(1, id);
		statement.setString(2, name);
		
		int r = statement.executeUpdate();	
		
		
		System.out.println(r+ " row/s affected");

		in.close();
		con.close();
	}
}
