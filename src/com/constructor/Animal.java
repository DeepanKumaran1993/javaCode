																																																																																																																																																																																																																																																																																																																																																																																	package com.constructor;

public class Animal {
	
	int age;String name;
	
	Animal(){}
	Animal(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	public void pritableAnimal() {
		System.out.println("name::"+name+"age::"+age);
	}
	
	public void eat() {
		System.out.println("munch munch");
	}

}
