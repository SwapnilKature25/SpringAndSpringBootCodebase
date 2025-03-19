package com.nit.sbeans;
// winter (December to February), summer (March to May), and monsoon (June to September). 
import java.time.LocalDate;

public class WishMessageGenerator {
	private LocalDate date;
	
	public void setDate(LocalDate date)
	{
		this.date = date ;
	}
	
	
	public String showSeasonMessage()
	{
		int month = date.getMonthValue();
		
		if(month ==12 && month <=2)
		{
			return "Winter";
		}
		else if(month > 2 && month<6)
		{
			return "Summer";
		}
		else {
			return "Monsoon";
		}
		
	}
	
	
}
