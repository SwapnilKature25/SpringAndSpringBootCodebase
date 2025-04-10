package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.nit")
@PropertySource("com/nit/commons/myfile.properties")
public class AppConfig {
	
	
}
