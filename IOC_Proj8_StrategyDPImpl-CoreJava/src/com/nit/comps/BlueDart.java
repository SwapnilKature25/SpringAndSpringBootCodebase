package com.nit.comps;
// BlueDart.java (Dependent class 2)
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
