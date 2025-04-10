package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements IEngine {

	public PetrolEngine()
	{
		System.out.println("PetrolEngine.PetrolEngine():: 0-param constructor");
	}
	
	@Override
	public void startEngine() {
		 System.out.println("PetrolEngine.startEngine()::Petrol engine started");
	}

	@Override
	public void endEngine() {
		 System.out.println("PetrolEngine.endEngine()::Petrol engine ended");
	}

}
