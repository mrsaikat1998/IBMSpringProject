package com.ibm;

public class Employee {
	private int id;
	private String name;
	private String salary;

	private Address parmanentAddress;
	private Address currentAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Address getParmanentAddress() {
		return parmanentAddress;
	}

	public void setParmanentAddress(Address parmanentAddress) {
		this.parmanentAddress = parmanentAddress;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",\n parmanentAddress="
				+ parmanentAddress + ",\n currentAddress=" + currentAddress + "]";
	}

}
