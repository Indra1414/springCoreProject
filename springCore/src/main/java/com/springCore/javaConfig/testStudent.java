package com.springCore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.springCore.spel.Demo;

@Component
public class testStudent {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(javaConfig.class);
		Student temp = (Student)context.getBean("getStudent");
		Subject temp2 = (Subject)context.getBean("getSubject");
		temp.Study();
		temp2.getFees();
		temp2.getProfessorName();
		
		
	}

}
