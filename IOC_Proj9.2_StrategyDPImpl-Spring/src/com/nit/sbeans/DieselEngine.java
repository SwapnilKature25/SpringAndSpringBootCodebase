package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine
{

	@Override
	public void startEngine() {
		 System.out.println("DieselEngine car started...");
	}

	@Override
	public void endEngine() {		 
		System.out.println("DieselEngine car stopped.");
	}
	
	
}
