package com.hpe.day10;

import java.io.File;

public class FileOperationEx02 {
	public static void main(String[] args) {
		File file = new File("myfolder");
		
		String files [] = file.list();
		
		for(String temp : files) {
			File f = new File(file, temp);  
			if(!f.isFile()) {
				System.out.println("Name is " + temp);
			}
		}
		
		System.out.println("Programming ended ");
	}
}
