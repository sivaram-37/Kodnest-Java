package com.kodnest.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/jdbcdb";
		String uname="root";
		String password="V$ivaram37";
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		Statement statement = con.createStatement();
		
		statement.execute("insert into student values(1,'John')");
		statement.execute("insert into student values(2,'Jack')");
		statement.execute("insert into student values(3,'Ria')");
		statement.execute("insert into student values(4,'Ryan')");
		statement.execute("insert into student values(5,'Karan')");
		
		
		System.out.println("Success");
		
		
		con.close();
	}
}
