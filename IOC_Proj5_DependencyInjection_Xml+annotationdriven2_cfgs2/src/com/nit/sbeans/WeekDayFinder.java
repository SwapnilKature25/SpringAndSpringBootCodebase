package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class WeekDayFinder {
	private LocalDate day; 
	
	public WeekDayFinder()
	{
	}
	
	@Autowired
	public void setDay(LocalDate day)
	{
		this.day = day;
	}
	
	public String showWeekDay() {
		String days = day.getDayOfWeek().toString();
		
		if(days.equalsIgnoreCase("saturaday") || days.equalsIgnoreCase("sunday"))
		{
			return "Today is "+days+",Enjoy Weekend...";
		}
		else {
			return "Today is "+days+",Enjoy working day...";
		}
	}
	
	
}		
