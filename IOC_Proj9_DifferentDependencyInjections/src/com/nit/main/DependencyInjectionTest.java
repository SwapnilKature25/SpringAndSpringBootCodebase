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

/* DependencyInjectionTest.main() (start)
AppConfig::0-param constructor
AppConfig.createLDate2()
AppConfig.createTime()
AppConfig.createLDate()
AppConfig.createLDate3()
WeekDayFinder.showMessageOnDayOfTheWeek()date : 2002-02-12	time : 18:33:58.662903
Work Hard :: raja
DependencyInjectionTest.main() (end)
 */







