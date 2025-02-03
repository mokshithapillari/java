package com.wipro.java.oops.abstraction;

public class SportsCar extends Car{

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine started for sportscar");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving Started");
		
	}
	public static void main(String args[]) {
		SportsCar sportscar = new SportsCar(); //object creation for child class
		sportscar.startEngine(); // accessing child class methods
		sportscar.drive();
	}
}
