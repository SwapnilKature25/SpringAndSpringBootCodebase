package com.nit.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//has-A property (Composition)
	private ICourier courier;
	
	public Flipkart()
	{
		System.out.println("Flipkart::0-param Constructor");
	}
	
	//setter method for setter injection
	public void setCourier(ICourier courier)
	{
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
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
