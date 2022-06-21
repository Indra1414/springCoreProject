package com.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	
	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price Of Pepsi");
		this.price = price;
	}
	
	public Pepsi() {
	    super();		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Buying Pepsi And Drink");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Putting Pepsi Bolltle Back To Shop After Drink");
	}
	
}
