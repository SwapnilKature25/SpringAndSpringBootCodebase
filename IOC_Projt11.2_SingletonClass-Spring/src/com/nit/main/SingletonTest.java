package com.nit.main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.WishMessageGenerator;

// DependencyInjectionTest.java  (main class)

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		// create the IOC Container 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target spring bean class obj
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator1 = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(generator.hashCode()+" "+generator1.hashCode()+" "+generator2.hashCode());
		
		System.out.println("generator == generator1 ?"+(generator==generator1));
		System.out.println("generator1 == generator2 ?"+(generator1==generator2));
		
		
		System.out.println("==============================");
		LocalDateTime ldt1= ctx.getBean("dt",LocalDateTime.class);
		LocalDateTime ldt2= ctx.getBean("dt",LocalDateTime.class);
		System.out.println(ldt1.hashCode()+" "+ldt2.hashCode());
		
		
		System.out.println("==============================");
		LocalDateTime ldt3= ctx.getBean("dt",LocalDateTime.class);
		LocalDateTime ldt4= ctx.getBean("dt",LocalDateTime.class);
		System.out.println(ldt3.hashCode()+" "+ldt4.hashCode());
		
		
		
		// invoke the b.method
		String msg = generator.showMessageOnDayOfTheWeek("raja");
		System.out.println(msg);
		
		
		System.out.println("==============================");
//		System.out.println("The default bean id is :: "+Arrays.toString(ctx.getBeanDefinitionNames()));
		
		//close container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main() (end)");
	 	
	}

}


 
/*
    
 */


