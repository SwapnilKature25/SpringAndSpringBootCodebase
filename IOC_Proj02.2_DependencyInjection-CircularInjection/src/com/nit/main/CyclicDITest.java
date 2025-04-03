package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.A;
import com.nit.sbeans.B;

public class CyclicDITest {
	public static void main(String[] args) {
		 //creste IOC container
		 FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("C:\\Users\\swapn\\01CJ\\Spring_SpringBoot_Projects\\IOC_Proj04_CircularInjection\\src\\com\\nit\\cfgs\\applicationcontext.xml");
		
		 // get target spring bean class obj ref
		 A a1 = ctx.getBean("a1",A.class);	
		 System.out.println(a1);
		 
		 // get target spring bean class obj ref
		 B b1 = ctx.getBean("b1",B.class);
		 System.out.println(b1);
		 
		 //close IOC container
		 ctx.close();
		
	}
}

/*  WishMessageGenerator::2-args constructor
WishMessageGenerator.showWishMessage()22:31:21.435082100   2025-03-19
result : Good Night : raja

 */