package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nit.sbeans.TrainingInstitute;

@SpringBootApplication
@PropertySource("myfile1.properties")
public class BootIocProj05ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(BootIocProj05ValueAnnotationSpelApplication.class, args);
		
		// get access to target spring bean class obj ref
		TrainingInstitute inst = ctx.getBean("inst",TrainingInstitute.class);
		System.out.println(inst);
	
		// close IOC container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
