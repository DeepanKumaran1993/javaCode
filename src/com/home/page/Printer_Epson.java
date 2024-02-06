package com.home.page;
import java.util.ArrayList;
import java.util.List;

import com.home.page.*;
public class Printer_Epson {

	public static void main(String[] args) {
		
		Sethash n=new Sethash();
		
		List<String> name=new ArrayList();
		name.add("jack");
		name.add("Hendry");
		name.add("mack");
		
		
		
		
		Printable<String> ne=(e)-> {
				// TODO Auto-generated method stub
			System.out.println(e);
			};
		
			name.forEach(e->System.out.println(e));
	}
}
