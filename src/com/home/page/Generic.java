package com.home.page;

import java.io.Serializable;

public class Generic<T extends Comparable<T>> {

	T thingToPrint;
	
	public void printable( T print) {
		
		thingToPrint=print;	
	}
	public void print() {
		System.out.println("this in printable method ->"+thingToPrint);
	}
	

}
