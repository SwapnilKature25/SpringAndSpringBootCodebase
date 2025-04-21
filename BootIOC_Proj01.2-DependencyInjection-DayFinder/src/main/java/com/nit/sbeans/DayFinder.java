package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("df")
public class DayFinder {
	
	@Autowired
	private LocalDate days;
	
	// b.method
	public String dayOfTheWeek()
	{
		int day = days.getDayOfWeek().getValue();
		
		if(day >= 1 && day <=5)
			return "Happy Working hours";
		else 
			return "Happy weekends";
	}
	
}
