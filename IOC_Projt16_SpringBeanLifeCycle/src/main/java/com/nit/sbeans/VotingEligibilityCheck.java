package com.nit.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vec")
public class VotingEligibilityCheck {
	@Value("${per.id}")
	private Integer id;	
	
	@Value("${per.name}")
	private String name;
	
	@Value("${per.age}")
	private Integer age;
	
	private LocalDateTime dov;   //  dov - date of verification
	
	static {
		System.out.println("VotingEligibilityCheck:: static block");
	}
	
	public VotingEligibilityCheck() {
		System.out.println("VotingEligibilityCheck::0-param constructor");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("VotingEligibilityCheck.myInit()");
		// initialize left over properties
		dov = LocalDateTime.now();
		// check whether age is injected with valid value or not
		 if(age<=0 || age>=120)
			 throw new IllegalArgumentException("Invalid age");
	}
	
	
	// b.method
	public String verifyVotingEligibility() 
	{
		System.out.println("VotingEligibilityCheck.verifyVotingEligibility() (B.method)");
		if(age>=18)
			return "Mr/Miss/Mrs."+name+" u r eligible for voting --> verified on ::"+dov;
		else 
			return "Mr/Miss/Mrs."+name+" u r not eligible for voting --> verified on ::"+dov;
		
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("VotingEligibilityCheck.myDestroy()");
		// nullify left over properties
		age =null;
		name =null;
		id = null;
		dov=null;
	}
	
	
}
