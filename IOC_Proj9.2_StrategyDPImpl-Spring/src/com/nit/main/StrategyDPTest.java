package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Vehicle;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		// create IOC Container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get access to target spring bean class obj ref
		Vehicle veh = ctx.getBean("veh",Vehicle.class);
		
		//invoke b.method
		veh.journey("Hyd", "Dubai");
		
		System.out.println("===============================");
		
		Vehicle veh2 = ctx.getBean("veh",Vehicle.class);
		veh2.journey("Hyd", "Jalna");
		System.out. println(veh.hashCode()+" "+veh2.hashCode() );    // same internal cache memory for both obj so hashcode also same
		
		ctx.close();
		
	}
}


/* 
Vehicle.Vehicle()
DieselEngine car started...
journey started from Hyd
DieselEngine car stopped.
journey ended at Dubai
===============================
DieselEngine car started...
journey started from Hyd
DieselEngine car stopped.
journey ended at Jalna
70807318 70807318



Vehicle.Vehicle()
Engine with Petrol started...
journey started from Hyd
Engine with Petrol stopped.
journey ended at Dubai
===============================
Engine with Petrol started...
journey started from Hyd
Engine with Petrol stopped.
journey ended at Jalna
70807318 70807318

 */
 