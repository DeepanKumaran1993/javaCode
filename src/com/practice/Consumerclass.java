package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class Consumerclass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BiConsumer<Customer, Boolean> biconsumer = (customer, auth) -> System.out.println(auth ? "print" : "no print");

		biconsumer.accept(new Customer(" john", 32), true);

		Customer pcdoc = new Customer("deepan", 73);

		printCustomer(pcdoc);
		printConsumer_boolean(pcdoc, true);

		Queue<String> quee = new PriorityQueue<>();
		quee.offer("send");
		List<Integer> listOfNumber = List.of(2, 4, 5, 6, 7, 8, 9);
		Integer[] arrays = listOfNumber.stream().toArray(Integer[]::new);

		System.out.println("Stream print after ");

		List<Integer> lop = listOfNumber.stream().filter(e -> e % 2 == 0).filter(e -> e > 4)
				.collect(Collectors.toList());

		List<Integer> squaredOddNumbers = listOfNumber.stream().filter(e -> e % 2 == 2 && e > 4).map(e -> e * e)
				.collect(Collectors.toList());
		List<String > namelist=List.of("deepaa","kumaran","rajan","chandran","muthutamil","vishnu prasad","san","vignesh");
		
		String [] namearray=namelist.stream().filter(e->e.length()>6).map(e->e.toUpperCase()).toArray(String[] :: new);
		
		for (String string : namearray) {
			System.err.println(string);
		}
		int length=Arrays.stream(namearray.length).sum();
		
		
		
		
		
		
		
		
		
		
		
		
		
		squaredOddNumbers.forEach(System.out::print);
		lop.forEach(System.out::println);
//		// Create a IntConsumer Instance
//		IntConsumer display = a -> System.out.println(a * 5);
//		IntConsumer mul = a -> a *= 11;
//
//		// Using andThen() method
//		IntConsumer composite = mul.andThen(display);
//		composite.accept(3);

	}

	public static void printCustomer(Customer customer) {
		System.out.println("welcome " + customer.name + " phone number ->" + customer.age);
	}

	public static void printConsumer_boolean(Customer customer, boolean value) {
		System.out.print("welcome " + customer.name);

		System.out.println(value ? " phone number ->" + customer.age : " phone number ->XXXXXX");
	}

	static class Customer {

		public Customer(String name, Integer age) {

			this.name = name;
			this.age = age;

		}

		private String name;
		private Integer age;

		@Override
		public String toString() {
			return "Customer [name=" + name + ", age=" + age + "]";
		}

	}
}
