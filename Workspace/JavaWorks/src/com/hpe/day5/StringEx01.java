package com.hpe.day5;

public class StringEx01 {
	public static void main(String[] args) {
		String str = new String("Java Training");

		System.out.println(str.substring(0, 4));

		System.out.println(str.indexOf("Tra"));

		boolean equalsTest = str.equalsIgnoreCase("java Training");
		System.out.println(equalsTest);

		System.out.println(str.charAt(0));

		System.out.println(str.concat(" is Awesome"));
		
		StringBuffer sb = new StringBuffer(str); 
		
		sb.insert(0, "Hi all all again "); 
		System.out.println(sb);
		System.out.println(sb.length());
		
		System.out.println(sb.indexOf("all"));
		System.out.println(sb.lastIndexOf("all"));
		
		System.out.println(sb.reverse());
		

		
	}
}
