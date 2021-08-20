package com.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Employee;
import com.springdemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class MyRestController {

	// autowire the CustomerService
	@Autowired
	private EmployeeService employeeService;
	
	// add mapping for GET /customers
	@GetMapping("/employees")
	public List<Employee> getEmployee() {
		
		return employeeService.getEmployee();
		
	}

	// add mapping for POST /customers  - add new customer
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		
		
		theEmployee.setId(0);
		
		employeeService.saveEmployee(theEmployee);
		return theEmployee;
	}
	
	@PostMapping("/employeeLogin")
	
	public String checkLogin()
	{
		int flag=0;
		List<Employee> employee=employeeService.getEmployee();
		String fromEmail="GT9675@gmail.com";
		String formPassword="1234";
		for(Employee e:employee)
		{
			String email=e.getEmail();
			String password=e.getPassword();
			if(fromEmail.equalsIgnoreCase(email) && formPassword.equals(password))
			{
				flag=1;
				System.out.println("Welcome");
				return "";
			}
		
			
		}
		if(flag==1)
		{
			System.out.println("User SuccessFully Verified");
		}
		else
		{
			System.out.println("User Not Verified");
		}
		return null;
	}
	
		
	
}


















