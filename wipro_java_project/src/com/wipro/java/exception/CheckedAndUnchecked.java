package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedAndUnchecked {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader file = new FileReader("file.txt"); //file not exists
			
		}
		catch(Exception e) { //handling the checked exception
			System.out.println("checked Exception : "+e);
		}
		
		try {
			int output = 5/0;
		}
		catch (Exception e) {
			System.out.println("Unchecked Exception: "+e);
		}
	}

}
