package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.DayFinder;

@SpringBootApplication
public class BootIocProj01DayFinderApplication {

	@Bean(name="date")
	LocalDate createLDate() {
		System.out.println("BootIocProj01DayFinderApplication.createLDate()");
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj01DayFinderApplication.class, args);
		DayFinder finder = ctx.getBean("df",DayFinder.class);
		String msg = finder.dayOfTheWeek();
		System.out.println(msg);
		((ConfigurableApplicationContext) ctx).close();
	}

}
