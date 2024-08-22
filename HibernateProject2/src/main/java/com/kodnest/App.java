package com.kodnest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Bike;
import com.kodnest.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction tr = session.beginTransaction();
        
        Bike bike = new Bike(1, "KTM");
        session.save(bike);
        
        Student student = new Student(1,"John",bike);
        session.save(student);
        
        tr.commit();
        
    }
}
