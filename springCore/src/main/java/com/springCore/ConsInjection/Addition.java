package com.springCore.ConsInjection;

public class Addition 
{
	private int a;
	private int b;
	 
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("This Is The Constructor Of Int, Int");
	}
	public Addition(double a, double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("This Is The Constructor Of double, double");
	}
	
	public Addition(String a, String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("This Is The Constructor Of String, String");
	}
	
	/*If the constructor of argument String, String is present then
	 *  it will call that constructor otherwise 
	it will maintain the order of constructor 
	whichever comes first it will take that constructor and create the object */ 
	
	public void doSum()
	{
		System.out.println("Value Of a "+this.a);
		System.out.println("Value Of b "+this.b);
		System.out.println("The Sum Is "+(this.a+this.b));
	}
}
