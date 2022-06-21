package com.springCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.Student;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collection/configCollection.xml");
		Employee emp1 =(Employee) context.getBean("emp1");
		
		System.out.println("<-------This Is Due To Collection Injection------->");
		System.out.println("Employee's Name: "+emp1.getName());
		System.out.println("Employee's Address: "+emp1.getAddresses());
		System.out.println("Employee's Phone Number: "+emp1.getPhones());
		System.out.println("Employee's Courses: "+emp1.getCourses());
		System.out.println("Employee's Properties: "+emp1.getProp());
	}

}
