package com.nit.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;

public class I18nTestApp {
	
	public static void main(String[] args) {
		
		//create IOC container
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// read locale information from the enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter language code : ");
		String lang = sc.next();
		System.out.println("Enter Country code : ");
		String country = sc.next();
		
		// create locale obj having code and country code
		Locale locale = new Locale(lang,country);   //deprecated in 19v
//		Locale locale = Locale.of(lang, country);     //alternate
		 
		
		// get messages from locale specific properties
		String msg1 = ctx.getMessage("welcome.msg",new Object[]{"raja"}, "msg1", locale);  // the Object[] of the ctx.getMessage(--) method can pass {0} to {4} argument values only i.e 5 arg
		String msg2 = ctx.getMessage("goodbye.msg",new Object[]{}, "msg2", locale);
		String msg3 = ctx.getMessage("wishing.msg",new Object[]{}, "msg3", locale);
		
		System.out.println(msg1+"......"+msg2+"......"+msg3);
		
		ctx.close();
		sc.close();
	}
}
