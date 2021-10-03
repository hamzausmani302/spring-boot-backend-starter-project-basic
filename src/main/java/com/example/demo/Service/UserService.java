package com.example.demo.Service;

import java.util.List;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CustomerDAO;
import com.example.demo.Model.Customer;
import com.example.demo.Model.Student;
import com.example.demo.Model.User;
@Service
public class UserService {
	
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public List<Customer> get_all() {
		return customerDAO.findAll();
	}
	
	public String add_customer(Customer cust) {
		try {
			Customer record = customerDAO.save1(cust);
			
		}catch(Exception e) {
			return e.getMessage();
		}
		
		return "added";
		
	}
	
	public void updateCustomer(long id) {
		// TODO Auto-generated method stub
	
	}

	public Customer get_One(long id) {
		// TODO Auto-generated method stub
		Integer i = (int)id;
		Customer c = customerDAO.getById(i);
	
		return c; 
	
	}

}
