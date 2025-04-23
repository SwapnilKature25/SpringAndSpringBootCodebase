package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("pEng")
public final class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Petrol Engine is started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Petrol Engine is ended");
	}

}
