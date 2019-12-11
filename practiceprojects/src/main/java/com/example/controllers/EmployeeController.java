package com.example.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employee")
	public Employee createUser(@RequestBody Employee user) {
		return employeeRepository.save(user);
     }
	
//	@GetMapping("/date")
//	public List<Employee> getEmployees(@RequestParam("d") @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date date)
//	{
//		return employeeRepository.findAllByDateOfBirth(date);
//	}
	
	@GetMapping("/employees/{date}")
	public List<Employee> getEmployees(@PathVariable @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date date)
	{
		return employeeRepository.findAllByDateOfBirth(date);
	}
	
	
}
