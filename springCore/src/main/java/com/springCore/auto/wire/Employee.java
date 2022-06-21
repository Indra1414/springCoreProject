package com.springCore.auto.wire;

public class Employee 
{
	private Address address;
	private Transport transport;
	private Restaurant restaurant;

	public Employee() 
	{
		super();
	}
	//============Constructor For All Three Objects==================//
	public Employee(Address address, Transport transport, Restaurant restaurant) {
		super();
		System.out.println("Setting All The Details By Constructor");
		this.address = address;
		this.transport = transport;
		this.restaurant = restaurant;
	}
	//=======================Getter Setters For Transport , Restaurant And Address =======//
	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

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
		return "Employee [address=" + address + ", transport=" + transport + ", restaurant=" + restaurant + "]";
	}

	
	
}
