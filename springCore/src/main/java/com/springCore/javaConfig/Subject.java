package com.springCore.javaConfig;

import org.springframework.stereotype.Component;

public class Subject {
   
	public String fees = "10000";
	private String professorName= "TK Basu";
	public void getFees()
	{
		System.out.println("The Fees Of The Subject Is: "+fees);
	}
	public void getProfessorName()
	{
		System.out.println("The Name Of The Professor Is: "+professorName);
	}
	
	
}
