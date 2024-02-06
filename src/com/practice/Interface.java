package com.practice;

interface Run {
	default void run() {
		int l = 12;
		System.out.println("controlled by interface");
	}

	static void gun() {
		System.out.println("in the static interface ");
	}

	void jain();
}
interface Runq {
	default void run() {
		int l = 12;
		System.out.println("controlled by interface");
	}

	static void gun() {
		System.out.println("in the static interface ");
	}

	void jain();
}

abstract class Hen {

	abstract void run1();

	public void sound() {
		System.out.println("hena");
	}

}
abstract class Hen1 {

	abstract void run1();

	public void sound() {
		System.out.println("hena");
	}

}

public class Interface extends Hen implements Run,Runq {

	@Override
	void run1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void jain() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Run.super.run();
	}

	public static void main(String[] args) {
		Interface n = new Interface();
		n.run();
		Run.gun();
		conver();
	}
	//ayothi brain
	public static void conver() {
		String Name="hh          Ayothi Ramen";
		String new1="";
		System.out.println(Name.replace(" ", ""));
		for(int i=0;i<Name.length();i++) {
			char c=Name.charAt(i);
			if(!Character.isWhitespace(c)) {
				new1+=c;
			}
		}
		System.out.println(new1+"k");
	}

}
