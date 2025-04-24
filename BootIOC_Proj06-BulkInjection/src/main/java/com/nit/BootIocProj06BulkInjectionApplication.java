package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.PersonDetails;

@SpringBootApplication
public class BootIocProj06BulkInjectionApplication {

	public static void main(String[] args) {
		// get access to IOC container
		ApplicationContext ctx = SpringApplication.run(BootIocProj06BulkInjectionApplication.class, args);
		
		// get spring  bean class obj ref
		PersonDetails details=ctx.getBean("pDetails",PersonDetails.class);
		System.out.println(details);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
