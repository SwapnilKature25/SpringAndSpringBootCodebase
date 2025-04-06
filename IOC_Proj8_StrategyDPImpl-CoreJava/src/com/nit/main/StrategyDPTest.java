package com.nit.main;

import com.nit.comps.Flipkart;
import com.nit.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//get target class obj ref from factory pattern
		Flipkart fpkt = FlipkartFactory.getInstance("dhl");
		
		// invoke businness methods
		String msg=fpkt.shopping(new String[]{"dhoti-kurta","sweets","bhaje"}, 
								 new double[]{3000,500,200});
		System.out.println(msg);
		
		System.out.println("===============================");
		Flipkart fpkt2= FlipkartFactory.getInstance("dhl");
		System.out.println(fpkt.hashCode()+"  "+fpkt2.hashCode());
		
		
	}
}


/* FlipkartFactory.getInstance()
DHL.DHL()
Flipkart::0-param Constructor
Flipkart.setCourier()
Flipkart.shopping()
DHL.deliver()
[dhoti-kurta, sweets, bhaje] are purchased having prices [3000.0, 500.0, 200.0] , Bill AMount : 3700.0/-....185435 order id items will be delivered using DHL Courier Service
===============================
FlipkartFactory.getInstance()
DHL.DHL()
Flipkart::0-param Constructor
Flipkart.setCourier()
1175962212  918221580
 */