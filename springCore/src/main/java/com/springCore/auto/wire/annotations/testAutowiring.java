package com.springCore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.reference.A;

public class testAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/auto/wire/annotations/autowiringAnnotationConfig.xml");
		Employee temp =context.getBean("employee",Employee.class);
		System.out.println(temp);
		System.out.println();


	}

}
