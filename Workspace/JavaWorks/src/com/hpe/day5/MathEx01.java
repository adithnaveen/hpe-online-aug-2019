package com.hpe.day5;

public class MathEx01 {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.random());

		int randomValue = (int) (Math.random() * 20);
		
		System.out.println(randomValue);

		System.out.println(Math.floor(34.56));
		System.out.println(Math.ceil(34.56));

		System.out.println(Math.round(2345.545));
	}
}