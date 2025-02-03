package com.wipro.java.oops.polymorphism;

public class Toyota extends Car{
	//redefining the parent class method in child class
	public void showdetails() {
		System.out.println("Brand Name: "+getBrandName());
		System.out.println("Model: "+getModel());
		System.out.println("Seater: "+getNoOfSeats());
	}
	
	public static void main(String args[]) {
		Car car = new Toyota();
		car.setBrandName("Toyota");
		car.setModel("F4");
		car.setNoOfSeats(5);
		car.showdetails(); //accessing the method
	}
}
