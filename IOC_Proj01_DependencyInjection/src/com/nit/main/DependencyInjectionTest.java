package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		//creste IOC container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("C:\\Users\\swapn\\01CJ\\Spring_SpringBoot_Projects\\IOC_Proj01_DependencyInjection\\src\\com\\nit\\cfgs\\applicationcontext.xml");
//		new FileSystemXmlApplicationContext("com/nit/cfgs/applicationcontext.xml");
		
		// get target spring bean class obj ref
		Object obj = ctx.getBean("wmg");	
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		
		// invoke business methods
		String msg = generator.showWishMessage("raja");
		System.out.println("result : "+msg);
		
		//close IOC container
		ctx.close();
		
	}
}
