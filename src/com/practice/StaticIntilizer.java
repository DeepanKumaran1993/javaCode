package com.practice;

class Sample {
	{
		System.out.println("instance  intilaizer block");
	}
	static {
		System.out.println("in static block");
	}

	Sample() {
		System.out.println("in constructor block");
	}
	
	void block() {
		System.out.println("in the normal block");
	}

}

@FunctionalInterface
interface Action {
	default void action() {
		System.out.println("enter");

	}
	
	static void action1() {
		System.out.println("ithu action madem");
	}
	
	int sum(int j);

}

public class StaticIntilizer implements Action {

	public static void main(String[] args) {

		Sample f = new Sample();
		f.block();
		StaticIntilizer k=new StaticIntilizer();
		k.action();
		Action action=(int x)->{
			System.out.println("functional inteferface");
			return x+x;
			};
		
		int b=9;
		int store=action.sum(b);
		System.err.println(store);
	}

	@Override
	public int sum(int j) {
		// TODO Auto-generated method stub
		return 2;
	}

}
