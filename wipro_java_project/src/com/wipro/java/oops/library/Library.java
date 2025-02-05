package com.wipro.java.oops.library;

public abstract class Library {
	//abstract method implemented
	public abstract void getinfo();
	
	private String title;
	private float price;
	private int pages;
	private int issueNumber;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	//parent class method used for polymorphism
	public void read() {
        System.out.println("Reading library Items");
    }
}
