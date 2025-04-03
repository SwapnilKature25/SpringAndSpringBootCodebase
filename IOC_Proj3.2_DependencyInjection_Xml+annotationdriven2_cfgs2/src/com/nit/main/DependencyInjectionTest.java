package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("C:\\Users\\swapn\\01CJ\\Spring_SpringBoot_Projects\\IOC_Proj6_DependencyInjection_Xml+annotationdriven2_cfgs2\\src\\com\\nit\\cfgs\\applicationcontext.xml");

		Object obj = ctx.getBean("sf");
		WeekDayFinder sf =(WeekDayFinder) obj;
	
		try
		{
			String msg = sf.showWeekDay();
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		ctx.close();
		
	}

}


/* Today is FRIDAY,Enjoy working day...
 */









