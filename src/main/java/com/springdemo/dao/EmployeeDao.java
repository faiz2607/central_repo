package com.springdemo.dao;

import java.util.List;

import com.springdemo.entity.Employee;;

public interface EmployeeDao {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

		
}
