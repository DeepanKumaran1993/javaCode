package com.home.page;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dat=new Date();
		System.out.println(dat.getMonth());
		Map<Integer,String> month=new HashMap<Integer, String>();
		month.put(1, "jan");
		month.put(2,"Feb");
		System.out.println(month.get(2));
		
		
		
		
	}

}

public record
