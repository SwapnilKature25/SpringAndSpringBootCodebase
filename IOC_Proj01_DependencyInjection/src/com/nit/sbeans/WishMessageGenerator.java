package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	// Has-A property
	private LocalTime time;
	private LocalDate date;
	
	
	//setter method for setter injection 
	public void setTime(LocalTime time)
	{
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}
	
	public void  setDate(LocalDate date)
	{
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;	
	}
	
	//b.method
	
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()");
		
		//get current hour of the day
		int hour = time.getHour();
		
		//generate the wish message
		if(hour<12)
		{
			return "Good Morning : "+user;
		}
		else if(hour<16)
		{
			return "Good Afternoon : "+user;
		}
		else if(hour<18)
		{
			return "Good Evening : "+user;
		}
		else
			return "Good Night : "+user;
	}
	
}
