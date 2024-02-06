package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = Arrays.asList(2, 4, 1, 512, 123, 524, 34);

		int result = num.stream().filter(t -> t % 2 == 0).map(t -> t * 2).reduce(5, (c, e) -> c + e);

		System.out.println(result);

//		Consumer<Integer> con = t -> {
//			if (t % 2 != 0)
//				System.out.println(t);
//			else
//				System.out.println("even number " + t);
//		};
//
//		num.forEach(con);

	}

}
