package com.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springdemo.entity.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	public List<Employee> getEmployees() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee",
											Employee.class);
		
		// execute query and get result list
		List<Employee> employee = theQuery.getResultList();
		
	
		// return the results		
		return employee;
	}

	
	public void saveEmployee(Employee theEmployee) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer
		currentSession.saveOrUpdate(theEmployee);
		
	}




}











