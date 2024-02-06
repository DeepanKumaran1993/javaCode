package com.practice;

class Child{
public void fun() {
		 System.out.println("in the child class");
	}
}

interface Hello{
	public void standered(int h);
	public void fun();
}



public class Helloworld extends Child implements Hello{

	public static int k ;

	public void fun() {
		System.out.println("in the helloworld class");
		k=34;
		
	}

	public Helloworld() {
		// TODO Auto-generated constructor stub
		k = 21;
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int number = 10;
//		Child l=new  Helloworld();
//		l.fun();
	//	fun();
	//	new Helloworld();
	//	System.out.println(k);
		
		
		
		
		
		String originalStr = "Hello";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
	//		System.out.println("before  "+reversedStr);
		  reversedStr = originalStr.charAt(i)+reversedStr  ;
//		  System.out.println("After  "+reversedStr);
		}

		System.out.println("Reversed string: "+ reversedStr);
	}

	@Override
	public void standered(int h) {
		// TODO Auto-generated method stub
		
	}

	// if,else nested if,nested ----conditon statement
	// for,while,do while,for-each,

}
