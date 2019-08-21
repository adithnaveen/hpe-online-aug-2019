package com.hpe.day7;

import java.util.Set;
import java.util.TreeSet;

public class SetEx03 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		System.out.println(set.add("Jeffery"));
		System.out.println(set.add("Arun"));
		System.out.println(set.add("Tze Wei"));
		System.out.println(set.add("Miguel"));
		System.out.println(set.add("Tze Wei"));
		set.add("Charlie");

		System.out.println("--------------------------------");
		for (String temp : set) {
			System.out.println(temp);
		}

	}
}
