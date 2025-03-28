package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("C:\\Users\\swapn\\01CJ\\Spring_SpringBoot_Projects\\IOC_Proj02_DependencyInjection_Assignment\\src\\com\\nit\\cfgs\\applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");		
		
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		
		String msg = generator.showSeasonMessage();
		System.out.println("Enjoy "+msg+" season...");
		
		ctx.close();
	}
}
