package com.example.controllers;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.entities.EmployeeDetails;
import com.example.repositories.EmployeeDetailsRepository;
import com.example.repositories.EmployeeRepository;
import com.example.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	
	@Autowired
    private EmployeeService employeeService;
	
	
	
	@GetMapping("/employees")
	public List<Employee> listOfEmployees()
	{
		List<Employee> emp=employeeRepository.findAll();
		return employeeRepository.findAll();
	}
	
	@PutMapping("/employee")
	public EmployeeDetails updateUser(@RequestBody EmployeeDetails user) {
		return employeeDetailsRepository.save(user);
	}
	
	
	@GetMapping("/employees/{emp_id}")
	public Optional<Employee> oneEmployee(@PathVariable Long emp_id)
	{
		
		Optional<Employee> e=employeeRepository.findById(emp_id);
             System.out.println(e.toString());
             return e;
	}
	
	@GetMapping("/employees/{emp_id}/{password}")
	public Employee oneEmployee(@PathVariable Long emp_id,@PathVariable String password)
	{
		return employeeService.validateEmployee(emp_id, password);
	}
	
	@GetMapping("/allEmployees")
	public List<EmployeeDetails> getAllEmployeeDetails()
	{
		return employeeService.getAllEmployees();
	}
	
	
	@DeleteMapping("/employee/{emp_id}")
	public  void deleteUser(@PathVariable Long emp_id) { 
		employeeDetailsRepository.deleteEmployeeDetails(emp_id);
		employeeRepository.deleteById(emp_id);
	}

}
