package com.nit.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//AppConfig.java (Configuration class)

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("AppConfig::0-param constructor");
	}
	
	@Bean(name="ldate")
	public LocalDate createLDate()
	{
		System.out.println("AppConfig.createLDate()");
		return LocalDate.now();
	}
	
	
}
