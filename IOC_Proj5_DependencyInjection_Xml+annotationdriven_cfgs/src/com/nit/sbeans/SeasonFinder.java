package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private LocalDate date;  // has a property Composition
	
	public SeasonFinder()
	{
		System.out.println("SeasonFinder.SeasonFinder()");
	}
	
	// setter method for setter injection
	@Autowired
	public void setDate(LocalDate date)
	{
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}
	
	// b. method
	public String showSeasonName() {
		System.out.println("SeasonFinder.showSeasonName()");
		int month = date.getMonthValue();
		
		if(month >=3 && month <= 6)
		{
			return "Summer season";
		}
		else if(month >=7 && month <= 10)
		{
			return "Rainy season";
		}
		else {
			return "Winter season";
		}
	}
	
	
}		
