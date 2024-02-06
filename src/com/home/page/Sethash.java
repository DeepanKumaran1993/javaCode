package com.home.page;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Sethash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> name=new TreeSet();
		name.add("jessy");
		name.add("rebecca");
		name.add("john");
		name.add("paul");
		name.add("victoria");
		System.out.println(name);
		
		
		Map<String, Integer> salary=new HashMap<>();
		salary.put("ganesh", 19886);
		salary.put("hariharen", 328123);
		
		System.out.println(salary);
		System.out.println(salary.get("ganesh"));
		System.out.println(salary.replace("ganesh", 100000));
		System.out.println(salary);
		
		Generic<Integer> epson=new Generic<>();
		epson.printable(9000);
		epson.print();
		
	}

}
