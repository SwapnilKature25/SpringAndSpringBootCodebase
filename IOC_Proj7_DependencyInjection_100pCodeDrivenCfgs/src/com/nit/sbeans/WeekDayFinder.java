package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// WeekDayFinder.java (target spring bean class)
@Component("wdf")
public class WeekDayFinder {
	
	@Autowired    // field injection  = here autowired kept on field that's why it is field injection
	private LocalDate date;   // Has-A property
	
	public WeekDayFinder()
	{
		System.out.println("WeekDayFinder:: 0-param constructor");
	}
	
	// business method
	public String showMessageOnDayOfTheWeek(String user) {
		System.out.println("WeekDayFinder.showMessageOnDayOfTheWeek()");
		// get current week day number
		int wno = date.getDayOfWeek().getValue();
		if(wno >=1 && wno <= 5)
			return "Work Hard :: "+user;
		else
			return "Relax :: "+user;
	}
	
	
}		
