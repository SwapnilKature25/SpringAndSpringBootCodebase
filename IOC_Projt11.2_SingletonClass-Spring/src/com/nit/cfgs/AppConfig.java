package com.nit.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//AppConfig.java (Configuration class)

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("AppConfig::0-param constructor");
	}
	
	@Bean(name="dt")
	@Scope("singleton")
	public LocalDateTime createLDT()
	{
		System.out.println("AppConfig.createLDT()");
		return LocalDateTime.now();
	}
	
	@Bean(name="dt1")
	public LocalDateTime createLDT1()
	{
		System.out.println("AppConfig.createLDT1()");
		return LocalDateTime.now();
	}
	
	
}
