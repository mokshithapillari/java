package com.wipro.java.exception;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 50;
		int number2 = 0;
		int result;
		try {
			result = number1/number2;
		}
		catch (Exception e){
			System.out.println(e.toString());
			
		}
		
		finally {
			int sum= number1+number2;
			System.out.println("Result is :"+sum);
		}
		System.out.println("My Exception is being handled");
	}

}
