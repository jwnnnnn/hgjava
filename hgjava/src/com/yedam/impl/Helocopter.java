package com.yedam.impl;

public class Helocopter extends Airplane {
	// Flyer 를 오버라이딩. <<  값을 다 넣어야함 . 
	@Override
	public void takeOFF() {
		System.out.println("[Helocopter1] - 이륙.");
	}

	@Override
	public void fly() {
		System.out.println("[Helocopter1] - 비횅.");
	}

	@Override
	public void land() {
		System.out.println("[Helocopter1] - 착륙.");
	}
}
