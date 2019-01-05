package com.employee.entity;

public class Employee {
	
	String Name;
	String Department;
	int Age;
	double Salary;
 
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Department=" + Department + ", Age=" + Age + ", Salary=" + Salary + "]";
	}
	
	public Employee(String name, String department, int age, double salary) {
		super();
		Name = name;
		Department = department;
		Age = age;
		Salary = salary;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
}
