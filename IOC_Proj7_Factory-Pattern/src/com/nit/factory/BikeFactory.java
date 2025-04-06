package com.nit.factory;

import com.nit.comps.Bike;
import com.nit.comps.BulletBike;
import com.nit.comps.ElectricBike;
import com.nit.comps.SportsBike;
import com.nit.comps.StandardBike;

public class BikeFactory {
	
	// static factory method having factory pattern logic
	public static Bike orderBike(String type)
	{
		Bike bike=null;
		if(type.equalsIgnoreCase("standard"))
			bike=new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike=new SportsBike();
		else if(type.equalsIgnoreCase("electric"))
			bike=new ElectricBike();
		else if(type.equalsIgnoreCase("bullet"))
			bike=new BulletBike();
		else 
			throw new IllegalArgumentException("Invalid Bike Type..");
		
		return bike;
	}
}
