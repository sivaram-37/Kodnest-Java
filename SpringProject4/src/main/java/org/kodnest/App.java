package org.kodnest;
import org.kodnest.bean.Trainer;
import org.kodnest.bean.University;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    	Object trainer = (Trainer)context.getBean("t1");
    	System.out.println(trainer);
    	Object univ = (University)context.getBean("u1");
    	System.out.println(univ);
    	context.close();
    }
}
