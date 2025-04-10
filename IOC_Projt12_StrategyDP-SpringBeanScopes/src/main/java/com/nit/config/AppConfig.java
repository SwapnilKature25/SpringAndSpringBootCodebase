package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nit.ston.Printer;

@Configuration
@ComponentScan(basePackages="com.nit")
public class AppConfig {
	
	@Bean(name="prn")
	@Scope("prototype")
	public Printer createPrinter()
	{
		//static factory method based spring bean instantiation
		return Printer.getInstance();
	}
}

/*
 
 DieselEngine.DieselEngine():: 0-param constructor
PetrolEngine.PetrolEngine():: 0-param constructor
========================
Vehicle.Vehicle():: 0-param constructor
Vehicle.Vehicle():: 0-param constructor
Vehicle.Vehicle():: 0-param constructor
1550261631  1970436060  1753127384
Printer::0-param constructor
111900554  111900554 */