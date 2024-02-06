package com.home.page;

public class Dog<T> {
	T bark;
	
	void bark(T time) {
		bark=time;
		for(int i=0;i<(int)bark;i++) {
		
			System.out.println("bow bow");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog<Integer> pup=new Dog<>();
			pup.bark(12);
		
	}

}
