package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repatable {

	public static void main(String[] args) {
		
		
		
		
//		int a=20;
//		int b=10;
//		
//		 a=a+b;
//		 b=a-b;
//		 a=b-a;
//		
//		 System.out.println(a+ "  "+ b);
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.hashCode()+ "  two hashcode of two string "+s2.hashCode()+" equals "+ (s1==s2));
		
		
		
		System.out.println("s1 == s2 is:" + s1 == s2);
	
		String str1 = "abcdABCDabcdABCD";
		
//		for(int i=0;i<str1.length();i++) {
//			if(str1.charAt(i)=='a') {
//				str1.charAt(i)="G";
//			}
//		}
	
		String str2=str1.replace('a', 'g');
		System.out.println(str2);
		number();
		
		
		
		
		
		
		
		
		
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println( s1 == s2);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		String test = "he has the entire team so we can get it later";

		boolean result = true;
		for (int i = 0; i < test.length(); i++) {

			for (int j = 0; j < test.length(); j++) {
				if (i != j) {
					if (test.charAt(i) == test.charAt(j)) {
						result = false;
						break;
					}
				}
			}
			if (result) {
				System.out.println(test.charAt(i));
			}

			result = true;
		}
		

		missingNumbers();
	}
	
	
	public static void number()
	{
		int n=5;
		for(int i=0,j=n-1;i<n;i++,j--) {
			System.out.println(i+""+j+" ");
		}
	}
	
	
	public static  void missingNumbers() {
		
		int u[]= {1,3,6,8,4};
		
		Arrays.sort(u);
		int size=u[u.length-1];
		//System.out.println(size);
		
		Set<Integer> missing=new HashSet<Integer>();
		for(Integer g: u)
			missing.add(g);
		
		
		for(int i=0;i<size;i++) {
			if(!missing.contains(i)) {
				System.out.println("Missing numbers is"+ i);
			}
		}
		
		
//		for(Integer i:u)
//			System.out.println(i);
//		
	}

}
