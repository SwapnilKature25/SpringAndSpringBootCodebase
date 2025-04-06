package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh")
public class Vehicle {
	
	@Autowired
	@Qualifier("dEngine")
	public IEngine engine;

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	// b.method
	public void journey(String startPlace,String destPlace)
	{
		engine.startEngine();
		System.out.println("journey started from "+startPlace);
		engine.endEngine();
		System.out.println("journey ended at "+destPlace);
	}
	
	
}
