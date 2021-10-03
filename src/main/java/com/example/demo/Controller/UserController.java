package com.example.demo.Controller;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
@RequestMapping("api/v1/user")
@RestController
@CrossOrigin("*")
public class UserController {
	private final UserService userservice;
	@Autowired
	public UserController(UserService service) {
		this.userservice = service;
	}
	
	
	@GetMapping
	public List<Customer> getUsers(){
		return userservice.get_all();
		
	}
	
	@PostMapping(path="signup")
	public String addCustomer(@RequestBody Customer cust) {
		
		String result = userservice.add_customer(cust);
		
		return result;
		
	}
	
	@PostMapping(path="update/{id}")
	
	public String updateCustomerInfo(@PathVariable("id") long id) {
		userservice.updateCustomer(id);
		
		return Long.toString(id);
		
	}
	@PostMapping(path="{id}")
	@ResponseBody
	public Customer getCustomer(@PathVariable("id") long id) {
		System.out.print(id);
		Customer customer = userservice.get_One(id);
		
		return customer;
		
	}
}
