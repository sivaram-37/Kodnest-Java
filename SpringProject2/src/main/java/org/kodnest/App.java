package org.kodnest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        
        Object bean1 = context.getBean("p1");
        Object bean2 = context.getBean("p2");
        System.out.println(bean1);
        System.out.println(bean2);
    }
}
