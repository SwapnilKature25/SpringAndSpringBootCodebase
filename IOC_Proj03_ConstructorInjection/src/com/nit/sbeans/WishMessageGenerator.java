package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	// Has-A property
	private LocalTime time;
	private LocalDate date;
	
	
	//Parameterized constructor for constructor injection
	
	public WishMessageGenerator(LocalTime time, LocalDate date)
	{
		this.time = time;
		this.date = date;
		System.out.println("WishMessageGenerator::2-args constructor");
	}
	
	
	//b.method
	
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.showWishMessage()"+time+"   "+date);
			
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
