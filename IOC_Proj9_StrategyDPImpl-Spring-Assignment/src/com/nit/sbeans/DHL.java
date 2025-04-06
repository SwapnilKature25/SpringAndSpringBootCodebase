package com.nit.sbeans;
// DHL.java (Dependent class 3)

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements ICourier
{
	public DHL()
	{
		System.out.println("DHL.DHL()");
	}

	@Override
	public String deliver(int oid)
	{
		System.out.println("DHL.deliver()");
		return oid+" order id items will be delivered using DHL Courier Service";
	}
	
}
