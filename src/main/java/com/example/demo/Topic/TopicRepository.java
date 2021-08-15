package com.example.demo.Topic;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String>{

	List<Topic> findAll();

	void save(Topic topic);
	
}
