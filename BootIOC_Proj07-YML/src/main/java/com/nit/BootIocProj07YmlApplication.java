package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Company;
import com.nit.sbeans.PersonDetails;

@SpringBootApplication
public class BootIocProj07YmlApplication {

	public static void main(String[] args) {
		// get access to IOC container
		ApplicationContext ctx = SpringApplication.run(BootIocProj07YmlApplication.class, args);
	
		// get spring bean class obj ref
//		Company comp=ctx.getBean("company",Company.class);
//		System.out.println("Company Details are  : "+comp);
		
		PersonDetails per=ctx.getBean("pDetails",PersonDetails.class);
		System.out.println(per);
		
		((ConfigurableApplicationContext) ctx).close();
	}
}
