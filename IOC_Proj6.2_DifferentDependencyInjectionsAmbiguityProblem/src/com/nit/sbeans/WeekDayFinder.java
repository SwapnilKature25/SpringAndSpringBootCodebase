package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// WeekDayFinder.java (target spring bean class)
@Component("wdf")
public class WeekDayFinder {
	
	// fields for field injection
	@Autowired    // field injection  = here autowired kept on field that's why it is field injection
	@Qualifier("ldate2")
	private LocalDate date;   // Has-A property
	@Autowired
	private LocalTime time;    
	
//	public WeekDayFinder()
//	{
//		System.out.println("WeekDayFinder:: 0-param constructor");
//	}
	
	// In constructor on which parameter ambiguity problem is coming before that we have to place Qualifier bean because in other injection there will be only one parameter but in constructor there can be any no. of parameters
	// constructor injection
	@Autowired
	public WeekDayFinder(@Qualifier("ldate")LocalDate date,LocalTime time)
	{
		System.out.println("WeekDayFinder:: 2-param constructor ::constructor injection");
		this.date= date;
		this.time = time;
	}
	
	/*    ---invalid 
	@Autowired
	public WeekDayFinder(LocalDate date)
	{
		System.out.println("WeekDayFinder:: 1-param constructor");
		this.date= date;
	}
	*/
	
	
	
	// Arbitrary method for Arbitrary injection
	@Autowired
	@Qualifier("ldate4")
	public void assignData(LocalDate date)
	{
		System.out.println("WeekDayFinder.assignData():: Arbitrary injection");
		this.date = date;
	}
	
	/*
	@Autowired
	public void putDate(LocalTime time)
	{
		System.out.println("WeekDayFinder.putDate()");
		this.time = time;
	}
	*/
	
	
	
	// setter method for setter injection
	
	@Autowired
	@Qualifier("ldate3")
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate():: setter injection");
		this.date = date;
	}
	
	/*
	@Autowired
	public void setTime(LocalTime time) {
		System.out.println("WeekDayFinder.setTime()");
		this.time = time;
	}
	
	*/
	
	
	
	
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



/*
 * DependencyInjectionTest.main() (start)
AppConfig.createLDate1()
AppConfig.createTime()
WeekDayFinder:: 2-param constructor ::constructor injection
AppConfig.createLDate2()
AppConfig.createLDate4()
WeekDayFinder.assignData():: Arbitrary injection
AppConfig.createLDate3()
WeekDayFinder.setDate():: setter injection
WeekDayFinder.showMessageOnDayOfTheWeek()date : 2003-03-24	time : 15:59:42.614217300
Work Hard :: raja
DependencyInjectionTest.main() (end)

 * */
