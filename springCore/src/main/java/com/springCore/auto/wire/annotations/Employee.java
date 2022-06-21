package com.springCore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee 
{
	@Autowired
	@Qualifier("def")
	private Address address;
	
	public Employee() 
	{
		super();
	}
	//============Constructor For Employee ==================//
	public Employee(Address address)
	{
		super();
		System.out.println("Setting All The Details By Constructor");
		this.address = address;
	
	}
	
	//=======================Getter Setters For Address =======//
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) 
	{
		System.out.println("Setting Value Of Address");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
