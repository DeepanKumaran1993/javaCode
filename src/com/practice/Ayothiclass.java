package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ayothiclass implements Car, Bus {

	public static void main(String[] args) {

		Car k = new Ayothiclass();
		Bus.engine();
		k.engine();
		chare();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void chare() {
		// String k="deepan attending the interview in agilsys";

		int missing[] = { 4, 1, 4, 48, 146, 101, 82 };
		Arrays.sort(missing);

		// Arrays.stream(missing).forEach(s->System.out.println(s));

		Set<Integer> filteredNumber = new HashSet<Integer>();
		Arrays.stream(missing).forEach(f -> filteredNumber.add(f));

		// filteredNumber.stream().forEach(s->System.out.println(s));

		System.out.println(missing[missing.length - 1]);
		int i = missing[0];
		while (i <= missing[missing.length - 1]) {
			// System.out.println(i);
			if (filteredNumber.contains(i)) {
				i = i + 1;
				// System.out.println("true");
				continue;
			}
			System.out.println(i);

			i = i + 1;
		}

	}
}

interface Car {
	public void run();

	default void engine() {
		System.out.println("durrrrrr");
	}
}

interface Bus {
	public void run();

	static void engine() {
		System.out.println("durrrrrr1");
	}
}
