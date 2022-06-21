package com.springCore.lifeCycle;

public class Samossa {
	private double price;

	public Samossa() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("Setting Price Of Samossa");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samossa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside Init Method");
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy Method");
	}

}
