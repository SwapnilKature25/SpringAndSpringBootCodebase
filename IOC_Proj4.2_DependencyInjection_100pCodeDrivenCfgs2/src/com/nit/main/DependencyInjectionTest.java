package com.nit.main;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.WeekDayFinder;

// DependencyInjectionTest.java  (main class)

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main() (start)");
		
		//create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get Target spring bean class obj ref
//		WeekDayFinder finder = (WeekDayFinder)ctx.getBean("wdf");
		
		
		
		
		// using getBean() method with 1-param or return type as Object 
//		Object obj = ctx.getBean("wdf");   
//		WeekDayFinder finder = (WeekDayFinder)obj;  // typecasting with same class
		
		// typecasting with different class     
//		LocalDate finder = (LocalDate)obj;   // java.lang.ClassCastException  => so working with 1-param getBean() may leads to exception and is not of industry standard
		
		
		
		// using getBean() method with 2-param or return type as Generics
		// 1st way
//		WeekDayFinder finder = ctx.getBean("wdf",WeekDayFinder.class);   // because of 2-param getBean() it becomes type safe code.
		
		//2nd way
		Class<WeekDayFinder> c1 = WeekDayFinder.class;
		WeekDayFinder finder = ctx.getBean("weekDayFinder",c1);
		
		
		// invoke the b.method
		String msg = finder.showMessageOnDayOfTheWeek("raja");
		System.out.println(msg);
		
		
		LocalDate date = ctx.getBean("createLDate",LocalDate.class);
		System.out.println("Date :: "+date);
		
		System.out.println("==============================");
		System.out.println("The default bean id is :: "+Arrays.toString(ctx.getBeanDefinitionNames()));
		
		//close container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main() (end)");
	 	
	}

}


//  class name will become bean id 
/*
   default bean id with Annotation driven cfgs
 DependencyInjectionTest.main() (start)
AppConfig::0-param constructor
WeekDayFinder:: 0-param constructor
AppConfig.createLDate()
WeekDayFinder.showMessageOnDayOfTheWeek()
Work Hard :: raja
DependencyInjectionTest.main() (end)
 */

// configuring bean without bean id

/* DependencyInjectionTest.main() (start)
AppConfig::0-param constructor
WeekDayFinder:: 0-param constructor
AppConfig.createLDate()
WeekDayFinder.showMessageOnDayOfTheWeek()
Work Hard :: raja
Data :: 2025-04-02
DependencyInjectionTest.main() (end)
 */


