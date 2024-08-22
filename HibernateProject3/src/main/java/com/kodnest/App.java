package com.kodnest;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        
        Product p1 = new Product();
        p1.setPid(1);
        p1.setPname("Mobile");
        session.save(p1);
        
        Product p2 = new Product();
        p2.setPid(2);
        p2.setPname("Earphone");
        session.save(p2);
        
        Product p3 = new Product();
        p3.setPid(3);
        p3.setPname("Charger");
        session.save(p3);
        
        ArrayList<Product> list1 = new ArrayList<Product>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        
        Customer c1 = new Customer(1,"John", list1);
        session.save(c1);

        ArrayList<Product> list2 = new ArrayList<Product>();
        list2.add(p1);
        list2.add(p3);
        
        Customer c2 = new Customer(2,"Ria", list2);
        session.save(c2);
       
        tr.commit();
    }
}
