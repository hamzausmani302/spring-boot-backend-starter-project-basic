package com.example.demo;

import java.util.Collections;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class StarterproojectApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbc;
	
	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(StarterproojectApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8083"));
	        app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		final String query = "CREATE TABLE CUSTOMERS(ID INT PRIMARY KEY, firstname VARCHAR(20) NOT NULL , "
				+ "lastname VARCHAR(20) NOT NULL, email VARCHAR(20) NOT NULL , password VARCHAR(20) NOT NULL ,"
				+ "ADDRESS VARCHAR(40) , PHONENUMBER VARCHAR(11) , date DATE NOT NULL  )";
		jdbc.execute(query);
	}
	
	       
	         
	    
	
	
	
}
