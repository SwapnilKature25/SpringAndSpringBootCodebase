package com.nit.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//AppConfig.java (Configuration class)

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig 
{
	
	// exception occurs if we not specify @Qualifier in target bean class available: expected single matching bean but found 3: ldate1,ldate2,ldate3
	@Bean(name="ldate")
	public LocalDate createLDate()
	{
		System.out.println("AppConfig.createLDate1()");
		return LocalDate.now();
	} 
	
	
	@Bean(name="ldate2")
	public LocalDate createLDate2()
	{
		System.out.println("AppConfig.createLDate2()");
		return LocalDate.of(2002, 2, 12);
	} 
	
	@Bean(name="ldate3")
	public LocalDate createLDate3()
	{
		System.out.println("AppConfig.createLDate3()");
		return LocalDate.of(2003, 3,24);
	} 

	@Bean(name="ldate4")
	public LocalDate createLDate4()
	{
		System.out.println("AppConfig.createLDate4()");
		return LocalDate.of(2004, 6,24);
	} 
	
	
	
	
	@Bean(name="ltime")
	public LocalTime createTime()
	{
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}
	
	
}
