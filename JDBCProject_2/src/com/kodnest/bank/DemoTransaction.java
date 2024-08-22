package com.kodnest.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTransaction {
	public static void main(String[] args) throws SQLException {
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost/bank";
			String uname="root";
			String pwd="V$ivaram37";
			con = DriverManager.getConnection(url, uname, pwd);


			String sql1="update Account set balance=balance+1000 where accid=1";
			String sql2="updat Account set balance=balance-1000 where accid=2";

			con.setAutoCommit(false);
			
			Statement s = con.createStatement();

			s.addBatch(sql1);
			s.addBatch(sql2);
			s.executeBatch();
			
			con.setAutoCommit(true);
			
			System.out.println("Transaction Success");
			
		}catch (Exception e) {
			System.out.println("Transaction Incomplete");
			con.rollback();
		}
		finally {
			con.close();
		}
	}
}
