package com.example.spring.validation;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Users {
	@NotEmpty(message="name cannot be empty")
	public String name;
	@NotEmpty(message="email cannot be empty")
	@Email(message="email should be valid")
	public String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}