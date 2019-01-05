package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.util.EmployeeDatabase;

public class EmployeeService {

	public int getAgeForEmployee(String name){
        return EmployeeDatabase.getEmployee(name).getAge();
    }

    public String getDepartmentForEmployee(String name){
        return EmployeeDatabase.getEmployee(name).getDepartment();
    }

    public double getSalaryForEmployee(String name){
        return EmployeeDatabase.getEmployee(name).getSalary();
    }
    
    public Employee getEmployeeData(String name){
     return EmployeeDatabase.getEmployeeData(name);
    }
    
    public String getAllEmployees(){
        List<Employee> Employees = EmployeeDatabase.list();
        StringBuilder result = new StringBuilder();

        for(Employee employee : Employees){
            result.append(employee.getName() + " ");
        }
        return result.toString();
    }
}
