package com.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/reference/referenceConfiguration.xml");
		A temp = (A)context.getBean("referenceA");
		
		System.out.println("<-------This Is Due To Reference Injection------->");
		System.out.println("The value of X: "+temp.getX());
		System.out.println("The value of Y: "+temp.getOb().getY());
		
	}

}
