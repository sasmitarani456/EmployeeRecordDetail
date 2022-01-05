package com.hutech.employeeDetails.service;

import java.util.List;
import java.util.Optional;

import com.hutech.employeeDetails.entity.EmployeeDetail;

public interface IEmployeeDetailService {
	
	List<EmployeeDetail> getAllEmployeeDetails();
	Optional<EmployeeDetail> getEmployeeDetailById(Long id);
	void addEmployeeDetails(EmployeeDetail emp);
	void UpdateEmployeeDetail(Long id, EmployeeDetail employeedetails);
	void deleteEmployeeDetail(long id);

}
