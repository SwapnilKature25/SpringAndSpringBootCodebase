package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.VotingEligibilityCheck;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		
		// create IOC Container
		AnnotationConfigApplicationContext ctx=
					new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get spring bean class obj ref
		VotingEligibilityCheck vec = ctx.getBean("vec",VotingEligibilityCheck.class);
		
		// invoke the b.method
		try
		{
			String msg = vec.verifyVotingEligibility();
			System.  out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// close IOC container
		ctx.close();
	}
}

/*  VotingEligibilityCheck:: static block
VotingEligibilityCheck::0-param constructor
VotingEligibilityCheck.myInit()
VotingEligibilityCheck.verifyVotingEligibility() (B.method)
Mr/Miss/Mrs.raja u r eligible for voting --> verified on ::2025-04-10T22:41:40.508231500
VotingEligibilityCheck.myDestroy()


// if ctx not close
VotingEligibilityCheck:: static block
VotingEligibilityCheck::0-param constructor
VotingEligibilityCheck.myInit()
VotingEligibilityCheck.verifyVotingEligibility() (B.method)
Mr/Miss/Mrs.raja u r eligible for voting --> verified on ::2025-04-10T22:49:01.070112

  */