package com.constructor;

//import com.home.page.HomePage;

public class Cat extends Animal {

	String PrefferdFood;
	
	public Cat(int age,String name) {
		super.age=age;
		super.name="fido";
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("cat is eating");
	}
	
	
	
}
