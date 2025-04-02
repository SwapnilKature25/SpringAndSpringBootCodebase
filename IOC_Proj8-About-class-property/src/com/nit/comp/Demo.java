package com.nit.comp;

public class Demo {
	private int a;
	private int b;
	
	public Demo() {
		System.out.println("Demo:: 0-param constructor");
	}
	
	public Demo(int a,int b)
	{
		System.out.println("Demo:: 2-param constructor");
		this.a=a;
		this.b=b;
	}
	
	public int m1()
	{
		return 100;
	}
}
