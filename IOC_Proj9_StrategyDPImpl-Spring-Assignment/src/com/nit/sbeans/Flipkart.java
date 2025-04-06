package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	//has-A property (Composition)
	@Autowired
	@Qualifier("dtdc")
	private ICourier courier;   //field injection
	
	public Flipkart()
	{
		System.out.println("Flipkart::0-param Constructor");
	}
	
	
	//b.method
	public String shopping(String items[], double prices[])
	{
		System.out.println("Flipkart.shopping()");
		double billAmt = 0;
		for(double p : prices)
		{
			billAmt+=p;
		}
		
		// generate Pseudo random number as order id
		int oid = new Random().nextInt(200000);
		
		//use courier service for delivery
		String msg = courier.deliver(oid);
		
		// prepare final message for customer
		String finalMsg = Arrays.toString(items)+" are purchased having prices "+
						  Arrays.toString(prices)+" , Bill AMount : "+billAmt+"/-...."+msg;	
		return finalMsg;
	}
}	
