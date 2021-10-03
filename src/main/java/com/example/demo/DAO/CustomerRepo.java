package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Student;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
