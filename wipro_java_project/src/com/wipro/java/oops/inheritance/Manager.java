/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent Class = Employee
 * Child Class = Manager
 * Extends = Keyword
 */
public class Manager extends Employee{

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		
		//Child object is instantiated from child constructor
		//Child Class consumes the properties and behaviors of Parent class
		Employee employee = new Manager();
		employee.setEmployeeID(1196);
		employee.setEmployeeName("Siddarth");
		employee.setEmailID("siddarth1196@gmail.com");
		employee.setSalary(45000f);
		
		System.out.println("Manager Details: ");
		System.out.println("Employee ID: "+employee.getEmployeeID());
		System.out.println("Employee Name: "+employee.getEmployeeName());
		System.out.println("Employee Email: "+employee.getEmailID());
		System.out.println("Employee Salary: "+employee.getSalary());
	}
}
