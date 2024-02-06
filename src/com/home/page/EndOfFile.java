package com.home.page;

import java.util.ArrayList;
import java.util.List;

public class EndOfFile <T>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print("hai bro in generic");
		print(223.3);
		print(03.333333333);	
		
		List<String> li=new ArrayList<String>();
		li.add("Sunday");
		li.add("Monday");

		printList(li);
		
		Hen j=new Hen();
		j.start();
	
	}
	
	
	
	
	public static <T> void print(T hash) {
		System.out.println(hash);
	}
	
	public static void printList( List<?> fun) {
		System.out.println(fun);
	}
	
}


class Hen extends Thread{
	
	public void ruhn() {
		System.out.println("hen");
	}
	
}