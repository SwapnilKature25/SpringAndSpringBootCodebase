package com.nit.sbeans;
// BlueDart.java (Dependent class 2)

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourier
{
	public BlueDart()
	{
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid)
	{
		System.out.println("BlueDart.deliver()");
		return oid+" order id items will be delivered using BlueDart Courier Service";
	}
	
}
