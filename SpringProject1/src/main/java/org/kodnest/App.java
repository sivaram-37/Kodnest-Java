package org.kodnest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        
        Object bean1 = context.getBean("s1");
        System.out.println(bean1);
        
        Object bean2 = context.getBean("s2");
        System.out.println(bean2);
        
        Object bean3 = context.getBean("s3");
        System.out.println(bean3);
        
        Object bean4 = context.getBean("s4");
        System.out.println(bean4);
        
        Object bean5 = context.getBean("s5");
        System.out.println(bean5);
        
        
       Object b1 = context.getBean("l1");
       System.out.println(b1);
    }
}
