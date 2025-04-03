package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("C:\\Users\\swapn\\01CJ\\Spring_SpringBoot_Projects\\IOC_Proj5_DependencyInjection_Xml+annotationdriven_cfgs\\src\\com\\nit\\cfgs\\applicationcontext.xml");

		// get target spring bean class obj ref
		Object obj = ctx.getBean("sf");
		SeasonFinder sf =(SeasonFinder) obj;
	
		//invoke the b.method
		try
		{
			String msg = sf.showSeasonName();
			System.out.println("Season name :: "+ msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		ctx.close();
		
	}

}


/* SeasonFinder.SeasonFinder()
SeasonFinder.setDate()
SeasonFinder.showSeasonName()
Season name :: Summer season
 */
