package com.springCore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.standalons.collection.Person;

public class testSpel {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/spel/spelConfig.xml");
		Demo temp = (Demo)context.getBean("demo");
		System.out.println(temp);
	}

}
