package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer;

public class Comparator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data> ledger = new ArrayList<Data>();
		ledger.add(new Data(21, "vinay", "san francissco"));
		ledger.add(new Data(423, "shanker", "collrado"));
		ledger.add(new Data(3484, "jay", "arizona"));
		ledger.add(new Data(1, "arun", "york"));
		ledger.add(new Data(4, "sen", "little Rock"));

		Double k=213.0;
		Double n=k/0.0;
	System.out.println(	n.isInfinite());
		
		
	
//		String j3="Hai";
//		String j1="hai";
//	System.out.println(	j3.compareTo(j1));
//		for (int j = 0; j < ledger.size(); j++) {
//
//			System.out.println(ledger.get(j));
//
//		}
//		Comparator com = Collections.reverseOrder(new SortBY());
		Collections.sort(ledger);
		System.err.println("after sorting in reverser order\n");
		for (int j = 0; j < ledger.size(); j++) {

			System.err.println(ledger.get(j));

		}

	}

}

class Data  implements Comparable<Data> {

	int emp_Id;
	String name, address;

	public Data(int emp_Id, String name, String address) {
		this.emp_Id = emp_Id;
		this.name = name;
		this.address = address;
	}

	public String toString() {

		return this.emp_Id + " " + this.name + " " + this.address;
	}

	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		if(this.name.length()<o.name.length()) 
			return 1;
		return -1;
		
	}
}

class SortBY implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		// TODO Auto-generated method stub
		return o1.emp_Id - o2.emp_Id;
	}

}
