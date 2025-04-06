package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		// create IOC Container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get access to target spring bean class obj ref
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		
		//invoke b.method
		String msg = fpkt.shopping(new String[]{"pathani","kheer"}, new double[]{1500,300});
		System.out.println(msg);
		
		Flipkart fpkt2 = ctx.getBean("fpkt",Flipkart.class);
		System.out. println(fpkt.hashCode()+" "+fpkt2.hashCode() );    // same internal cache memory for both obj so hashcode also same
		
		ctx.close();
		
	}
}


/* BlueDart.BlueDart()
DHL.DHL()
DTDC.DTDC()
Flipkart::0-param Constructor
Flipkart.shopping()
DTDC.deliver()
[pathani, kheer] are purchased having prices [1500.0, 300.0] , Bill AMount : 1800.0/-....130422 order id items will be delivered using DTDC Courier Service
2041605291 2041605291
 */