package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	
	@Autowired
	@Qualifier("motor")
	public IEngine eng;
	
	public void journey(String startPlace, String destPlace)
	{
		eng.startEngine();
		System.out.println("Journey started : "+startPlace);
		System.out.println("Journey is going on....");
		
		eng.stopEngine();
		System.out.println("Journey ended  : "+destPlace);
		
	}
}
