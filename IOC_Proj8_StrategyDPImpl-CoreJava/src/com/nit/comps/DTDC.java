package com.nit.comps;
// DTDC.java (Dependent class 1)
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
