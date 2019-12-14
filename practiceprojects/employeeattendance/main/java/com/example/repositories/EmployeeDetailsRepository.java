package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Employee;
import com.example.entities.EmployeeDetails;


public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Long>{

//   @Query(value = "DELETE E FROM EMPLOYEE_DETAILS E WHERE E.EMPLOYEE.EMP_ID=?1",nativeQuery = true)
//	public boolean deleteOneEmployeeDetails(long employeeId);
	
	//long deleteByEmployee(Employee employee);
	@Transactional
    @Modifying 
	@Query("delete from EmployeeDetails e where e.employee.emp_id=:emp_id")
	void deleteEmployeeDetails(@Param("emp_id") Long emp_id);
	
	
}
