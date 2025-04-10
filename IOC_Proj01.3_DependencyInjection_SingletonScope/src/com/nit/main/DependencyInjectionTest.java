package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.WishMessageGenerator;
import com.nit.ston.Printer;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		/*
		// get spring bean class obj ref
		WishMessageGenerator wmg1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg2=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg3=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg1.hashCode()+" "+wmg2.hashCode()+" "+wmg3.hashCode());
		
		System.out.println("wmg1==wmg2"+(wmg1==wmg2));
		System.out.println("wmg1==wmg3"+(wmg1==wmg3));
		System.out.println("wmg2==wmg3"+(wmg2==wmg3));
		
		
		System.out.println("===========================");
		Printer prn1 = ctx.getBean("prn",Printer.class);
		Printer prn2= ctx.getBean("prn",Printer.class);
		System.out.println(prn1.hashCode()+"  "+prn2.hashCode());
		
		Printer prn3 = ctx.getBean("prn1",Printer.class);
		Printer prn4= ctx.getBean("prn1",Printer.class);
		System.out.println(prn3.hashCode()+"  "+prn4.hashCode());
		*/
		//close IOC container
		ctx.close();
		
	}
}


/*
WishMessageGenerator.setTime()
WishMessageGenerator.setDate()
1224347463 1224347463 1224347463
wmg1==wmg2true
wmg1==wmg3true
wmg2==wmg3true


 // using ston class printer
WishMessageGenerator.setTime()
WishMessageGenerator.setDate()
Printer::0-param constructor
1791045777 1791045777 1791045777
wmg1==wmg2true
wmg1==wmg3true
wmg2==wmg3true
===========================
1580297332  1580297332
1831477404  1831477404


/ after enabling factory-method pattern
WishMessageGenerator.setTime()
WishMessageGenerator.setDate()
Printer::0-param constructor
1791045777 1791045777 1791045777
wmg1==wmg2true
wmg1==wmg3true
wmg2==wmg3true
===========================
1580297332  1580297332
1580297332  1580297332


WishMessageGenerator.setTime()
WishMessageGenerator.setDate()
Printer::0-param constructor


WishMessageGenerator.setTime()
WishMessageGenerator.setDate()


 
 */
