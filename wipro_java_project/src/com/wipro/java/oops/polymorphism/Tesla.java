package com.wipro.java.oops.polymorphism;

public class Tesla extends Car{
	
	//redefining the parent class method in child class
	public void showdetails() {
		System.out.println("Brand Name: "+getBrandName());
		System.out.println("Model: "+getModel());
		System.out.println("Seater: "+getNoOfSeats());
	}
	
	public static void main(String args[]) {
		Car car = new Tesla();
		car.setBrandName("Tesla");
		car.setModel("F5");
		car.setNoOfSeats(4);
		car.showdetails(); 	//accessing the method
		
	}
}
