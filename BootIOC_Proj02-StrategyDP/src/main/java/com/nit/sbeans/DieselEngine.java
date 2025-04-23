package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dEng")
public final class DieselEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Diesel Engine is started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Diesel Engine is ended");
	}

}
