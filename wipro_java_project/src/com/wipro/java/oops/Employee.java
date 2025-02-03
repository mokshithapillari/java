/**
 * 
 */
package com.wipro.java.oops;

/**
 * No constructor
 * Getters have return value
 * Setters have no return value
 * properties are determined using private fields
 * values/behaviors are determined through setters
 * toString will convert the entire Employee class with properties and behaviors
 * POJO : plain old java object access through getter/setter
 * structure need to be same, Field should not be changed.
 * only attributes/values need to be changed that is why we are making setters/getters as public
 */

public class Employee {

//	private properties = structure
	private String employeeName; // This is the employeename
	private int employeeID; // This is employeeid
	private float salary;   //This is employee salary
	private String emailID; // This is employee email ID
	private boolean isTaxApplicable;
	
//	Below are getter and setter methods for each member variable
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeID=" + employeeID + ", salary=" + salary
				+ ", emailID=" + emailID + "]";
	}
	


}
