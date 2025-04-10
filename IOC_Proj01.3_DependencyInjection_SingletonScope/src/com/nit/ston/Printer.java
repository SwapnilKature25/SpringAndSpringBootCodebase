package com.nit.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Printer {
	
//	private Static ref reference variable to hold single object
	private static Printer INSTANCE;
	
//	private constructor
	private Printer() {
		System.out.println("Printer::0-param constructor");
	}
	
//	static factory method having singleton logic
	public static Printer getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new Printer();
		}
		return INSTANCE;		
	}
	
	
//	b.method
	public void printData(String message)
	{
		System.out.println("Printer.printData()");
		System.out.println(message);
	}
		
	
}



