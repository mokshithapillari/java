package com.wipro.java.oops.polymorphism;

public class Car {
	private String brandName;
	private String Model;
	private int noOfSeats;
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public void showdetails() {
		System.out.println("Brand: "+getBrandName()+" Model: "+getModel()+"Seater: "+getNoOfSeats());
	}
}
