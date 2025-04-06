package com.nit.test;

import com.nit.comps.Bike;
import com.nit.factory.BikeFactory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		Bike bike=BikeFactory.orderBike("standard");
		bike.drive();
		System.out.println("================================");
		Bike bike2=BikeFactory.orderBike("sports");
		bike2.drive();
		System.out.println("================================");
		Bike bike3=BikeFactory.orderBike("electric");
		bike3.drive();
		System.out.println("================================");
		Bike bike4=BikeFactory.orderBike("bullet");
		bike4.drive();
		
	}
}

/* StandardBike.drive()::driving StandardBike (bajaj discover)
================================
SportsBike.drive()::driving SportsBike (Kawasaki-Ninja)
================================
ElectricBike.drive()::driving ElectricBike (Ather Bike)
================================
BulletBike.drive()::driving BulletBike (Royal Enfield)
 */