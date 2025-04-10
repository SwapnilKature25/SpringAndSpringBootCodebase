package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	
	//b.method
	public  void journey(String startPlace, String endPlace)
	{
		engine.startEngine();
		System.out.println("Journey started on the vehicle from "+startPlace);
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		engine.endEngine(); 
		System.out.println("Journey ended at "+endPlace);
	}
	
}
