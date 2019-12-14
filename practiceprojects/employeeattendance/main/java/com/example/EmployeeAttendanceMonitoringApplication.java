package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Employee;
import com.example.entities.EmployeeDetails;
import com.example.repositories.EmployeeDetailsRepository;
import com.example.repositories.EmployeeRepository;



@SpringBootApplication
public class EmployeeAttendanceMonitoringApplication  implements CommandLineRunner {
	
	
	
	 @Autowired
	 private  EmployeeRepository employeeRepository;
	 @Autowired
	 private EmployeeDetailsRepository employeeDetailRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAttendanceMonitoringApplication.class, args);
	}
	
	
	@Override
	public void run(String args[]) throws Exception{
		
		{
			
//			Employee emp=new Employee("kailas","Admin");
//			EmployeeDetails empd=new EmployeeDetails("abcd", "male",12l, "123456789",emp);
//			employeeDetailRepository.save(empd);
//			
		}
	}

}
