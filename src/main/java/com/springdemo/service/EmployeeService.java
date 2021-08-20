package com.springdemo.service;

import java.util.List;

import com.springdemo.entity.Employee;


public interface EmployeeService {

	public List<Employee> getEmployee();

	public void saveEmployee(Employee theEmployee);
	
}
