package com.nit.factory;

import com.nit.comps.BlueDart;
import com.nit.comps.DHL;
import com.nit.comps.DTDC;
import com.nit.comps.Flipkart;
import com.nit.comps.ICourier;

public class FlipkartFactory {
	
	// static factory method having logic to create and 
//	   return target class obj having one of its dependent class obj
	public static Flipkart getInstance(String courierType)
	{
		System.out.println("FlipkartFactory.getInstance()");
		// create one of the dependent class obj
		ICourier courier = null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if(courierType.equalsIgnoreCase("bdart"))
			courier = new BlueDart();
		else if(courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else 
			throw new IllegalArgumentException("Invalid Courier name");
		
		// create target class obj
		Flipkart fpkt = new Flipkart();
		//assign dependent class obj(courier) to target class obj
		fpkt.setCourier(courier);
		
		 
		return fpkt;
	}
}
