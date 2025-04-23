package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("eEng")
public final class ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Electric Engine is started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Electric Engine is started");
	}

}
