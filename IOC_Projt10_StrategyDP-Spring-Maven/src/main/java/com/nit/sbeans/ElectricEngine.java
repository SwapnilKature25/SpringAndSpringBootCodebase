package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		 System.out.println("ElectricEngine.startEngine():: started");
	}

	@Override
	public void endEngine() {
		System.out.println("ElectricEngine.endEngine():: ended");
	}

}
