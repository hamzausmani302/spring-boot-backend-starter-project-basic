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
		final String query = "SELECT * FROM CUSTOMER";
		jdbc.execute(query);
	}
	
	       
	         
	    
	
	
	
}
