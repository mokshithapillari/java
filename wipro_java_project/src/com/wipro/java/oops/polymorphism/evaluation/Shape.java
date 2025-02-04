package com.wipro.java.oops.polymorphism.evaluation;


/**
 * Parent class = Shape
 * Implementing polymorphism by overriding the parent class methods in child class
 * 
 */
public class Shape {
	
	String color;
	String Name;
	int noOfSides;
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getNoOfSides() {
		return noOfSides;
	}


	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}

	
	
	void draw() {
		System.out.println("Drawing a Shape");
	}
	
	void showdetails() {
		System.out.println("Name: "+getName()+" Color: "+getColor()+"Sides: "+getNoOfSides());
	}
}
