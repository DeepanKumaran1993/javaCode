package com.practice;

import java.util.Arrays;
import java.util.List;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name1="List";
		String name2=new String("List");
		   List<String> words = Arrays.asList("Java", "is", "fun", "and", "challenging");
		    int count = (int) words.stream()
		        .filter(word -> word.length() > 3)
		      //  .map(String::length)
		        .count();
		    System.out.println(count);
		
		
				}

}
