package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProjectSQLQuerys {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner in = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcdb", "root", "V$ivaram37");
		boolean f=true;
		while(f) {
			System.out.println("1 -> To Create a table product with value as pid,pstatus,pdetails\n"
					+"2 -> To Insert record into the table\n"
					+ "3 -> Update the record in the table\n"
					+"4 -> Delete the record from the table\n"
					+"5 -> Display the table product\n"
					+ "6 -> exit");
			System.out.println("Choose the operation to perform on database :-");
			int val=in.nextInt();
			switch (val) {
			case 1:
				Create(con);
				break;
			case 2:
				Insert(con,in);
				break;
			case 3:
				Update(con,in);
				break;
			case 4:
				Delete(con,in);
				break;
			case 5:
				Display(con);
				break;
			case 6:
				System.out.println("Program stopped !!!");
				f=false;
			}
		}
		con.close();
		in.close();
		
	}
	private static void Display(Connection con) throws SQLException {
		String sql="select * from product";
		PreparedStatement s = con.prepareStatement(sql);
		ResultSet rs = s.executeQuery();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("pid    pstatus     pdetails");
		System.out.println("-----------------------------------------------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"       "+rs.getString(2)+"          "+rs.getString(3));
		}
		System.out.println("-----------------------------------------------------------------");

	}
	private static void Create(Connection con){
		try {
			Statement statement = con.createStatement();
			String sql="create table Product (pid int,pstatus varchar(2),pdetails varchar(20))";
			statement.execute(sql);
			System.out.println("Table created successfully");
		}
		catch(Exception e) {
			System.out.println("Table already exist");
		}
	}

	private static void Insert(Connection con, Scanner in) throws SQLException {
		
		String sql="insert into product values(?,?,?)";

		System.out.println("Enter the product-pid : ");
		int pid=in.nextInt();
		System.out.println("Enter the product-pstatus[Y for Delivered / N for Not-Delivered]:");
		String pstatus=in.next();
		in.nextLine();
		System.out.println("Enter the product-pdetails :");
		String pdetails=in.nextLine();

		PreparedStatement s = con.prepareStatement(sql);
		s.setInt(1, pid);
		s.setString(2,pstatus);
		s.setString(3, pdetails);

		int r = s.executeUpdate();
		System.out.println(r+" row affected");
		
	}

	
	private static void Update(Connection con, Scanner in) throws SQLException {
		
		String sql="update product set pstatus=? where pid=?";

		System.out.println("Enter the product-pid to update pstatus: ");
		int pid=in.nextInt();
		System.out.println("Enter the product-pstatus[Y for Delivered / N for Not-Delivered]:");
		String pstatus=in.next();

		PreparedStatement s = con.prepareStatement(sql);
		s.setString(1,pstatus);
		s.setInt(2, pid);

		int r = s.executeUpdate();
		System.out.println(r+" row affected");
		
	}

	private static void Delete(Connection con, Scanner in) throws SQLException{
		
		String sql="delete from product where pid=?";

		System.out.println("Enter the product-pid : ");
		int pid=in.nextInt();

		PreparedStatement s = con.prepareStatement(sql);
		s.setInt(1, pid);

		int r = s.executeUpdate();
		System.out.println(r+" row affected");
		
	}

}
