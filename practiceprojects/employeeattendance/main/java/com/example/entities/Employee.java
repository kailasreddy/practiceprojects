package com.example.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Employee {
	@Id
	@NotNull
	@GeneratedValue
	@Column(unique = true)
	Long emp_id;
	@NotEmpty
    String password;
	@NotEmpty
	String role;
	
	 
	
//	@OneToOne(fetch = FetchType.EAGER, mappedBy = "employee", cascade = CascadeType.ALL)
//	private EmployeeDetails empDetails;
	public Employee(@NotEmpty String password, @NotEmpty String role, EmployeeDetails empDetails) {
		super();
		this.password = password;
		this.role = role;
	
	}
	public Employee(@NotEmpty String password, @NotEmpty String role) {
		super();
		this.password = password;
		this.role = role;
	}
	public Employee(@NotNull Long emp_id, @NotEmpty String password, @NotEmpty String role) {
		super();
		this.emp_id = emp_id;
		this.password = password;
		this.role = role;
	}
	public Employee() {
		super();
	}
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	

	
	
	
}
	