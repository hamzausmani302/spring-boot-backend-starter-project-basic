package com.example.demo.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService service;
	
	@GetMapping("/topics")
	public List<Topic> getTopics() {
			
			return service.getAllTopics();
	}
	
	@PostMapping("topic")
	public void addTopic(@RequestBody String name,@RequestBody String id,@RequestBody String desc) {
		 service.addTopic(name , id,  desc);
		
		
	}
	
	@GetMapping("/topics/{id}")
	public Topic get_a_topic(@PathVariable String id) {
		return service.getTopic(id);
	}
	
}
