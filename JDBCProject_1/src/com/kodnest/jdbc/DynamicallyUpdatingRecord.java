package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicallyUpdatingRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner in = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";

		Connection con = DriverManager.getConnection(url, uname, password);

		String sql="update student set name=? where id=?";
		
		System.out.println("User! Enter the new Student-Name to update :-");
		String name=in.next();
		System.out.println("User! Enter the existing Student-Id :-");
		int id=in.nextInt();
		
		
		PreparedStatement statement = con.prepareStatement(sql);
		
		statement.setString(1, name);
		statement.setInt(2, id);
		
		int r = statement.executeUpdate();	
		
		
		System.out.println(r+ " row/s affected");

		in.close();
		con.close();
	}

}
