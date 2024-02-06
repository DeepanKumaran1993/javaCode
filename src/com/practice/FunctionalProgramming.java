package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalProgramming {

	public static void main(String[] args) {

		List<Person> people = List.of(new Person("Murugan", Gender.MALE), new Person("Manivasan", Gender.MALE),
				new Person("Ayothi", Gender.MALE), new Person("Gayathri", Gender.FEMALE),
				new Person("ashwini", Gender.FEMALE));

		List<Person> female = new ArrayList<>();

		Function<Integer, Double> function = p -> p * 3.14d;
		Function<Double, Integer> RoundOf = p -> (int) (p * 20);
		Function<Integer, Integer> square = function.andThen(RoundOf);

		BiFunction<Integer, Integer, Double> gravity_cal = (i, j) -> {

			return Double.valueOf((i * j) * 9.8);
		};

		String number = "1010";
		System.out.println(Integer.parseInt(number, 3));
		System.out.println(gravity_cal.apply(1, 2));
		System.out.println(square.apply(10));

		System.out.println(function.apply(10));

//		for(Person person:people) {
//			if(Gender.FEMALE.equals(person.gender)) {
//				female.add(person);
//			}
//		}
//		for(Person person:female) {
//			System.out.println(person);
//		}

		List<Person> female2 = people.stream().filter(person -> person.gender.equals(Gender.FEMALE))
				.collect(Collectors.toList());

		female2.forEach(System.out::println);

		// collect female from person using fuctional
//		people.forEach(e->{
//			if(e.gender.equals(Gender.FEMALE)) {
//				female.add(new Person(e.name, e.gender));
//			}
//		});
//		System.out.println(female.size());
//	
//		female.stream().forEach(System.out::println);
	}

	static class Person implements Comparable<Person> {
		private String name;
		private Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

		@Override
		public int compareTo(Person o) {
			// TODO Auto-generated method stub
			if (this.name.length() < o.name.length()) {
				return 1;
			}
			return -1;
		}

	}

	enum Gender {
		MALE, FEMALE
	}

}
