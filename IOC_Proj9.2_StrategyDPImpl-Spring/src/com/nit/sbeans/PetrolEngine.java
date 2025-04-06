package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine
{

	@Override
	public void startEngine() {
		 System.out.println("Engine with Petrol started...");
	}

	@Override
	public void endEngine() {		 
		System.out.println("Engine with Petrol stopped.");
	}
	
	
}
