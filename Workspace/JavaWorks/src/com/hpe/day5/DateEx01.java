package com.hpe.day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
		Date date = new Date(); 
//		java.sql.Date date1 = new java.sql.Date(2019, 8, 19); 
		
		System.out.println(date);
		
		SimpleDateFormat sft = 
				new SimpleDateFormat("E yy-MMMM ss"); 
		
		System.out.println("Date is " + sft.format(date));
		
//		System.out.println(date1);
	}
}