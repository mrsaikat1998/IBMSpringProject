package com.ibm;

public class Employee {
	private int id;
	private String name;
	private String salary;
	private Address address;

	public Employee(int id, String name, String salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
