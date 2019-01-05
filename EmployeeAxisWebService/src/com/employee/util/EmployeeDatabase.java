package com.employee.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.employee.entity.Employee;

public class EmployeeDatabase {

		private static List<Employee> employees;
		
	    public static List<Employee> list(){
	        return employees;
	    }

	    public static Employee getEmployee(String name){
	        Iterator<Employee> iterator = employees.iterator();
	        while (iterator.hasNext()){
	         Employee Employee = (Employee) iterator.next();
	            if (Employee.getName().equals(name)){
	                return Employee;
	            }
	        }
	        return null;
	    }

	    public static Employee getEmployeeData(String name){
	        Iterator<Employee> iterator = employees.iterator();
	        while (iterator.hasNext()){
	         Employee Employee = (Employee) iterator.next();
	            if (Employee.getName().equals(name)){
	                return Employee;
	            }
	        }
	        return null;
	    }
	    
	    static {
	     initEmployees();
	    }

	    static void initEmployees(){
	     employees = new ArrayList<Employee>();
	     employees.add(new Employee("Rahul", "HR", 25, 15000.00));
	     employees.add(new Employee("Zuzana", "Sales", 32, 48000.00));
	     employees.add(new Employee("Martin", "Engineering",22, 32000.00));
	     employees.add(new Employee("Sachin", "Engineering",25, 65000.00));
	     employees.add(new Employee("Ondrej", "Operations",26, 25000.00));
	    }
}
