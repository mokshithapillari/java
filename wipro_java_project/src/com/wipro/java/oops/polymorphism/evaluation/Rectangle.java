package com.wipro.java.oops.polymorphism.evaluation;

/**
 * Parent Class = Shape
 * Child Class = Rectangle
 */
public class Rectangle extends Shape{
	
	//Redefining the parent methods and adding additional functionality to the methods in child class
	void showdetails() {
		System.out.println("Name: "+getName());
		System.out.println("Color: "+getColor());
		System.out.println("Sides: "+getNoOfSides());
	}
	
	void draw() {
		System.out.println("Drawing a Rectangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Rectangle(); //creating child class object
		shape.setName("Rectangle");
		shape.setColor("Red");
		shape.setNoOfSides(4);
		shape.showdetails();
		shape.draw();
	}

}
