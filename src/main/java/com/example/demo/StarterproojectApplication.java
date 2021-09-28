package com.example.demo;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class StarterproojectApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(StarterproojectApplication.class);
	        app.setDefaultProperties(Collections
	          .singletonMap("server.port", "8083"));
	        app.run(args);
	}
	  @Override
	    public void run(String... args) throws Exception {
	        String sql = "INSERT INTO students (id , name) VALUES (?, ?)";
	         
	        int result;
			try {
//				result = jdbcTemplate.update(sql, 2,  "usama");
//				 if (result > 0) {
//			            System.out.println("A new row has been inserted.");
//			        }
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
	       
	         
	    }
	
	
	
}
