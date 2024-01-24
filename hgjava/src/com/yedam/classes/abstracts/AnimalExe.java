package com.yedam.classes.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
		Animal animal = null; // new Animal();  < //추상 클래스라 객체를 만들지 못함.
		animal = new Bird("제비"); // 애니멀이 받는 참조값에다 할당은 가능.
		animal.eat();
		animal.sleep();
		
		
		Bird bird = new Bird("참새"); // 자식클래스는 가능 .
		bird.eat(); //부모꺼
		bird.sleep(); //자기 자신꺼
	
		Dog dog = new Dog();
		
		Bird[] birds = new Bird[5]; //
		// birds[0] =dog ; 두개의 값이 달라 상속 x
		Animal[] animals = new Animal[10];
		animals[0] = bird;
		animals[1] = dog ;
		
	}
}
