package com.ibm;

public class Employee {
	private String fullName;
	private String salary;

	public Employee() {
		System.out.println("Singleton Bean Instantiated, " + "Create Every type new Object ....!!");
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", salary=" + salary + "]";
	}
}
