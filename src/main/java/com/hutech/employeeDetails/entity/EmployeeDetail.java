package com.hutech.employeeDetails.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_detail")
public class EmployeeDetail {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	private Date dob;
	private boolean activeflag;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isActiveflag() {
		return activeflag;
	}
	public void setActiveflag(boolean activeflag) {
		this.activeflag = activeflag;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeDetail(Long id, String firstName, String lastName, int age, Date dob, boolean activeflag) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.activeflag = activeflag;
	}

	public EmployeeDetail() {		
	}
	@Override
	public String toString() {
		return "Employeentity [id=" + id + ", fname=" + firstName + ", lname=" + lastName + ", eage=" + age + ", dob=" + dob
				+ ", activeflag=" + activeflag + "]";
	}
	
		
}
