package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.practice.FucntionalProgram.Person;

public class FucntionalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int catch1 = increment.apply(12);
		System.out.println(catch1);

//		int i[] = { 3, 4 };
//		int k[] = { 7, 8 };
//		Person.cal(new int[] { 3, 4, 6 }, new int[] { 5, 6, 7 });
		// FunctionalProgramming.Person p=new FunctionalProgramming.Person()
		FucntionalProgram.Person p = new FucntionalProgram.Person();
		p.setName("jason");
		System.out.println(p.Name);
		 int i=06;
		 short k=23;
   		 int i9= i+k;
		
		List<Integer> list=new ArrayList<>();
		list.add(213);
		list.add(531);
		list.add(948);
		list.add(138);
		
		
		Comparator<Integer> listcom=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1%10>=o2%10)
					return -1;
				else
					return 1;
			}
		};
		Collections.sort(list,listcom);
		System.out.println(list);
		

	}

	static Function<Integer, Integer> increment = number -> number * number + 1;

	private String name = "fin";

	static class Person {
		Integer mobNumber;
		String Name;

		public void setMobNumber(Integer mobNumber) {
			this.mobNumber = mobNumber;
		}

		public void setName(String name) {
			Name = name;
		}

		static void cal(int[] a, int[] b) {
			Arrays.stream(a).forEach(System.out::println);// +" "+b);
			Arrays.stream(b).forEach(System.out::println);
		}

	}
}


class Den{
	FucntionalProgram.Person p2=new FucntionalProgram.Person();
	

}
