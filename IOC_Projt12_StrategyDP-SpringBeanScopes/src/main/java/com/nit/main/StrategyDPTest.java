package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Vehicle;
import com.nit.ston.Printer;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		// create IOC Container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean class obj ref
//		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		
		//invoke the b.method
//		vehicle.journey("Hyd", "Goa");
		
		System.out.println("========================");
		/*
		Printer prn=ctx.getBean("prn",Printer.class);
		Printer prn2=ctx.getBean("prn",Printer.class);
		
		System.out.println(prn.hashCode()+"  "+prn2.hashCode());
		*/
		 
		Vehicle vehicle1 = ctx.getBean("vehicle",Vehicle.class);
		Vehicle vehicle2 = ctx.getBean("vehicle",Vehicle.class);
		Vehicle vehicle3 = ctx.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle1.hashCode()+"  "+vehicle2.hashCode()+"  "+vehicle3.hashCode());
		/*
		Printer prn=ctx.getBean("prn",Printer.class);
		Printer prn2=ctx.getBean("prn",Printer.class);
		
		System.out.println(prn.hashCode()+"  "+prn2.hashCode());
		*/
		
		//close container
		ctx.close();
	}
}


/* Printer::0-param constructor
DieselEngine.startEngine()::Diesel engine started
Journey started on the vehicle from Hyd
DieselEngine.endEngine()::Diesel engine ended
Journey ended at Goa
========================
1378084334  1378084334


DieselEngine.DieselEngine():: 0-param constructor
ElectricEngine.ElectricEngine():: 0-param constructor
PetrolEngine.PetrolEngine():: 0-param constructor
Vehicle.Vehicle():: 0-param constructor
Printer::0-param constructor


// after making scope as prototype
DieselEngine.DieselEngine():: 0-param constructor
PetrolEngine.PetrolEngine():: 0-param constructor
Printer::0-param constructor
========================
Vehicle.Vehicle():: 0-param constructor
Vehicle.Vehicle():: 0-param constructor
Vehicle.Vehicle():: 0-param constructor
1989184704  611572016  889486595       // here every time new object is creating i.e diff hashcode 

 */

