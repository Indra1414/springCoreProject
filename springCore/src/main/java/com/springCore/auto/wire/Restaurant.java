package com.springCore.auto.wire;

public class Restaurant {
	
	private String restaurantName;

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName)
	{
		System.out.println("Setting Restaurant Details By Type");
		this.restaurantName = restaurantName;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + "]";
	}

}
