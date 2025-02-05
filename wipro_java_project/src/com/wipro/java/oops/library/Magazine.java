package com.wipro.java.oops.library;

public class Magazine extends Library{
	
	public void getinfo() {
		// TODO Auto-generated method stub
		System.out.println("Magazine: " + getTitle() + " with price " + getPrice() + ", " + "Issue number "+getIssueNumber());
	}
	
	public void read() {
        System.out.println("Reading library Item: "+getTitle());
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library book = new Magazine();
		book.setTitle("National Geographic");
		book.setPrice(100f);
		book.setIssueNumber(450);
		book.getinfo();
		book.read();
	}

}
