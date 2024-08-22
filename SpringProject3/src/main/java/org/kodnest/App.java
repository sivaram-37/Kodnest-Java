package org.kodnest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    	Object bean1 = context.getBean("e1");
    	System.out.println(bean1);
    	context.close();
    }
}
