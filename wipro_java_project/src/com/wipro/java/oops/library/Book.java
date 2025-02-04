package com.wipro.java.oops.library;

public class Book extends Library{
	
	@Override
	public void getinfo() {
		// TODO Auto-generated method stub
		System.out.println("Book: " + getTitle() + " with price " + getPrice() + ", " + getPages() + " pages.");
	}
	
	public void read() {
        System.out.println("Reading library Item: "+getTitle());
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book = new Book();
		book.setTitle("Atomic Habits");
		book.setPrice(300f);
		book.setPages(230);
		book.getinfo();
		book.read();
	}

}
