package com.example.demo.Topic;

public class Topic {
	private String id;
	
	public Topic() {
		
		
		
	}
	public Topic(String name , String id , String desc) {
		super();
		this.id = id;
		this.name=  name;
		this.desc = desc;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private String name;
	private String desc;
	
	
}
