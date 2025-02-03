/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flowers {

	String flowerName;
	String flowerColor;
	
	Flowers(String Name, String color) {
		this.flowerName = Name;
		this.flowerColor = color;
	}
	
	void display() {
		System.out.println("Flower Name:"+flowerName);
		System.out.println("Flower Color:"+flowerColor);
	}
	public static void main(String[] args) {
		Flowers flowerobject1 = new Flowers("Jasmine","White");
		Flowers flowerobject2 = new Flowers("MarieGold","Yellow");
		flowerobject1.display();
		flowerobject2.display();

	}

}
