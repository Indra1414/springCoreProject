package com.springCore.auto.wire;

public class Transport {
	
	private String transportDetails;
	
	public String getTransportDetails() 
	{
		return transportDetails;
	}

	public void setTransportDetails(String transportDetails)
	{
		this.transportDetails = transportDetails;
		System.out.println("Setting Transport Details By Name");
	}

	@Override
	public String toString() {
		return "Transport [transportDetails=" + transportDetails + "]";
	}
	
	

}
