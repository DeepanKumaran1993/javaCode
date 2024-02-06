package com.home.page;

import java.util.Arrays;
import java.util.List;

import java.util.function.*;
import java.util.stream.Stream;

public class Ternary_Operator {

	
	
	public static void main(String[] args) {
	
		int year=2006;
		boolean result=((year%4==0&&year/4!=0)?true:false);
		System.out.println(result);
		
		
		
		
		List <Integer> num=Arrays.asList(1,2,3,4,5,6,7,8);
		
//		Consumer<Integer> con=t->System.out.println(t);
//		Stream<Integer> col= num.stream().filter(n->n%2==0).map(n->n*2).sorted();
//		col.forEach(e->System.out.println(e));
		
		num.stream().filter(s->s%2==0).sorted().forEach(s->System.out.println(s));
		System.out.println(n3);
		num.forEach(con);
		
		
		
	}
	
}
