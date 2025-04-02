package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//creste IOC container
		
		/*
		 Diff btw FileSystemXmlApplicationContext and ClassPathXmlApplicationContext
		 
		FileSystemXmlApplicationContext ctx = 
//				new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationcontext.xml");
//				relative path of spring bean cfg file (respect to project)
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("C:\\Users\\swapn\\01CJ\\Spring_SpringBoot_Projects\\IOC_Proj01_DependencyInjection\\src\\com\\nit\\cfgs\\applicationcontext.xml");
//				absolute path of a file (direct from root folder)
		*/
		
		
//		ClassPathXmlApplicationContext ctx = 
//				spring bean cfg file with name and location
//				new ClassPathXmlApplicationContext("com/nit/cfgs/applicationcontext.xml");
		
//		no need of package name bcoz it is added in buildpath/ classpath of project
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		
		// get target spring bean class obj ref
		Object obj = ctx.getBean("wmg");	
		
		// default bean id concept in xml driven cfgs - session 12
//		Object obj = ctx.getBean("com.nit.sbeans.WishMessageGenerator#0");
//		Object obj2 = ctx.getBean("com.nit.sbeans.WishMessageGenerator#1");
//		
//		System.out.println(obj.hashCode()+"   "+obj2.hashCode());
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		
		// invoke business methods
		String msg = generator.showWishMessage("raja");
		System.out.println("result : "+msg);
		
		//close IOC container
		ctx.close();
		
	}
}


/* WishMessageGenerator.setTime()
WishMessageGenerator.setDate()
WishMessageGenerator.showWishMessage()
result : Good Night : raja
 */
