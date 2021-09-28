package com.example.demo.DAO;

import java.util.List;

import java.util.UUID;

import com.example.demo.Model.User;

public interface UserDAO {
	
	public List<User> get_all_records();
	public int insert(UUID id , User user );
	default int insert(User user) {
		UUID id = UUID.randomUUID();
		return this.insert(id, user);
	}
	public User selectById(UUID id);
	public String DeleteById(UUID id);
	public String UpdateById(UUID id, User user);
		
	
}
