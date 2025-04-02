package com.nit.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//AppConfig.java (Configuration class)

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig 
{
	
	public AppConfig(){
		System.out.println("AppConfig::0-param constructor");
		
	}

	//solution 1
	@Bean(name="ldate")
	@Primary
	public LocalDate createLDate()
	{
		System.out.println("AppConfig.createLDate()");
		return LocalDate.now();
	} 
	
	
	// using solution 2
	@Bean(name="ldate2")
	public LocalDate createLDate2()
	{
		System.out.println("AppConfig.createLDate2()");
		return LocalDate.of(2002, 2, 12);
	} 
	
	// using solution 3
	@Bean(name="date")
	public LocalDate createLDate3()
	{
		System.out.println("AppConfig.createLDate3()");
		return LocalDate.of(2003, 3,24);
	} 

	
	
	@Bean(name="ltime")
	public LocalTime createTime()
	{
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}
	
	
}
