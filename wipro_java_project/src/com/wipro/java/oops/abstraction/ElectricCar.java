package com.wipro.java.oops.abstraction;

public class ElectricCar extends Car{

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine strated for ElectricCar");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving Started");
	}
	public static void main(String args[]) {
		ElectricCar electriccar = new ElectricCar(); //object creation for child class
		electriccar.startEngine(); // accessing child class methods
		electriccar.drive();
	}
}
