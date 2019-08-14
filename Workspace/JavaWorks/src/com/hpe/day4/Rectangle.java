package com.hpe.day4;

public class Rectangle extends Square implements IFigure{

	private int bre; 
	 
	
	public Rectangle(int len, int bre) {
		super(len);
		this.bre = bre; 
	}


	@Override
	public void area() {
		System.out.println("Area Of Rectangle " + 
				(bre * getLen()));
	}

	
	
}
