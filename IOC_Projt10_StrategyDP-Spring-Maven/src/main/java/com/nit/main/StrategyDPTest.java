package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Vehicle;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		// create IOC Container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean class obj ref
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		
		//invoke the b.method
		vehicle.journey("Hyd", "Goa");
		
		//close container
		ctx.close();
	}
}


/* DieselEngine.startEngine()::Diesel engine started
Journey started on the vehicle from Hyd
DieselEngine.endEngine()::Diesel engine ended
Journey ended at Goa
 */

