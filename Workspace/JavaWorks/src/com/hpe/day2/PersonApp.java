package com.hpe.day2;

public class PersonApp {
	public static void main(String[] args) {
		Person p1 = new Person();

		p1.setPId(101);
		p1.setPName("Magesh Rajarao");
		p1.setIncome(23000);

		/* p1.display(); */
		
		System.out.println(p1);
		// p1.toString() 
	}
}
