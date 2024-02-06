package com.home.page;

class Run {
	int a, b, c;

	Run(int a, int b) {

		this.a = a;
		this.b = b;

	}

	Run(Run r) {
		// TODO Auto-generated constructor stub
		a = r.a;
		b = r.b;
		c = r.c;

	}

	void printItself() {
		c = a + b;
		System.out.println("value of " + a + " + " + b + " = " + c);
	}

}

class Base {

	int number;

	Base(int a) {
		this.number = a;
	}

	Base increByTen() {
		Base obj = new Base(number + 200);
		return obj;
	}
}

public class ObjectCloning {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run r = new Run(10, 421);
		r.printItself();
		Run clone_run = new Run(r);
		clone_run.printItself();
		Base base = new Base(1000);
		Base base2;
		base2 = base.increByTen();
		System.out.println(base.number);
		System.out.println(base2.number);

	}

}
