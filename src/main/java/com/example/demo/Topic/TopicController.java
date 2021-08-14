package com.example.demo.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@GetMapping("/topics")
	public List<Topic> getTopics() {
			return Arrays.asList(
					new Topic("Cybersecuirty" , "221" , "completed"),
					new Topic("AI" , "223" , "completed")
					
					
					);
	}
}
