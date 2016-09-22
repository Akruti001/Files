package com.Felight.collection_sort;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary= " + salary  +  " , Gender= " +  gender +  "]";
	}

	public Employee() {
	}

	public Employee(int id, String name, double salary , String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender  = gender;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int compareTo(Employee emp) {
		if(this.id < emp.id)
			return -1;
		else if(this.id > emp.id)
			return 1;
		else			
		return 0;
	}

}
