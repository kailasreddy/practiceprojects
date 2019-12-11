package com.example.repositories;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.entities.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

	List<Employee> findAllByDateOfBirth( @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateOfBirth);
}
