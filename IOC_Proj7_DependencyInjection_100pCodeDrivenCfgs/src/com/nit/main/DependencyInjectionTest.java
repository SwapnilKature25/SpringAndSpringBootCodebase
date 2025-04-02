package com.nit.main;

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
		Object obj = ctx.getBean("wdf");   
//		WeekDayFinder finder = (WeekDayFinder)obj;  // typecasting with same class
		
		// typecasting with different class     
//		LocalDate finder = (LocalDate)obj;   // java.lang.ClassCastException  => so working with 1-param getBean() may leads to exception and is not of industry standard
		
		
		
		// using getBean() method with 2-param or return type as Generics
		// 1st way
//		WeekDayFinder finder = ctx.getBean("wdf",WeekDayFinder.class);   // because of 2-param getBean() it becomes type safe code.
		
		//2nd way
		Class<WeekDayFinder> c1 = WeekDayFinder.class;
		WeekDayFinder finder = ctx.getBean("wdf",c1);
		
		
		// invoke the b.method
		String msg = finder.showMessageOnDayOfTheWeek("raja");
		System.out.println(msg);
		
		//close container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main() (end)");
	 	
	}

}








