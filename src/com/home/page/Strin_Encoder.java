package com.home.page;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Strin_Encoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letters = "aaabbbbccceeeaaadasdfew";
		int count = 0;

		Set<Character> letter = new HashSet<>();

		for (int i = 0; i <= letters.length() - 1; i++) {
			letter.add(letters.charAt(i));
		}

		List<Character> revised = new ArrayList<Character>(letter);
		
		System.out.println(revised);

		System.out.println(revised.get(1));

		for (int i = 0; i < revised.size(); i++) {

			for (int j = 0; j < letters.length(); j++) {

				if (revised.get(i) == letters.charAt(j)) {
					count++;

				}

			}

			System.out.print(revised.get(i) + "" + count+ "-" );
			count = 0;

		}

		// System.out.println(letter.);

		// Object[] revised=letter.toArray();

//		StringBuffer sb = new StringBuffer(letters);
//		System.out.println(letters.length()-1);
//		for (int i = 0; i < letters.length() - 1; i++) {
//
//			// System.out.println(letters.charAt(i));
//			if (i != letters.length() - 1){
//				if (letters.charAt(i + 1) == letters.charAt(i)) {
//					count++;
//				}
//
//				if (letters.charAt(i + 1) != letters.charAt(i)) {
//					count++;
//					//Thread td=new Thread();
//					System.out.print(letters.charAt(i - 1) + "" + count);
//					count = 0;
//				}
//
//			}
//			if (i == letters.length()-1) {
//				if (letters.charAt(i - 1) == letters.charAt(i)) {
//					count++;
//					System.out.print(letters.charAt(i - 1) + "" + count);
//					count=0;
//				}
//				if (letters.charAt(i-1) != letters.charAt(i)) {
//					count++;
//					System.out.print(letters.charAt(i - 1) + "" + count);
//					//count=0;
//				}
//				
//
//			}
//
//		}
//		// System.out.println(letters);
//
	}

}
