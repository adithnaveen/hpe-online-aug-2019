package com.hpe.day2;

public class VehicleApp {
	public static void main(String[] args) {
		Car car = new Car(); 
		car.move(); 
		car.stop();
		car.fuelCapacity(50); 
		
		System.out.println("========================================");

		Truck truck = new Truck(); 
		truck.move(); 
		truck.stop(); 
		truck.carrierCapacity(); 
	}
}
