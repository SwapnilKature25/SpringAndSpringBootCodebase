package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class BootIocProj02StrategyDpApplication {

	public static void main(String[] args) {
		
		// get IOC container		
		ApplicationContext ctx = SpringApplication.run(BootIocProj02StrategyDpApplication.class, args);
		
		// get target spring bean class obj ref
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("hyd", "goa");
	
		// close IOC conntainer
		((ConfigurableApplicationContext) ctx).close();
		
	}

}


/* 
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.4)

2025-04-23T02:53:35.164+05:30  INFO 1124 --- [BootIOC_Proj02-StrategyDP] [           main] c.n.BootIocProj02StrategyDpApplication   : Starting BootIocProj02StrategyDpApplication using Java 19.0.1 with PID 1124 (C:\Users\swapn\01CJ\Spring_SpringBoot_Projects\BootIOC_Proj02-StrategyDP\target\classes started by swapn in C:\Users\swapn\01CJ\Spring_SpringBoot_Projects\BootIOC_Proj02-StrategyDP)
2025-04-23T02:53:35.168+05:30  INFO 1124 --- [BootIOC_Proj02-StrategyDP] [           main] c.n.BootIocProj02StrategyDpApplication   : No active profile set, falling back to 1 default profile: "default"
2025-04-23T02:53:35.982+05:30  INFO 1124 --- [BootIOC_Proj02-StrategyDP] [           main] c.n.BootIocProj02StrategyDpApplication   : Started BootIocProj02StrategyDpApplication in 1.538 seconds (process running for 2.022)
Diesel Engine is started
Journey started : hyd
Journey is going on....
Diesel Engine is ended
Journey ended  : goa
 */