package com.wipro.java.interface1;

/**
 * implementing the multiple interface
 */
public class Document implements Printable,Showable{
	
	//implementing the abstract methods
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print the document");
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show the document");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document d1 = new Document();
		d1.print();
		d1.show();
	}
}
