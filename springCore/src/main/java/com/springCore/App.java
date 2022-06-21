package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 =(Student) context.getBean("student1");
        Student student2 =(Student) context.getBean("student2");
        
        System.out.println("<-------This Is Due To Premittive Injection------->");
        System.out.println("The datas of 1st Student: "+student1);
        System.out.println("The datas of 2nd Student: "+student2);

    }
}
