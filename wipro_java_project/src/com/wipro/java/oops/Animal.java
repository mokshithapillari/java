/**
 * 
 */
package com.wipro.java.oops;

/**
 * Creating Animal class with properties as private 
 */
public class Animal {

	/**
	 * creating setters and getters for private member varibles
	 * fields/properties should not be changed so making as private
	 * behaviour can be changed so making as public for getter/setter
	 */
	private String name; //Animal Name
	private String color; // Animal Color
	private float weight; // Animal Weight
	private int noOfLegs; // Number of Legs
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", weight=" + weight + ", noOfLegs=" + noOfLegs + "]";
	}
	

}
