/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent Class = Employee
 * Child Class = ProjectLead
 * Extends = Keyword
 */
public class ProjectLead extends Employee{

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		//ProjectLead projectLead = new ProjectLead();
		//ProjectLead projectLead1 = (ProjectLead) new Employee(); //object casting
		//super class = child class
		
		//Child object is instantiated from child constructor
		//Child Class consumes the properties and behaviors of Parent class
		Employee employee = new ProjectLead();
		employee.setEmployeeID(1234);
		employee.setEmployeeName("Mokshitha");
		employee.setEmailID("mokshigiri@gmail.com");
		employee.setSalary(40000f);
		
		System.out.println("ProjectLead Details: ");
		System.out.println("Employee ID: "+employee.getEmployeeID());
		System.out.println("Employee Name: "+employee.getEmployeeName());
		System.out.println("Employee Email: "+employee.getEmailID());
		System.out.println("Employee Salary: "+employee.getSalary());
		
	}
	
}
