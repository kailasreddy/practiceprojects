package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
	@NotBlank(message="please enter your email")
	@Email(message="please enter a valid email")
	@Id
	private String email;
	@NotBlank(message="please enter your name")
	@Size(min=2,message="your name must be wrong")
	private String name;
	@NotBlank(message="please enter your password")
	@Size(min=4,message="Invalid password enter atleast 4 characters")
	private String password;
	@NotBlank(message="please enter your age")
	@Pattern( regexp = "[\\d]{2}", message="invalid age")
	private String age;
	@NotBlank(message="please enter your phone Number")
	@Pattern( regexp = "[\\d]{10}", message="invalid phone number")
	private String phoneNum;
	
	public User() {
	
	}
	public User(String email, String name, String password, String age, String phoneNum) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	

}
