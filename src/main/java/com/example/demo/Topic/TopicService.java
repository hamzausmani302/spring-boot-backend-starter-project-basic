package com.example.demo.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> list =Arrays.asList(new Topic("Cybersecuirty" , "221" , "completed"),
	                                      	new Topic("AI" , "223" , "completed"));
	
	
		public List<Topic> getAllTopics(){
			return list;
			
		}
			
		public Topic getTopic(String id) {
			for(Topic record : list) {
				if(record.getId().equals(id) ) {
					return record;
					
				}
			}
			
			return null;
		}
}
