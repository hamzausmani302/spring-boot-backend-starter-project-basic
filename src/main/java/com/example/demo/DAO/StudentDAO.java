package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {
	
	
	
}