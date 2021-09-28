package com.example.demo.Model;

import java.sql.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private UUID ID;
	private String firstName;
	private String lastName;
	private String ImageUrl;
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	private String password;
	private String address;
	private String contact;
	private String CreatedAt;
	
	public User(
			
			@JsonProperty("id") UUID ID ,
			@JsonProperty("firstname") String firstName,
			@JsonProperty("lastname") String lastName,
			@JsonProperty("imageurl") String ImageUrl,
			@JsonProperty("email") String email , 
			@JsonProperty("password") String password,
			@JsonProperty("address") String address,
			@JsonProperty("contact") String contact,
			@JsonProperty("date") String string
			
			) 
	{
		this.address = address;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ImageUrl = ImageUrl;
		this.CreatedAt = string;
	}

	 

	public UUID getID() {
		return ID;
	}

	public void setID(UUID iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public String getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}
	
	
	
	
}
