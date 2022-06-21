package com.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springCore.javaConfig")
public class javaConfig 
{
	
	@Bean
	public Subject getSubject()
	{
		return new Subject();
	}

	@Bean
	public Student getStudent()
	{
		
		return new Student(getSubject());
		
	}
}
