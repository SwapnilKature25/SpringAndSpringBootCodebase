package com.nit.sbeans;

public class A {
	private B b;
	
	public A(B b)
	{
		this.b = b;
		System.out.println("A::1-param constructor");
	}

//	public void setB(B b)
//	{
//		this.b = b;
//	}
	
	@Override
	public String toString() {
		return "from A";
	}
	
	
	
}
