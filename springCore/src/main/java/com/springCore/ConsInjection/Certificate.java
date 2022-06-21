package com.springCore.ConsInjection;

public class Certificate
{

	private String certiDetails;
	public Certificate(String certiDetails)
	{
		super();
		this.certiDetails = certiDetails;
	}

	public String getCertiDetails()
	{
		return certiDetails;
	}

	public void setCertiDetails(String certiDetails)
	{
		this.certiDetails = certiDetails;
	}

	@Override
	public String toString() 
	{
		return this.certiDetails;	
	}
	
}
