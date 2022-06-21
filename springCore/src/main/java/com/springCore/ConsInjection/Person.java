package com.springCore.ConsInjection;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> languages;
	
	public Person(String name,int personId, Certificate certi, List<String> languages)
	{
		this.name= name;
		this.personId= personId;
		this.certi=certi;
		this.languages=languages;
	}

	@Override
	public String toString()
	{
		return this.name+" Person Id "+this.personId+" Is "+this.certi+""+languages;
	}
	
}
