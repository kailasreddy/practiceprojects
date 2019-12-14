package com.example.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ED_ID", unique = true, nullable = false)
    private Long edId;
    private String address;
    
    private String gender;
 
    @Column(name="YEARS_OF_SERVICE")
    private Long yearsOfService;
 
    @Column(name="BANK_ACCOUNT")
    private String bankAccount;
    
    @OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name = "emp", referencedColumnName = "emp_id")
    private Employee employee;

	public EmployeeDetails( String address, String gender, Long yearsOfService, String bankAccount) {
	
		this.address = address;
		this.gender = gender;
		this.yearsOfService = yearsOfService;
		this.bankAccount = bankAccount;
	}

	public Long getEdId() {
		return edId;
	}

	public void setEdId(Long edId) {
		this.edId = edId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(Long yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeDetails() {
		super();
	}

	public EmployeeDetails(String address, String gender, Long yearsOfService, String bankAccount, Employee employee) {
		super();
		this.address = address;
		this.gender = gender;
		this.yearsOfService = yearsOfService;
		this.bankAccount = bankAccount;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [edId=" + edId + ", address=" + address + ", gender=" + gender + ", yearsOfService="
				+ yearsOfService + ", bankAccount=" + bankAccount + ", employee=" + employee + "]";
	}
    
    
}
