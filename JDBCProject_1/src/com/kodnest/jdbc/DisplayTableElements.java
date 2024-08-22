package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayTableElements {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";

		Connection con = DriverManager.getConnection(url, uname, password);

//		Display Records in Forward direction
		Statement statement = con.createStatement();
		String sql="select * from student";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
		}
		
		
//		Display Records in Backward direction
//		Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//		String sql="select * from student";
//		ResultSet rs = statement.executeQuery(sql);
//		rs.last();
//		do {
//			System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
//		}while(rs.previous());
		
		
		
		con.close();
	}
}
