package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// WeekDayFinder.java (target spring bean class)
@Component("wdf")
public class WeekDayFinder {
	
	@Autowired
	@Qualifier("ldate2")
	private LocalDate date;   // Has-A property
	@Autowired
	private LocalTime time;    
	
	
	
	
	
	
	// business method
	public String showMessageOnDayOfTheWeek(String user) {
		System.out.println("WeekDayFinder.showMessageOnDayOfTheWeek()"+"date : "+date+"\ttime : "+time);
		// get current week day number
		int wno = date.getDayOfWeek().getValue();
		if(wno >=1 && wno <= 5)
			return "Work Hard :: "+user;
		else
			return "Relax :: "+user;
	}

}


