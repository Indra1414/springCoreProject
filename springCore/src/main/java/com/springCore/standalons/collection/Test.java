package com.springCore.standalons.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.reference.A;

public class Test {
	
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/standalons/collection/standaloneConfigxml.xml");
		Person temp = (Person)context.getBean("person1");
		System.out.println(temp.getFriends());
		System.out.println(temp.getFriends().getClass().getName());
		System.out.println("---------------------------------------------------");
		System.out.println(temp.getColegues());
		System.out.println(temp.getColegues().getClass().getName());
		System.out.println("---------------------------------------------------");
		System.out.println(temp.getColegueNameWithSalary());
		System.out.println(temp.getColegueNameWithSalary().getClass().getName());
		System.out.println("---------------------------------------------------");
		System.out.println(temp.getDatabaseConnection());
		System.out.println(temp.getDatabaseConnection().getClass().getName());
		
	}
}
