package com.home.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Student implements Comparable<Student> {
	int emp_id;
	String name;

	Student(int empid, String name) {
		this.emp_id = empid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [emp_id=" + emp_id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.name.length() > o.name.length()) {
			return 1;
		} else {
			return -1;
		}

	}

}

public class Comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<String> name_sort = (o1, o2) -> o1.length() > o2.length() ? 1 : -1;

		List<String> name = new ArrayList<String>();
		name.add("max");
		name.add("ponting");
		name.add("ricky");
		name.add("tendulkar");

		Collections.sort(name, name_sort);
		System.out.println(name);

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "kumar"));
		list.add(new Student(4, "siva"));
		list.add(new Student(13, "vishnu"));
		list.add(new Student(2, "arjun"));
		list.add(new Student(5, "elan"));

		Collections.sort(list);

		for (Student stu : list)
			System.out.println(stu.toString());

		Outer_Class obj = new Outer_Class();
		Outer_Class.Inner in = obj.new Inner();
		in.print();

	}

}

class Outer_Class {

	static int i = 90;

	class Inner {

		public void print() {

			System.out.println("in this inner class" + i);
		}

	}

}