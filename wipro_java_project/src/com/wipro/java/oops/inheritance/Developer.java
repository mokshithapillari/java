/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Employee
 * Child Class = Developer
 * Extends = Keyword
 */
public class Developer extends Employee{

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		
		//Child object is instantiated from child constructor
		//Child Class consumes the properties and behaviors of Parent class
		Employee employee = new Developer();
		employee.setEmployeeID(1195);
		employee.setEmployeeName("Srusti");
		employee.setEmailID("srusti1195@gmail.com");
		employee.setSalary(35000f);
		
		System.out.println("Developer Details: ");
		System.out.println("Employee ID: "+employee.getEmployeeID());
		System.out.println("Employee Name: "+employee.getEmployeeName());
		System.out.println("Employee Email: "+employee.getEmailID());
		System.out.println("Employee Salary: "+employee.getSalary());
	}
}
