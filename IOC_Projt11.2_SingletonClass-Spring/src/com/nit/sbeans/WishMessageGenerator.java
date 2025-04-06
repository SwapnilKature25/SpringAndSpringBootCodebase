package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// WishMessageGenerator.java (target spring bean class)

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {
	
	@Autowired 
	@Qualifier("dt")
	private LocalDate date;   // Has-A property
	 
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
	
	// business method
	public String showMessageOnDayOfTheWeek(String user) {
		System.out.println("WishMessageGenerator.showMessageOnDayOfTheWeek()");
		// get current week day number
		int wno = date.getDayOfWeek().getValue();
		if(wno >=1 && wno <= 5)
			return "Work Hard :: "+user;
		else
			return "Relax :: "+user;
	}
	
	
}		
