package com.kodnest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Employee;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tr = session.beginTransaction();
		
//		List list = session.createQuery("from Employee where id>1").list();
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
		Employee employee = new Employee(1, "John");
		session.save(employee);
		
		tr.commit();
		
	}
}
