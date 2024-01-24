package com.yedam.impl;

// 에어플래인은  Flyer 에 가진 메소드를 다 작성해줘야함.
public class Airplane implements Flyer {

	@Override
	public void takeOFF() {
		System.out.println("[Airplane1] - 이륙.");
	}

	@Override
	public void fly() {
		System.out.println("[Airplane1] - 비행.");
	}

	@Override
	public void land() {
		System.out.println("[Airplane1] = 착륙.");
	}

}
