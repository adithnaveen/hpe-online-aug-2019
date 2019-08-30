package com.hpe.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) {
		File file = new File("emps.txt");
		FileReader fr;
		BufferedReader  br = null; 
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr); 
			
			
			String line; 
			
			System.out.println("Data Read from file ");
			while((line  = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}