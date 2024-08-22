package com.kodnest.bank;

import java.util.*;
import java.sql.*;

public class Project1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner in = new Scanner(System.in);
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://localhost/jdbcdb";
			String uname="root";
			String pwd="V$ivaram37";

			con = DriverManager.getConnection(url, uname, pwd);

			con.setAutoCommit(false);
			String sql="insert into student values(?,?)";


			System.out.println("Enter student-Id");
			int id=in.nextInt();
			System.out.println("Enter student-Name");
			String name=in.next();

			Student student = new Student(id,name);

			PreparedStatement s = con.prepareStatement(sql);

			int id2 = student.getId();
			String name2=student.getName();

			s.setInt(1, id2);
			s.setString(2, name2);

			int r = s.executeUpdate();
			System.out.println(r+" row affected");
			con.setAutoCommit(true);
		}
		catch(Exception e) {
			con.rollback();
			System.out.println("Exception Occured");
		}

		con.close();
		in.close();


	}
}
