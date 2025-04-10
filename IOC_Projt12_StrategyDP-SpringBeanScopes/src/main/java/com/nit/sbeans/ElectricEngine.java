package com.nit.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngine")
@Lazy(true)
public class ElectricEngine implements IEngine {

	public ElectricEngine()
	{
		System.out.println("ElectricEngine.ElectricEngine():: 0-param constructor");
	}
	
	@Override
	public void startEngine() {
		 System.out.println("ElectricEngine.startEngine():: started");
	}

	@Override
	public void endEngine() {
		System.out.println("ElectricEngine.endEngine():: ended");
	}

}
