package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {

	@Override
	default List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
}