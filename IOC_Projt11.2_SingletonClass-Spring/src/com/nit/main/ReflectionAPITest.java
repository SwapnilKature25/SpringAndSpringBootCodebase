package com.nit.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.format.Printer;

public class ReflectionAPITest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c1=Printer.class;
		
		//get all constructors of the class
		Constructor cons[] = c1.getDeclaredConstructors();
		
		// give access to private construcotr
		cons[0].setAccessible(true);
		
		// create object by using accessed constructor
		Object obj=cons[0].newInstance();
		Printer p = (Printer)obj;
		System.out.println("p obj class name : "+p.getClass());
		
	}
}
