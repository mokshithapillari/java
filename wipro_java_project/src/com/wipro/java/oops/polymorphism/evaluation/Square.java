package com.wipro.java.oops.polymorphism.evaluation;

/**
 * Parent class = Shape
 * Child Class = Square
 */
public class Square extends Shape{
	
	//Redefining the parent methods and adding additional functionality to the methods in child class
	void showdetails() {
		System.out.println("Name: "+getName());
		System.out.println("Color: "+getColor());
		System.out.println("Sides: "+getNoOfSides());
	}
	
	void draw() {
		System.out.println("Drawing a Square");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Square(); //creating child class object
		shape.setName("Square");
		shape.setColor("Black");
		shape.setNoOfSides(4);
		shape.showdetails();
		shape.draw();
	}

}
