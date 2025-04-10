package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {

	@Override
	public void startEngine() {
		 System.out.println("DieselEngine.startEngine()::Diesel engine started");
	}

	@Override
	public void endEngine() {
		 System.out.println("DieselEngine.endEngine()::Diesel engine ended");
	}

}

