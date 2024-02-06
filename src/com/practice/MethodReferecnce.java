package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferecnce {

	public static void main(String[] args) {

		MethodReferecnce d = new MethodReferecnce();
		BiFunction<Integer, Integer, Integer> bifun = d::sum;
		// System.out.println(bifun.apply(12, 32));
// appliying bi-Function to a method parameter
		MethodReger k = new MethodReger();
		k.print1(bifun);

		List<Integer> integerList = Arrays.asList(4, 5, 1, 7, 2, 722, 211, 111);

		// integerList.sort((o1, o2) ->o2.compareTo(o1) );
		integerList.sort(Integer::compare);
		// Collections.reverseOrder();

		System.out.println(integerList);
		
		SpellChecker.spellchecker();

	}

	public Integer sum(int i, int j) {
		return i * j;

	}
}

class MethodReger {
	int i = 0;

	MethodReger() {
		i = 23;
		System.out.println(i);
	}

	public void print1(BiFunction<Integer, Integer, Integer> functionBi) {

		System.out.println(functionBi.apply(12, 534));
	}
}





class SpellChecker{
	
	public  static void spellchecker() {
		String word="deepan attending the interview process";
		Set<Integer> newhash=new HashSet<Integer>();
		char[] arr=word.replaceAll(" ","").toCharArray();
		for(char f:arr) {
			
			System.out.println(f);
		//	System.out.println((int)f);
			//newhash.add((int)f);
		}
	
		
		
		
		
		
		
	}
}

//Java Program to illustrate using super
//many number of times

//class Parent {
//	// instance variable
//	int a = 36;
//
//	// static variable
//	static float x = 12.2f;
//}
//
//class Base extends Parent {
//	void GFG() {
//		// referring super class(i.e, class Parent)
//		// instance variable(i.e, a)
//		super.a = 1;
//		System.out.println(a);
//
//		// referring super class(i.e, class Parent)
//		// static variable(i.e, x)
//		super.x = 60.3f;
//
//		System.out.println(x);
//	}
//	public static void main(String[] args)
//	{
//		new Base().GFG();
//	}
//}