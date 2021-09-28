package com.example.demo.DAO;
import java.sql.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.DAO.UserDAO;
import com.example.demo.Model.User;
@Repository("fakeDAO")
public class FakeUserDAO {
	
//	@Override
//	public User selectById(UUID id) {
//		for(User user : DB) {
//			if(user.getID() .equals(id)) {
//				return user;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public String DeleteById(UUID id) {
//		// TODO Auto-generated method stub
//		for(int i = 0 ; i < DB.size() ; i++) {
//			if(DB.get(i).getID() .equals(id)  ) {
//				DB.remove(i);
//				return "removed";
//			}
//		}
//		return "not found";
//	}
//
//	@Override
//	public String UpdateById(UUID id, User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static List<User> DB = new ArrayList<User>();
//	
//	public FakeUserDAO() {
//		DB.add(new User(UUID.randomUUID() , "ali" , "ali" , "dwadwa" , "dwaedwawa" , "dwadwadwa" , "address" , "cpontaxct" , "02-03-2012"));
//	}
//
//	@Override
//	public int insert(UUID id, User user) {
//		// TODO Auto-generated method stub
//		DB.add(new User(id , user.getFirstName() , user.getLastName() , user.getImageUrl() , user.getEmail() , user.getPassword() , user.getAddress() , user.getContact() , user.getCreatedAt()));
//		return 0;
//	}
//
//	@Override
//	public List<User> get_all_records() {
//		// TODO Auto-generated method stub
//		return DB;
//	}
//	
	
	
}
