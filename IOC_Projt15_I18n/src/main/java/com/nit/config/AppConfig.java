package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource")  // messageSource is the fixed bean id
	public ResourceBundleMessageSource createRDBMS() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/nit/commons/App");  //specifying the base file name and location
		return source;
	}
}
