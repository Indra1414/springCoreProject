package com.springCore.javaConfig;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {
	
	
	private Subject subject;
	
	public Student(Subject subject) {
		super();
		this.subject = subject;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void Study()
	{
		System.out.println("Student Is Studing Java Spring");
	}
	
}
