package com.nit.sbeans;

import org.springframework.stereotype.Component;

// DTDC.java (Dependent class 1)

@Component("dtdc")
public class DTDC implements ICourier
{
	public DTDC()
	{
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid)
	{
		System.out.println("DTDC.deliver()");
		return oid+" order id items will be delivered using DTDC Courier Service";
	}
	
}
