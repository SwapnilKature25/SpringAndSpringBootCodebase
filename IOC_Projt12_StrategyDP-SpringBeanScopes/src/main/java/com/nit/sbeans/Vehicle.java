package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vehicle")
@Lazy(true)
//@Scope("prototype")
@Scope("scope")        //  java.lang.IllegalStateException: No Scope registered for scope name 'scope'
					  // because request scope can be used in only web applications
public class Vehicle {
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public Vehicle()
	{
		System.out.println("Vehicle.Vehicle():: 0-param constructor");
	}
	
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
