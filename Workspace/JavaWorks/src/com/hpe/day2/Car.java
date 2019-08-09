package com.hpe.day2;


// this class call car has fuelCapacity() + 
// move and stop (parent) 
public class Car extends Vehicle{
	
	// if you dont have the default constructor then 
	// the compiler at the compilation time will create 
	// the constructor for you 
	public Car() {
		super(); 
		System.out.println("Car creation in progress... ");
	}
	
	public void fuelCapacity(int fuelCapacity) {
		System.out.println("Car has Fuel Capacity of " +fuelCapacity);
	}
}
