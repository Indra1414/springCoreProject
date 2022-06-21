package com.springCore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.reference.A;

public class Test {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/stereoType/stereoConfig.xml");
		Student temp = (Student)context.getBean("ob");
		System.out.println(temp);
		System.out.println("------------------------------------------------------");
		System.out.println("The Address: "+temp.getAddress());
		Student temp2 = (Student)context.getBean("ob");
		System.out.println("First Object Hash Code Of Student Class: "+temp.hashCode());
		System.out.println("Second Object Hash Code Of Student Class: "+temp2.hashCode());
		Teacher temp3 = (Teacher)context.getBean("teacher");
		Teacher temp4 = (Teacher)context.getBean("teacher");
		System.out.println("First Object Hash Code Of Teacher Class: "+temp3.hashCode());
		System.out.println("Second Object Hash Code Of Teacher Class: "+temp4.hashCode());
		
	}

}
