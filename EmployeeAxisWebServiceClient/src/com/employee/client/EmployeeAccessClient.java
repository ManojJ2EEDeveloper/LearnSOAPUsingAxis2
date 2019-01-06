package com.employee.client;

import com.employee.service.EmployeeServiceStub;
import com.employee.service.EmployeeServiceStub.Employee;

public class EmployeeAccessClient {

	public static void main(String[] args) throws Exception {
		EmployeeServiceStub stub = new EmployeeServiceStub();
		
		//GET AGE OF AN EMPLOYEE
		EmployeeServiceStub.GetAgeForEmployee request
					= new EmployeeServiceStub.GetAgeForEmployee();
		request.setName("Rahul");
		EmployeeServiceStub.GetAgeForEmployeeResponse response = 
							stub.getAgeForEmployee(request);
		int getAge = response.get_return();
		System.out.println("Age :" + getAge);
		
		//GET EMPLOYEE OBJECT
		EmployeeServiceStub.GetEmployeeData requestData
					= new EmployeeServiceStub.GetEmployeeData();
		requestData.setName("Sachin");
		EmployeeServiceStub.GetEmployeeDataResponse res
					= stub.getEmployeeData(requestData);
		Employee emp = res.get_return();
		System.out.println("ID: " + emp.getAge());
		System.out.println("DEPARTMENT: " + emp.getDepartment());
		System.out.println("NAME: " + emp.getName());
		System.out.println("SALARY: " + emp.getSalary());
	}

}
