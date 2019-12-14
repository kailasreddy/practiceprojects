package com.example.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Employee;
import com.example.entities.EmployeeDetails;
import com.example.repositories.EmployeeDetailsRepository;
import com.example.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	
	
	public Employee validateEmployee(long id,String password)
	{
		Employee emp=employeeRepository.getOne(id);
		System.out.println(id);
		System.out.println(emp.getEmp_id());
		System.out.println(password);
		System.out.println(emp.getPassword());
		if(emp.getEmp_id()==id)
		{
			if(emp.getPassword().equals(password))
			{
				System.out.println("Success");
				return emp;
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}
	
	
	public List<EmployeeDetails> getAllEmployees()
	{
		List<EmployeeDetails> empDetails=employeeDetailsRepository.findAll();
		
		Iterator<EmployeeDetails> itr=empDetails.iterator();
		while(itr.hasNext())
		{
		    EmployeeDetails empld=itr.next();
		    Long   empId=  empld.getEmployee().getEmp_id();
		    
		       Employee emp=employeeRepository.getOne(empId);
		       if(emp.getRole().equals("Admin"))
		       {
		    	   itr.remove();
		       }
		}
		return empDetails;
		
	}

}
