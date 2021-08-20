package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.dao.EmployeeDao;
import com.springdemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	// need to inject customer dao
	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Transactional
	public List<Employee> getEmployee() {
		return employeeDao.getEmployees();
	}

	@Transactional
	public void saveEmployee(Employee theEmployee) {

		employeeDao.saveEmployee(theEmployee);
	}


}





