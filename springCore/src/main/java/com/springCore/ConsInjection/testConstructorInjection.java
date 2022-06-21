package com.springCore.ConsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.reference.A;

public class testConstructorInjection 
{
	public static void main(String []args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ConsInjection/consInjectionConfiG.xml");
		Person temp = (Person)context.getBean("person");
		
		System.out.println("<------This Is Due To Constructor Injection-------->");
		System.out.println("Certification Details: "+temp.toString());
		
		System.out.println("<------This Is Due To Constructor Injection And Ambiguity Resolve-------->");
		Addition temp1 = (Addition)context.getBean("addition");
		temp1.doSum();
		
	}
	
}
