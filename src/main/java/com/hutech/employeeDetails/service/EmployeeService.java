package com.hutech.employeeDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hutech.employeeDetails.entity.EmployeeDetail;
import com.hutech.employeeDetails.exception.Exceptionn;
import com.hutech.employeeDetails.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeDetailService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDetail> getAllEmployeeDetails() {
		List<EmployeeDetail> employeeList = (List<EmployeeDetail>) employeeRepository.findAll();
		return employeeList;
	}
	
	@Override
	public Optional<EmployeeDetail> getEmployeeDetailById(Long id) {
		return employeeRepository.findById(id);
	}
	
	@Override
	public void addEmployeeDetails(EmployeeDetail emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void UpdateEmployeeDetail(Long id, EmployeeDetail employeedetails) {
		EmployeeDetail emp = employeeRepository.findById(id)
				.orElseThrow(() -> new Exceptionn("EmployeeDetail", "id", id));
		emp.setFirstName(employeedetails.getFirstName());
		emp.setLastName(employeedetails.getLastName());
		emp.setAge(employeedetails.getAge());
		emp.setDob(employeedetails.getDob());
		emp.setActiveflag(employeedetails.isActiveflag());
		employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployeeDetail(long id) {
		EmployeeDetail emp = employeeRepository.findById(id)
				.orElseThrow(() -> new Exceptionn("EmployeeDetail", "id", id));
		employeeRepository.delete(emp);		
	}

}
