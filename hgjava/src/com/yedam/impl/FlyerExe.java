package com.yedam.impl;

public class FlyerExe {
	public static void main(String[] args) {
		Flyer flyer = new Airplane();
		flyer.takeOFF();
		
//		flyer = new Helocopter();
//		flyer.takeOFF();

		flyer = new Seaplane();
		flyer.takeOFF();
		
		
		Driver driver = new Driver();
		driver.drive(flyer);
		
		
	}
}
