package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class Agilsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ddddeeeeepppppan is apttendings an interview";

		int o = 0;
		for (int i = 0; i <= name.length() - 1; i++) {
			// System.out.println(name.charAt(i));
			for (int j = 0; j < name.length() - 1; j++) {

				if (i != j) {
					if (name.charAt(i) == name.charAt(j)) {
						o = 1;
						break;
					}
				}

			}
			if (o == 0)
				System.out.print( name.charAt(i));

			o = 0;
		}

		Consumer<List<Integer>> cons = num -> {
			for (int i = 0; i < num.size(); i++) {
				num.set(i, 2 * num.get(i));
			}

		};

//		Consumer<List<Integer>> toprint = list -> list.stream().forEach(e -> System.out.println(e));
//
//		List<Integer> number = new ArrayList<Integer>();
//		number.add(1);
//		number.add(2);
//		number.add(3);
//		
//		cons.
		
		
//		cons.accept(number);
//		toprint.accept(number);

		// Consumer<List<Integer>>
		// toPrint=number.stream().forEach(e->System.err.println(e));

	}
}
