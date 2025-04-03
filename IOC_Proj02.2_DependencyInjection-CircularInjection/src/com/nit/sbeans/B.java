package com.nit.sbeans;

public class B {
	private A a;
	
	public void B(A a)
	{
		this.a = a;
		System.out.println("B::1-param constructor");
	}

//	
//	public void setA(A a)
//	{
//		this.a = a;
//	}
//	
	@Override
	public String toString() {
		return "from B";
	}
	
	
}
