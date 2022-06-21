package com.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chatni {
	
	private int price;

	public Chatni() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		System.out.println("Setting Price Of Chatni");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Chatni [price=" + price + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Started Eating Chatni");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Chatni Finished");
	}
}
