package com.example.demo.Service;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.AccessService;
import com.example.demo.DAO.FakeUserDAO;
import com.example.demo.DAO.StudentDAO;

import com.example.demo.DAO.UserDAO;
import com.example.demo.Model.Student;
import com.example.demo.Model.User;
@Service
public class UserService {
	
	
	@Autowired
	private AccessService userDAO;
	public List<Student> get_all() {
		return userDAO.findAll();
	}
	
	

}
