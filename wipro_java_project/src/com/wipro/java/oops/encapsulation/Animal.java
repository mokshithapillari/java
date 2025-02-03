package com.wipro.java.oops.encapsulation;

public class Animal {
	
	
	public Animal(String name, int age, String color) {
		super(); //calls the root parent class = object
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	//declaring private member variables
	private String name;
	private int age;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) { //setting condition
			this.age = age;
		}
		else {
			System.out.println("Age must be Positive");
		}
	}	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public static void main(String args[]) {
		Animal animal = new Animal("Dog",5,"Black");
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getColor());
		
		animal.setAge(10);
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getColor());
		
		animal.setAge(-5);
		
	}
	

}
